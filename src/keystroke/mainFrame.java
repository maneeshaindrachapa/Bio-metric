/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystroke;

import java.util.ArrayList;

/**
 *
 * @author Maneesha
 */
public class mainFrame extends javax.swing.JFrame {

    public mainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        errorUsername.setVisible(false);
        errorUsername1.setVisible(false);
        passwordSignup.setText("");
        passwordSignin.setText("");
        errorSigninPassword.setVisible(false);
        loginSuccesfullLBL.setVisible(false);
        loginUnsuccessfulLBL.setVisible(false);

    }

    //variables for time
    private long time2 = 0; //key released time
    private long time3 = 0; //difference between two keystrokes
    private long time21 = 0;
    private long time31 = 0;

    //check which shift is using
    private boolean signUpRightShifted = false;
    private boolean signInRightShifted = false;
    private boolean signUpLeftShifted = false;
    private boolean signInLeftShifted = false;

    //to add users in to arraylist
    private ArrayList<user> users = new ArrayList<>();
    //to store the data in arraylist
    private ArrayList<String> timeDifferanceArray = new ArrayList<>();

    //to store the data for the sign in
    private ArrayList<String> timeDifferenceSignin = new ArrayList<>();

    //boolean value to set the character,character array 
    private boolean correct = false;

    //error margin
    private double errorMargin = 0.30;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reset = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        errorUsername = new javax.swing.JLabel();
        passwordSignup = new javax.swing.JPasswordField();
        usernameTxt = new javax.swing.JTextField();
        submit = new javax.swing.JLabel();
        exitlbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        errorSigninPassword = new javax.swing.JLabel();
        usernameSignin = new javax.swing.JTextField();
        passwordSignin = new javax.swing.JPasswordField();
        loginUnsuccessfulLBL = new javax.swing.JLabel();
        loginSuccesfullLBL = new javax.swing.JLabel();
        errorUsername1 = new javax.swing.JLabel();
        submit1 = new javax.swing.JLabel();
        reset1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Raleway Light", 0, 12)); // NOI18N
        jLabel2.setText("Type a Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jLabel4.setText("Enter a Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keystroke/images/2.png"))); // NOI18N
        reset.setToolTipText("");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, 30));

        jLabel6.setFont(new java.awt.Font("Raleway", 0, 36)); // NOI18N
        jLabel6.setText("Sign In");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        errorUsername.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        errorUsername.setText("Please Enter a Valid Username");
        getContentPane().add(errorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 220, -1));

        passwordSignup.setText("jPasswordField2");
        passwordSignup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordSignupKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordSignupKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordSignupKeyTyped(evt);
            }
        });
        getContentPane().add(passwordSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 870, 40));

        usernameTxt.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        usernameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTxtKeyPressed(evt);
            }
        });
        getContentPane().add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 190, 30));

        submit.setBackground(new java.awt.Color(102, 102, 102));
        submit.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keystroke/images/1.png"))); // NOI18N
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, 30));

        exitlbl.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        exitlbl.setForeground(new java.awt.Color(255, 255, 255));
        exitlbl.setText("X");
        exitlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitlblMouseClicked(evt);
            }
        });
        getContentPane().add(exitlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Raleway Light", 0, 12)); // NOI18N
        jLabel3.setText("Type a Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jLabel5.setText("Enter a Username");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Raleway", 0, 36)); // NOI18N
        jLabel7.setText("Sign Up");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        errorSigninPassword.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        errorSigninPassword.setForeground(new java.awt.Color(255, 255, 255));
        errorSigninPassword.setText("Password is Incorrect");
        getContentPane().add(errorSigninPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, -1, -1));

        usernameSignin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameSigninKeyPressed(evt);
            }
        });
        getContentPane().add(usernameSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 190, 30));

        passwordSignin.setText("jPasswordField1");
        passwordSignin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordSigninKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordSigninKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordSigninKeyTyped(evt);
            }
        });
        getContentPane().add(passwordSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 860, 40));

        loginUnsuccessfulLBL.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        loginUnsuccessfulLBL.setText("Login Unsuccesful");
        getContentPane().add(loginUnsuccessfulLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        loginSuccesfullLBL.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        loginSuccesfullLBL.setText("Login Succesful");
        getContentPane().add(loginSuccesfullLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        errorUsername1.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        errorUsername1.setText("Please Enter a Valid Username");
        getContentPane().add(errorUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 220, -1));

        submit1.setBackground(new java.awt.Color(102, 102, 102));
        submit1.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        submit1.setForeground(new java.awt.Color(255, 255, 255));
        submit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keystroke/images/1.png"))); // NOI18N
        submit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit1MouseClicked(evt);
            }
        });
        getContentPane().add(submit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, 30));

        reset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keystroke/images/2.png"))); // NOI18N
        reset1.setToolTipText("");
        reset1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset1MouseClicked(evt);
            }
        });
        getContentPane().add(reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Maneesha\\Desktop\\Spark\\Images\\backGround.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 710));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 710));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlblMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitlblMouseClicked

    /////////////////////////////////////////////////////////////////////////////////////////sign up clicked
    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        if (users.size() > 0) {
            for (int i = 0; i < users.size(); i++) {
                if (usernameTxt.getText().equals(users.get(i).getUsername())) {
                    errorUsername.setVisible(true);
                    resetSignUp();
                    break;
                }
            }
        } else {
            if (usernameTxt.getText().length() > 0) {
                char[] password = passwordSignup.getPassword();
                String passwordText = "";
                for (int i = 0; i < password.length; i++) {
                    passwordText += password[i];
                }
                user currentUser = new user(usernameTxt.getText(), passwordText, timeDifferanceArray, signUpRightShifted, signUpLeftShifted);

                users.add(currentUser); //add timeDifferenceArray to the timeArrayAll

                System.out.println(users.get(0).getTimeElapsed());
                System.out.println("\n");

                resetSignUp();//resetting fields

            } else {
                errorUsername.setVisible(true);
            }
        }

    }//GEN-LAST:event_submitMouseClicked

    //checking username is typing 
    private void usernameTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTxtKeyPressed
        errorUsername.setVisible(false);
    }//GEN-LAST:event_usernameTxtKeyPressed

    //when reset button pressed
    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        resetSignUp();
    }//GEN-LAST:event_resetMouseClicked

    private void submit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit1MouseClicked
        try {
            int usernumber = 0;
            boolean valid = true;
            usernumber = getUser(usernameSignin.getText());
            if (usernumber != Integer.MAX_VALUE) {
                //adding perticular user arrat list as userBiometric
                ArrayList<String> userBiomatric = new ArrayList<>();
                for (int j = 0; j < users.get(usernumber).getTimeElapsed().size(); j++) {
                    userBiomatric.add(users.get(usernumber).getTimeElapsed().get(j));
                }

                for (int i = 0; i < userBiomatric.size(); i++) {
                    int val = Integer.parseInt(timeDifferenceSignin.get(i));
                    int valOriginal = Integer.parseInt(userBiomatric.get(i));
                    int errormargin_range = (int) (valOriginal * errorMargin);
                    if (users.get(usernumber).isRightShifted() == signInRightShifted && users.get(usernumber).isLeftShifted() == signInLeftShifted) {
                        if ((valOriginal - errormargin_range) < val && val < (valOriginal + errormargin_range)) {
                            valid = true;
                        } else {
                            valid = false;
                            loginUnsuccessfulLBL.setVisible(true);
                            resetSignIn();
                            break;
                        }
                    } else {
                        valid = false;
                        loginUnsuccessfulLBL.setVisible(true);
                        passwordSignin.setText("");
                        timeDifferenceSignin.clear();
                        break;
                    }
                }
                if (valid) {
                    loginSuccesfullLBL.setVisible(true);
                    resetSignIn();
                }
            } else {
                //there is an error in username and password
            }
        } catch (Exception e) {
            loginSuccesfullLBL.setVisible(true);
            resetSignIn();
        }

    }//GEN-LAST:event_submit1MouseClicked

    private void reset1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset1MouseClicked
        resetSignIn();
    }//GEN-LAST:event_reset1MouseClicked

    /////////////////////////////////////////////////////////////////////////////////////////////Sign Up values
    private void passwordSignupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordSignupKeyPressed

    }//GEN-LAST:event_passwordSignupKeyPressed

    private void passwordSignupKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordSignupKeyReleased
        time2 = System.currentTimeMillis();
        if (evt.getKeyCode() == evt.VK_BACK_SPACE) {
            passwordSignup.setText("");
            timeDifferanceArray.clear();
            time2 = 0;
            time3 = 0;
        }
        if (evt.getKeyCode() == evt.VK_SHIFT) {
            if (evt.getKeyLocation() == evt.KEY_LOCATION_RIGHT) {
                signUpRightShifted = true;
            }
            if (evt.getKeyLocation() == evt.KEY_LOCATION_LEFT) {
                signUpLeftShifted = true;
            }
        }

    }//GEN-LAST:event_passwordSignupKeyReleased

    private void passwordSignupKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordSignupKeyTyped
        time3 = System.currentTimeMillis();
        if (passwordSignup.getPassword().length > 0) {
            timeDifferanceArray.add(calculateTimeKeyStroke(time2, time3));
            System.out.println(timeDifferanceArray);
        }
    }//GEN-LAST:event_passwordSignupKeyTyped
    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////Sign up
    private void usernameSigninKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameSigninKeyPressed
        errorUsername1.setVisible(false);
        loginSuccesfullLBL.setVisible(false);
        loginUnsuccessfulLBL.setVisible(false);
    }//GEN-LAST:event_usernameSigninKeyPressed

    private void passwordSigninKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordSigninKeyReleased
        time21 = System.currentTimeMillis();
        if (evt.getKeyCode() == evt.VK_BACK_SPACE) {
            passwordSignin.setText("");
            timeDifferenceSignin.clear();
            time21 = 0;
            time31 = 0;
        }
        if (evt.getKeyCode() == evt.VK_SHIFT) {
            if (evt.getKeyLocation() == evt.KEY_LOCATION_RIGHT) {
                signInRightShifted = true;
            }
            if (evt.getKeyLocation() == evt.KEY_LOCATION_LEFT) {
                signInLeftShifted = true;
            }
        }

    }//GEN-LAST:event_passwordSigninKeyReleased

    private void passwordSigninKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordSigninKeyTyped
        time31 = System.currentTimeMillis();
        if (passwordSignin.getPassword().length > 0) {
            timeDifferenceSignin.add(calculateTimeKeyStroke(time21, time31));
            System.out.println(timeDifferenceSignin);
        }
    }//GEN-LAST:event_passwordSigninKeyTyped

    private void passwordSigninKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordSigninKeyPressed
        loginSuccesfullLBL.setVisible(false);
        loginUnsuccessfulLBL.setVisible(false);
        errorSigninPassword.setVisible(false);
    }//GEN-LAST:event_passwordSigninKeyPressed
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    //calculate time diffrence between key released and key pressed
    private void calculateTimeDifferance(long time1, long time2) {
        //System.out.println(time2+" "+time1+":"+(time2-time1));
    }

    //calculate time difference between two key strokes
    private String calculateTimeKeyStroke(long time2, long time3) {
        //System.out.println("time between two letters "+(time3-time2));
        return (time3 - time2) + "";
    }

    //resetting sign up
    private void resetSignUp() {
        timeDifferanceArray.clear();
        passwordSignup.setText("");
        usernameTxt.setText("");
        signUpLeftShifted = false;
        signUpRightShifted = false;
    }

    //resetting sign in
    private void resetSignIn() {
        timeDifferenceSignin.clear();
        passwordSignin.setText("");
        usernameSignin.setText("");
        signInLeftShifted = false;
        signInRightShifted = false;
    }

    //get user details
    private int getUser(String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                char[] passwordSignUpArray = passwordSignin.getPassword();//getting signup password
                String password_SignUp = ""; //making a variable for the password
                for (int j = 0; j < passwordSignUpArray.length; j++) {
                    password_SignUp += passwordSignUpArray[j]; //adding charcter array and making the password as a string
                }
                if (users.get(i).getPassword().equals(password_SignUp)) {
                    return i;
                } else {
                    errorSigninPassword.setVisible(true);
                    passwordSignin.setText("");
                    timeDifferenceSignin.clear();//clearing sign up password array
                    signInLeftShifted = false;
                    signInRightShifted = false;
                    return Integer.MAX_VALUE;
                }
            }
        }
        errorUsername1.setVisible(true); //when error occurs setting all the values to the initial values
        passwordSignin.setText("");
        timeDifferenceSignin.clear();
        signInLeftShifted = false;
        signInRightShifted = false;
        return Integer.MAX_VALUE;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorSigninPassword;
    private javax.swing.JLabel errorUsername;
    private javax.swing.JLabel errorUsername1;
    private javax.swing.JLabel exitlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel loginSuccesfullLBL;
    private javax.swing.JLabel loginUnsuccessfulLBL;
    private javax.swing.JPasswordField passwordSignin;
    private javax.swing.JPasswordField passwordSignup;
    private javax.swing.JLabel reset;
    private javax.swing.JLabel reset1;
    private javax.swing.JLabel submit;
    private javax.swing.JLabel submit1;
    private javax.swing.JTextField usernameSignin;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
