/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenseproject;

import com.michael.api.Encoder;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Michael
 */
public class SignupWindow extends javax.swing.JFrame {

    /**
     * Creates new form SignupWindow
     */
    public SignupWindow() {
        initComponents();
		//todo test data cause im lazy
		usernameField.setText( "test" );
		emailField.setText( "test@w.w" );
		emailConfField.setText( "test@w.w" );
		passField.setText( "password" );
		passConfField.setText( "password" );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        createButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        emailConfField = new javax.swing.JTextField();
        emailConfLabel = new javax.swing.JLabel();
        passConfLabel = new javax.swing.JLabel();
        passConfField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create an Account");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login-logo.jpg"))); // NOI18N

        usernameField.setName("username"); // NOI18N
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameFieldKeyReleased(evt);
            }
        });

        userLabel.setText("Username");

        emailLabel.setText("Email");

        emailField.setName("email"); // NOI18N
        emailField.addKeyListener( new java.awt.event.KeyAdapter() {
			public void keyReleased( java.awt.event.KeyEvent evt ) {
				emailFieldKeyReleased( evt );
			}
		} );

        passLabel.setText( "Password" );

        passField.setName( "password" ); // NOI18N
        passField.addKeyListener( new java.awt.event.KeyAdapter() {
			public void keyReleased( java.awt.event.KeyEvent evt ) {
				passFieldKeyReleased( evt );
			}
		} );

        createButton.setText("Sign Up");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed( evt );
            }
        });

        loginButton.setText( "Have An Account" );
        loginButton.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				loginButtonActionPerformed( evt );
			}
		} );

        emailConfField.setName( "conf-email" ); // NOI18N
        emailConfField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailConfFieldKeyReleased(evt);
            }
        });

        emailConfLabel.setText("Confirm Email");

        passConfLabel.setText("Confirm Password");

        passConfField.setName("conf-password"); // NOI18N
        passConfField.addKeyListener( new java.awt.event.KeyAdapter() {
			public void keyReleased( java.awt.event.KeyEvent evt ) {
				passConfFieldKeyReleased( evt );
			}
		} );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createButton)
                        .addGap(102, 102, 102))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passConfLabel)
                            .addComponent(emailConfLabel)
                            .addComponent(passField)
                            .addComponent(emailField)
                            .addComponent(usernameField)
                            .addComponent(passLabel)
                            .addComponent(emailLabel)
                            .addComponent(userLabel)
                            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailConfField)
                            .addComponent(passConfField))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(userLabel)
                .addGap(18, 18, 18)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailLabel)
                .addGap(18, 18, 18)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailConfLabel)
                .addGap(18, 18, 18)
                .addComponent(emailConfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passLabel)
                .addGap(18, 18, 18)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passConfLabel)
                .addGap(18, 18, 18)
                .addComponent(passConfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(loginButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        this.dispose();
        new LoginWindow().setVisible( true );
    }//GEN-LAST:event_loginButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
		boolean hasBadInput = false;
		if ( !Validation.validateInput( usernameField.getText(), usernameField.getName() ) ) {
			hasBadInput = true;
		}

		if ( !Validation.validateInput( emailField.getText(), emailField.getName() ) ) {
			hasBadInput = true;
		}

		if ( !Validation.validateInput( emailConfField.getText(), emailConfField.getName(), emailField.getText() ) ) {
			hasBadInput = true;
		}

		if ( !Validation.validateInput( passField.getText(), passField.getName() ) ) {
			hasBadInput = true;
		}

		if ( !Validation.validateInput( passConfField.getText(), passConfField.getName(), passField.getText() ) ) {
			hasBadInput = true;
		}

		if ( hasBadInput ) {
			JOptionPane.showMessageDialog( this, "You Have an error in one or more of the required fields" );
			return;
		}

		try{
			Connection connection = Main.getConnection();
			Statement state = connection.createStatement();
			ResultSet res = state.executeQuery( "SELECT id FROM users WHERE email=\""+ emailField.getText() + "\";" );

			if ( res.next() ) {
				JOptionPane.showMessageDialog( this, "Email already exists" );
				return;
			}
			else {
				String query = "INSERT INTO users( username, email, password, created) VALUES(\"" +
					usernameField.getText() + "\", \"" +
					emailField.getText() + "\", \"" +
					Encoder.getMd5( passField.getText() ) + "\", " +
					System.currentTimeMillis() / 1000L +
					")";
				state.executeUpdate( query );
			}

			res.close();
			state.close();
			connection.close();
		} catch ( SQLException e ){
			e.printStackTrace();
			//todo catch later
		}
		//todo how is this working shouldn't since the comps are now out cleared from mem?
		this.dispose();
		new LoginWindow( emailField.getText(), passField.getPassword().toString() ).setVisible( true );
	}//GEN-LAST:event_createButtonActionPerformed


    private void usernameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyReleased
	    inputKeyRelease( evt );
    }//GEN-LAST:event_usernameFieldKeyReleased

    private void emailFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyReleased
        inputKeyRelease( evt );
    }//GEN-LAST:event_emailFieldKeyReleased

    private void emailConfFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailConfFieldKeyReleased
        inputKeyRelease( evt );
    }//GEN-LAST:event_emailConfFieldKeyReleased

    private void passFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyReleased
        inputKeyRelease( evt );
    }//GEN-LAST:event_passFieldKeyReleased

    private void passConfFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passConfFieldKeyReleased
        inputKeyRelease( evt );
    }//GEN-LAST:event_passConfFieldKeyReleased

    /**
	 * action event for when we let up the mouse
	 * @param evt
	 */
	private void inputKeyRelease( java.awt.event.KeyEvent evt ) {
		JTextField in = ( (JTextField) evt.getSource() );
		String name = in.getName();
		boolean hasSibling = false;
		String siblingText = "";
		if ( name.startsWith( "conf-" ) ) {
			hasSibling = true;
			if( name.split( "conf-" )[1].equals( "email" ) ) {
				siblingText = emailField.getText();
			}
			else if( name.split( "conf-" )[1].equals( "password" ) ) {
				siblingText = passField.getText();
			}
		}
		boolean passed = hasSibling ? Validation.validateInput( in.getText(), name, siblingText ) : Validation.validateInput( in.getText(), name );
		if ( passed ) {
			in.setBackground( new Color( 0x26D226 ) );
		} else {
			in.setBackground( new Color( 0xff2f2f ) );
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JTextField emailConfField;
    private javax.swing.JLabel emailConfLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField passConfField;
    private javax.swing.JLabel passConfLabel;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
