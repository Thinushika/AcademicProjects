
package App_Package;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;


public class Home extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
   
    public Home() {
        initComponents();
        conn = DBconnection.getConnection();
        setLocationRelativeTo(null);
        showTime();
        showDate();
    }
static ImageIcon ii;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        A1 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        A4 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        Traveller = new javax.swing.JPanel();
        Btn5 = new javax.swing.JLabel();
        Btn3 = new javax.swing.JLabel();
        Btn2 = new javax.swing.JLabel();
        Btn1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        Btn6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Welcomename = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        slidepane = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1030, 628));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(244, 244, 244));
        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Menu_20px.png"))); // NOI18N
        menu.setOpaque(true);
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
                menuagainclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 50, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        A1.setBackground(new java.awt.Color(51, 51, 51));
        A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Home_20px.png"))); // NOI18N
        A1.setOpaque(true);
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });
        jPanel2.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        A2.setBackground(new java.awt.Color(0, 0, 0));
        A2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Search_20px.png"))); // NOI18N
        A2.setOpaque(true);
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });
        jPanel2.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 70, 40));

        A3.setBackground(new java.awt.Color(0, 0, 0));
        A3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_About_20px.png"))); // NOI18N
        A3.setOpaque(true);
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
        });
        jPanel2.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 70, 40));

        A4.setBackground(new java.awt.Color(0, 0, 0));
        A4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A4.setOpaque(true);
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A4MouseClicked(evt);
            }
        });
        jPanel2.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 70, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 70, 600));

        L5.setBackground(new java.awt.Color(0, 0, 0));
        L5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        L5.setForeground(new java.awt.Color(204, 204, 204));
        L5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L5.setOpaque(true);
        jPanel1.add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 190, 110, 440));

        L4.setBackground(new java.awt.Color(0, 0, 0));
        L4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        L4.setForeground(new java.awt.Color(204, 204, 204));
        L4.setOpaque(true);
        jPanel1.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 150, 110, 40));

        L3.setBackground(new java.awt.Color(0, 0, 0));
        L3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        L3.setForeground(new java.awt.Color(204, 204, 204));
        L3.setText("   About");
        L3.setOpaque(true);
        jPanel1.add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 110, 110, 40));

        L2.setBackground(new java.awt.Color(0, 0, 0));
        L2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        L2.setForeground(new java.awt.Color(204, 204, 204));
        L2.setText("   Search");
        L2.setOpaque(true);
        jPanel1.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 70, 110, 40));

        L1.setBackground(new java.awt.Color(51, 51, 51));
        L1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        L1.setForeground(new java.awt.Color(255, 255, 255));
        L1.setText("   Home");
        L1.setOpaque(true);
        jPanel1.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 30, 110, 40));

        Traveller.setBackground(new java.awt.Color(255, 255, 255));
        Traveller.setMaximumSize(new java.awt.Dimension(920, 30));
        Traveller.setOpaque(false);
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

        Btn5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn5.setForeground(new java.awt.Color(102, 102, 102));
        Btn5.setText("Update");
        Btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn5MouseExited(evt);
            }
        });
        Traveller.add(Btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 110, 30));

        Btn3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn3.setForeground(new java.awt.Color(102, 102, 102));
        Btn3.setText("Remove");
        Btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn3MouseClicked(evt);
                Btn3reClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn3MouseExited(evt);
            }
        });
        Traveller.add(Btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 110, 30));

        Btn2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn2.setForeground(new java.awt.Color(102, 102, 102));
        Btn2.setText("Registration");
        Btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn2MouseClicked(evt);
                Btn2reClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn2MouseExited(evt);
            }
        });
        Traveller.add(Btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 110, 30));

        Btn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn1.setForeground(new java.awt.Color(102, 102, 102));
        Btn1.setText("Circulation");
        Btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn1MouseClicked(evt);
                Btn1reClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn1MouseExited(evt);
            }
        });
        Traveller.add(Btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 110, 30));

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        close.setForeground(new java.awt.Color(102, 102, 102));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        Traveller.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 50, 30));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(204, 0, 204));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Left_20px.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back.setOpaque(true);
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

        Btn6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn6.setForeground(new java.awt.Color(102, 102, 102));
        Btn6.setText("Reports");
        Btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn6MouseExited(evt);
            }
        });
        Traveller.add(Btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 110, 30));

        jPanel1.add(Traveller, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("You Look Awsome..!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        Welcomename.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Welcomename.setForeground(new java.awt.Color(204, 204, 204));
        Welcomename.setText("Admin");
        jPanel1.add(Welcomename, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Welcome ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        time.setBackground(new java.awt.Color(153, 153, 153));
        time.setFont(new java.awt.Font("Segoe UI", 0, 53)); // NOI18N
        time.setForeground(new java.awt.Color(153, 153, 153));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("Time");
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 250, -1));

        date.setBackground(new java.awt.Color(153, 153, 153));
        date.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        date.setForeground(new java.awt.Color(153, 153, 153));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("Date");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, 260, -1));

        slidepane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/PNL34.png"))); // NOI18N
        slidepane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                slidepaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                slidepaneMouseExited(evt);
            }
        });
        jPanel1.add(slidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 630, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/546.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 960, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/bookc.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 960, 600));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 628);

        pack();
    }// </editor-fold>//GEN-END:initComponents
int xy,xx;
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
         System.exit(0);
        
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(new Color(60,60,60));
       
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(255,255,255));
      
    }//GEN-LAST:event_closeMouseExited

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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
        Login L = new Login();
        L.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
         back.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
       back.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_backMouseExited

    private void slidepaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slidepaneMouseEntered
         AnimationClass AC = new AnimationClass();
         AC.jLabelXLeft(740,540 , 1, 1,slidepane );
    }//GEN-LAST:event_slidepaneMouseEntered

    private void slidepaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slidepaneMouseExited
         AnimationClass AC = new AnimationClass();
         AC.jLabelXRight(540,740 , 1, 1,slidepane );
    }//GEN-LAST:event_slidepaneMouseExited

    private void Btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseClicked
        Btn3.setBackground(new Color(255,255,255));
        Btn1.setBackground(new Color(255,255,255));
        Btn2.setBackground(new Color(255,255,255));
        Btn5.setBackground(new Color(255,255,255));
        Btn6.setBackground(new Color(255,255,255));
        AnimationClass AC = new AnimationClass();
        
        dispose();
        Update R = new Update();
        R.setVisible(true);

    }//GEN-LAST:event_Btn5MouseClicked

    private void Btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseClicked
       
       
        Btn3.setBackground(new Color(240,240,240));
        Btn1.setBackground(new Color(255,255,255));
        Btn2.setBackground(new Color(255,255,255));
        Btn5.setBackground(new Color(255,255,255));
        Btn6.setBackground(new Color(255,255,255));
          dispose();
        remove a = new remove ();
        a.setVisible(true);
    }//GEN-LAST:event_Btn3MouseClicked

    private void Btn3reClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3reClicked
        
       
    }//GEN-LAST:event_Btn3reClicked

    private void Btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseClicked
       
        
        Btn2.setBackground(new Color(240,240,240));
        Btn1.setBackground(new Color(255,255,255));
        Btn3.setBackground(new Color(255,255,255));
        Btn5.setBackground(new Color(255,255,255));
        Btn6.setBackground(new Color(255,255,255));
         dispose();
        Add a = new Add ();
        a.setVisible(true);
    }//GEN-LAST:event_Btn2MouseClicked

    private void Btn2reClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2reClicked
        AnimationClass AC = new AnimationClass();
     
    }//GEN-LAST:event_Btn2reClicked

    private void Btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseClicked
     
        Btn1.setBackground(new Color(240,240,240));
        Btn3.setBackground(new Color(255,255,255));
        Btn2.setBackground(new Color(255,255,255));
        Btn5.setBackground(new Color(255,255,255));
        Btn6.setBackground(new Color(255,255,255));
        dispose();
        Issue a = new Issue ();
        a.setVisible(true);

        // 

    }//GEN-LAST:event_Btn1MouseClicked

    private void Btn1reClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1reClicked
      
    }//GEN-LAST:event_Btn1reClicked

    private void Btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseEntered
        AnimationClass AC = new AnimationClass();
        //AC.jLabelYDown(-196, 30, 1, 1, H1);
    }//GEN-LAST:event_Btn1MouseEntered

    private void Btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseExited
        AnimationClass AC = new AnimationClass();
        //AC.jLabelYUp(30, -196, 1, 1, H1);
    }//GEN-LAST:event_Btn1MouseExited

    private void Btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseEntered
        AnimationClass AC = new AnimationClass();
        //AC.jLabelYDown(-196, 30, 1, 1, H2);
    }//GEN-LAST:event_Btn2MouseEntered

    private void Btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseExited
        AnimationClass AC = new AnimationClass();
       // AC.jLabelYUp(30, -196, 1, 1, H2);
    }//GEN-LAST:event_Btn2MouseExited

    private void Btn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseEntered
        AnimationClass AC = new AnimationClass();
       // AC.jLabelYDown(-196, 30, 1, 1, H3);
    }//GEN-LAST:event_Btn3MouseEntered

    private void Btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseExited
        AnimationClass AC = new AnimationClass();
       // AC.jLabelYUp(30, -196, 1, 1, H3);
    }//GEN-LAST:event_Btn3MouseExited

    private void Btn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseEntered
        AnimationClass AC = new AnimationClass();
       // AC.jLabelYDown(-196, 30, 1, 1, H5);
    }//GEN-LAST:event_Btn5MouseEntered

    private void Btn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseExited
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
      //  AC.jLabelYUp(30, -196, 1, 1, H5);
    }//GEN-LAST:event_Btn5MouseExited

    private void Btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn6MouseClicked
        Btn6.setBackground(new Color(240,240,240));
        Btn3.setBackground(new Color(255,255,255));
        Btn2.setBackground(new Color(255,255,255));
        Btn5.setBackground(new Color(255,255,255));
        Btn1.setBackground(new Color(255,255,255));
        dispose();
        Reports R = new Reports();
        R.setVisible(true);
    }//GEN-LAST:event_Btn6MouseClicked

    private void Btn6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn6MouseEntered

    private void Btn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn6MouseExited

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
        setColor(A1);
        setColor1(L1);
        resetColor(new JLabel[]{A2,A3},new JLabel[]{L2,L3,L5});
        dispose();
        Home S = new Home();
        S.setVisible(true);
    }//GEN-LAST:event_A1MouseClicked

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
        setColor(A2);
        setColor1(L2);
        resetColor(new JLabel[]{A1,A3},new JLabel[]{L1,L3,L5});
        dispose();
        Search S = new Search();
        S.setVisible(true);
    }//GEN-LAST:event_A2MouseClicked

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked
        setColor(A3);
        setColor1(L3);
        resetColor(new JLabel[]{A2,A1},new JLabel[]{L2,L1,L5});
        dispose();
        About S = new About();
        S.setVisible(true);
    }//GEN-LAST:event_A3MouseClicked

    private void A4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseClicked

    }//GEN-LAST:event_A4MouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        AnimationClass AC = new AnimationClass();

        AC.jLabelXRight(-150, 70, 1, 1, L1);
        AC.jLabelXRight(-150, 70, 1, 1, L2);
        AC.jLabelXRight(-150, 70, 1, 1, L3);
        AC.jLabelXRight(-150, 70, 1, 1, L4);
        AC.jLabelXRight(-150, 70, 1, 1, L5);
    }//GEN-LAST:event_menuMouseClicked

    private void menuagainclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuagainclicked
        AnimationClass AC = new AnimationClass();
        AC.jLabelXLeft(70, -150, 1, 1, L1);
        AC.jLabelXLeft(70, -150, 1, 1, L2);
        AC.jLabelXLeft(70, -150, 1, 1, L3);
        AC.jLabelXLeft(70, -150, 1, 1, L4);
        AC.jLabelXLeft(70, -150, 1, 1, L5);
    }//GEN-LAST:event_menuagainclicked

    private void menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseEntered
        menu.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_menuMouseEntered

    private void menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseExited
        menu.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_menuMouseExited
  
    public void showDate() {
        Date d = new Date();
        setLocationRelativeTo(null);
    
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
        date.setText(s.format(d));
    }

    public void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm a");
                time.setText(s.format(d));
            }

        }).start();
    }
    private void setColor(JLabel A){
        A.setBackground(new Color(51,51,51));
    }
     private void setColor1(JLabel L){
        L.setBackground(new Color(51,51,51));
    }
    private void resetColor(JLabel []A,JLabel [] L){
        for(int i=0;i<A.length;i++){
            A[i].setBackground(new Color(0,0,0));
        }
        for(int i=0;i<L.length;i++){
          L[i].setBackground(new Color(0,0,0));
        }
        
    }
     private void setColor2(JLabel Btn){
        Btn.setBackground(new Color(153,0,153));
        Btn.setForeground(new Color(255,255,255));
    }
     
    private void resetColor2(JLabel []Btn){
        for(int i=0;i<Btn.length;i++){
            Btn[i].setBackground(new Color(255,255,255));
            Btn[i].setForeground(new Color(102,102,102));
        } 
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel A4;
    private javax.swing.JLabel Btn1;
    private javax.swing.JLabel Btn2;
    private javax.swing.JLabel Btn3;
    private javax.swing.JLabel Btn5;
    private javax.swing.JLabel Btn6;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JPanel Traveller;
    private javax.swing.JLabel Welcomename;
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel slidepane;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
