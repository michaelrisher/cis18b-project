
package towerdefenseproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Start of a MySQL API
 * @author Chris Keers
 */
public class MysqlCon {
	
	private static Connection con = null;
	private static Statement state = null;
	private static ResultSet result = null;
	private static PreparedStatement prep = null;
	private static Properties props = new Properties();
    private static FileInputStream file = null;
	private static String url;
	private static String username;
	private static String password;
	
	/**
	 * Looks for database settings stored in a file and creates a MySQL connection
	 */
	public static void dbOpen(){
		if (con==null){
			try {
				// Settings File
				file = new FileInputStream("private/database.properties");
				props.load(file);
				url = props.getProperty("db.url");
				username = props.getProperty("db.username");
				password = props.getProperty("db.password");
				// Connection Attempt
				con = DriverManager.getConnection(url,username,password);
				state = con.createStatement();
				result = state.executeQuery("SELECT VERSION()");
				if (result.next()) {
					// Log This later on just for the heck of it
					System.out.println("MySQL Notice: Connection established. Version: "+result.getString(1));
				}
			} catch (SQLException ex) {
				System.out.println("MySQL Notice: [Severe] "+ex);
			} catch (FileNotFoundException ex) {
				System.out.println("MySQL Notice: [Severe] "+ex);
			} catch (IOException ex) {
				System.out.println("MySQL Notice: [Severe] "+ex);
			}
		} else {
			System.out.println("MySQL Notice: The connection is already open, call to open new database connection ignored.");
		}
	}
	
	/**
	 * Will properly close down the MySQL connection
	 */
	public static void dbClose(){
		try {
			if (result!=null) {
				result.close();
				result = null;
			}
			if (state!=null) {
				state.close();
				state = null;
			}
			if (con!=null) {
				con.close();
				con = null;
				System.out.println("MySQL Connection closed.");
			}
		} catch (SQLException ex) {
			System.out.println("MySQL Error: There was trouble closing the database connection.");
		}
	}
	
	/**
	 * Creates a prepared MySQL statement
	 * <p>
	 * To create a proper prepared statement your query should use ? in 
	 * place of actual values. You will then need to use the appropriate
	 * .set on the return value prep to change the question marks to their
	 * actual values before executing the query.
	 * <p>
	 * If you do not plan on using .set on the returned value and instead
	 * want to immediately execute it, you may send a normal query.
	 * @param query A prepared SQL query with ? in place of actual values. Normal queries are still accepted though.
	 * @return 
	 */
	public static PreparedStatement query(String query){
		if (con!=null){
			try {
				prep = con.prepareStatement(query);
				return prep;
			} catch (SQLException ex) {
				System.out.println("MySQL Error: [Severe] "+ex);
			}
		} else {
			return null;
			// LOG ERROR, not connected
		}
		return null;
	}
	
	/**
	 * Count the amount of expected rows returned from a MySQL query
	 * <p>
	 * This function should only be called before you run a query where you will need to know 
	 * the specific amount of rows being returned or to check if simple 
	 * information exists in the database already, such as a username.
	 * <p>
	 * This function is a platform and environment independent solution but can be expensive on large queries.
	 * @param table	The table to look at in the database. If this is the only parameter it will count all rows in the table.
	 * @param par	This string is used as the SQL's WHERE clause. Format is: "color = '"+colorAnswer+"' AND age = '"+userAge+"'"
	 * @return 
	 */
	public static int numRows(String table,String par){
		if (con!=null){
			try {
				if (par.length()<=0){
					prep = con.prepareStatement("SELECT COUNT(*) FROM "+table);
				} else {
					prep = con.prepareStatement("SELECT COUNT(*) FROM "+table+" WHERE "+par);
				}
				result = prep.executeQuery();
				result.first();
				return result.getInt(1);
			} catch (SQLException ex) {
				System.out.println("MySQL Error: [Severe] "+ex);
			}
		} else {
			System.out.println("MySQL Error: Can not count rows, no database connection.");
			return 0;
		}
		return 0;
	}
}