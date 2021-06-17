package App_Package;

import java.awt.Color;
import AppPackage.AnimationClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    
    public Login() {
        super("Login");
        initComponents();
        conn = DBconnection.getConnection();
        setLocationRelativeTo(null);
        ///this.setState(WIDTH);
    }

static ImageIcon ii;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Traveller = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        U1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        U2 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_signin = new javax.swing.JLabel();
        btn_FPW = new javax.swing.JLabel();
        showpw = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 560));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Traveller.setBackground(new java.awt.Color(255, 255, 255));
        Traveller.setMaximumSize(new java.awt.Dimension(920, 30));
        Traveller.setMinimumSize(new java.awt.Dimension(920, 30));
        Traveller.setOpaque(false);
        Traveller.setPreferredSize(new java.awt.Dimension(920, 30));
        Traveller.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TravellerMouseDragged(evt);
            }
        });
        Traveller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TravellerMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TravellerMouseReleased(evt);
            }
        });
        Traveller.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        close.setForeground(new java.awt.Color(102, 102, 102));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setOpaque(true);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        Traveller.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 50, 30));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(204, 0, 204));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Left_20px.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        Traveller.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(Traveller, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 30));

        U1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        U1.setForeground(new java.awt.Color(102, 102, 102));
        U1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U1.setText("User Name");
        jPanel1.add(U1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 70, 30));

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setBorder(null);
        username.setOpaque(false);
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 280, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 280, 10));

        U2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        U2.setForeground(new java.awt.Color(102, 102, 102));
        U2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U2.setText("Password");
        jPanel1.add(U2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 60, 30));

        Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(102, 102, 102));
        Password.setBorder(null);
        Password.setOpaque(false);
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 250, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 280, 10));

        btn_signin.setBackground(new java.awt.Color(255, 255, 255));
        btn_signin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_signin.setForeground(new java.awt.Color(204, 0, 204));
        btn_signin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_signin.setText("Sign In");
        btn_signin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        btn_signin.setOpaque(true);
        btn_signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_signinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_signinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_signinMouseExited(evt);
            }
        });
        jPanel1.add(btn_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 280, 50));

        btn_FPW.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_FPW.setForeground(new java.awt.Color(102, 102, 102));
        btn_FPW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_FPW.setText("Forgot Password ?");
        btn_FPW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FPWMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_FPWMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_FPWMouseExited(evt);
            }
        });
        jPanel1.add(btn_FPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 140, 30));

        showpw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Eye_19px.png"))); // NOI18N
        showpw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showpwMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                showpwMouseReleased(evt);
            }
        });
        jPanel1.add(showpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 20, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Sign In");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 110, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/lms11.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 0, 300, 560));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/cccccc.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-390, 0, 380, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/back_ground.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 300, 400));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 920, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents
int xy,xx;
    private void TravellerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravellerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_TravellerMouseDragged

    private void TravellerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravellerMousePressed
        setOpacity((float) 0.8);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_TravellerMousePressed

    private void TravellerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravellerMouseReleased
        setOpacity((float)1.0);
    }//GEN-LAST:event_TravellerMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         AnimationClass AC = new AnimationClass();
         AC.jLabelXRight(-300,0, 1,1,jLabel1);
         AC.jLabelXRight(-390,10, 1,1,jLabel2);
        
    }//GEN-LAST:event_formWindowOpened

    private void btn_signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signinMouseEntered
        btn_signin.setBackground(new Color(60,0,60));
    }//GEN-LAST:event_btn_signinMouseEntered
 
    private void btn_signinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signinMouseExited
       btn_signin.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_signinMouseExited

    private void btn_signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signinMouseClicked
        String sql = "select * from adminacc where username=?and password=?";
        if (username.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields.");
            
        } else if (Password.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields.");
        } else {
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, username.getText());
                pst.setString(2, Password.getText());
                rs = pst.executeQuery();
                if (rs.next()) {
                    rs.close();
                    pst.close();
                   

                    this.dispose();
                    Home L = new Home();
                    L.setVisible(true);
                } else {
                     JOptionPane.showMessageDialog(null, "Incorrect Login inputs ! Please try again.");

                }

            } catch (Exception ex) {
                // JOptionPane.showMessageDialog(null,ex); 
            } finally {
                try {
                    rs.close();
                    pst.close();
                } catch (Exception ex) {

                }
            }
        }
    }//GEN-LAST:event_btn_signinMouseClicked
    
    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(new Color(60,60,60));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       System.exit(0);
       
       
    }//GEN-LAST:event_closeMouseClicked

    private void showpwMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpwMousePressed
        ii = new ImageIcon(getClass().getResource("icons8_Invisible_19px.png"));
        showpw.setIcon(ii);
        Password.setEchoChar((char)0);
    }//GEN-LAST:event_showpwMousePressed

    private void showpwMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpwMouseReleased
       ii = new ImageIcon(getClass().getResource("icons8_Eye_19px.png"));
        showpw.setIcon(ii);
        Password.setEchoChar(('*'));
    }//GEN-LAST:event_showpwMouseReleased

    private void btn_FPWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FPWMouseClicked
        dispose();
        FogotPW S = new FogotPW();
        S.setVisible(true);
    }//GEN-LAST:event_btn_FPWMouseClicked

    private void btn_FPWMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FPWMouseEntered
       btn_FPW.setForeground(new Color(102,0,102));
    }//GEN-LAST:event_btn_FPWMouseEntered

    private void btn_FPWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FPWMouseExited
          btn_FPW.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_btn_FPWMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
        askLogin L = new askLogin();
        L.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setOpaque(true);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setOpaque(false);
    }//GEN-LAST:event_backMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel Traveller;
    private javax.swing.JLabel U1;
    private javax.swing.JLabel U2;
    private javax.swing.JLabel back;
    private javax.swing.JLabel btn_FPW;
    private javax.swing.JLabel btn_signin;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel showpw;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
