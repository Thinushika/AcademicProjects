
package App_Package;
import AppPackage.AnimationClass;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Issue extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    
    public Issue() {
         super("Issue");
        initComponents();
        conn = DBconnection.getConnection();
        setLocationRelativeTo(null);
        Err1.setVisible(false);
        Err2.setVisible(false);
         Err3.setVisible(false);
    }
static ImageIcon ii;

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
    public void addreturnvalue(){
        String sql="Insert into returnbook(studentid,regno,firstname,bookid,isbn,booktitle,issuedate,returndate)values(?,?,?,?,?,?,?,?)";
        try {

            pst=conn.prepareStatement(sql);
            pst.setString(1,stafid.getText());
            pst.setString(2,regno1.getText());
            pst.setString(3,firstname1.getText());
            pst.setString(4,bookid1.getText());
            pst.setString(5,isbn1.getText());
            pst.setString(6,booktitle1.getText());
            pst.setString(7,issuedate1.getText());
            pst.setString(8,returndate.getText());  
            pst.execute();
          
            JOptionPane.showMessageDialog(null,"Book aded to return queue");
           
            rs.close();
            pst.close();

        } catch (Exception ex) {
           // JOptionPane.showMessageDialog(null,ex);
        }
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogissue = new javax.swing.JDialog();
        issuebook = new javax.swing.JPanel();
        studentid = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        regno = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        isbn = new javax.swing.JTextField();
        booktitle = new javax.swing.JTextField();
        searchstudent = new javax.swing.JLabel();
        Err2 = new javax.swing.JLabel();
        bookid = new javax.swing.JTextField();
        searchbook = new javax.swing.JLabel();
        Err1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        L7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        issuedate = new datechooser.beans.DateChooserCombo();
        issuebtn = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jDialogreturn = new javax.swing.JDialog();
        returnbook = new javax.swing.JPanel();
        jSeparator18 = new javax.swing.JSeparator();
        stafid = new javax.swing.JTextField();
        regno1 = new javax.swing.JTextField();
        firstname1 = new javax.swing.JTextField();
        isbn1 = new javax.swing.JTextField();
        booktitle1 = new javax.swing.JTextField();
        searchstudent1 = new javax.swing.JLabel();
        Err3 = new javax.swing.JLabel();
        bookid1 = new javax.swing.JTextField();
        issuedate1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        return_btn = new javax.swing.JLabel();
        returndate = new datechooser.beans.DateChooserCombo();
        close2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        close = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        Btn6 = new javax.swing.JLabel();
        Btn3 = new javax.swing.JLabel();
        Btn5 = new javax.swing.JLabel();
        Btn1 = new javax.swing.JLabel();
        Btn2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        U1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        U2 = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        m2 = new javax.swing.JLabel();

        jDialogissue.setTitle("Issue Book");
        jDialogissue.setMinimumSize(new java.awt.Dimension(560, 560));
        jDialogissue.setUndecorated(true);
        jDialogissue.setResizable(false);
        jDialogissue.setSize(new java.awt.Dimension(560, 560));

        issuebook.setBackground(new java.awt.Color(255, 255, 255));
        issuebook.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(102, 102, 102)));
        issuebook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentid.setForeground(new java.awt.Color(102, 102, 102));
        studentid.setBorder(null);
        studentid.setSelectionColor(new java.awt.Color(0, 153, 0));
        studentid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                studentidFocusGained(evt);
            }
        });
        issuebook.add(studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 230, 31));

        jSeparator11.setForeground(new java.awt.Color(204, 204, 204));
        issuebook.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 280, 10));

        regno.setEditable(false);
        regno.setBackground(new java.awt.Color(255, 255, 255));
        regno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        regno.setForeground(new java.awt.Color(102, 102, 102));
        regno.setBorder(null);
        regno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                regnoFocusGained(evt);
            }
        });
        issuebook.add(regno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 230, 31));

        firstname.setEditable(false);
        firstname.setBackground(new java.awt.Color(255, 255, 255));
        firstname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstname.setForeground(new java.awt.Color(102, 102, 102));
        firstname.setBorder(null);
        firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstnameFocusGained(evt);
            }
        });
        issuebook.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 230, 31));

        isbn.setEditable(false);
        isbn.setBackground(new java.awt.Color(255, 255, 255));
        isbn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        isbn.setForeground(new java.awt.Color(102, 102, 102));
        isbn.setBorder(null);
        isbn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                isbnFocusGained(evt);
            }
        });
        issuebook.add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 230, 31));

        booktitle.setEditable(false);
        booktitle.setBackground(new java.awt.Color(255, 255, 255));
        booktitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        booktitle.setForeground(new java.awt.Color(102, 102, 102));
        booktitle.setBorder(null);
        booktitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                booktitleFocusGained(evt);
            }
        });
        issuebook.add(booktitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 230, 31));

        searchstudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchstudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Search_20px.png"))); // NOI18N
        searchstudent.setMaximumSize(new java.awt.Dimension(26, 26));
        searchstudent.setMinimumSize(new java.awt.Dimension(26, 26));
        searchstudent.setPreferredSize(new java.awt.Dimension(26, 26));
        searchstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchstudentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchstudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchstudentMouseExited(evt);
            }
        });
        issuebook.add(searchstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 40, 35));

        Err2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Err2.setForeground(new java.awt.Color(255, 0, 0));
        Err2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Err2.setText("  Incorrect Student ID !  Please try again..");
        issuebook.add(Err2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        bookid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookid.setForeground(new java.awt.Color(102, 102, 102));
        bookid.setBorder(null);
        bookid.setSelectionColor(new java.awt.Color(0, 153, 0));
        bookid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookidFocusGained(evt);
            }
        });
        issuebook.add(bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 218, 31));

        searchbook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Search_20px.png"))); // NOI18N
        searchbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchbookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchbookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchbookMouseExited(evt);
            }
        });
        issuebook.add(searchbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 40, 35));

        Err1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Err1.setForeground(new java.awt.Color(255, 0, 0));
        Err1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Err1.setText("  Incorrect Book ID !  Please try again..");
        issuebook.add(Err1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        issuebook.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 270, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Issue Date :");
        issuebook.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, 30));

        L6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        L6.setForeground(new java.awt.Color(102, 102, 102));
        L6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L6.setText("Reg No :");
        issuebook.add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, 30));

        L7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        L7.setForeground(new java.awt.Color(102, 102, 102));
        L7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L7.setText("First Name :");
        issuebook.add(L7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ISBN :");
        issuebook.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 120, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Book Title :");
        issuebook.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 120, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Enter Book ID :");
        issuebook.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Enter Student ID :");
        issuebook.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, 30));

        issuedate.setCalendarBackground(new java.awt.Color(255, 255, 255));
        issuedate.setFieldFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
        issuedate.setNavigateFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
        issuebook.add(issuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 260, 30));

        issuebtn.setBackground(new java.awt.Color(60, 0, 60));
        issuebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        issuebtn.setForeground(new java.awt.Color(255, 255, 255));
        issuebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        issuebtn.setText("Issue");
        issuebtn.setOpaque(true);
        issuebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issuebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                issuebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                issuebtnMouseExited(evt);
            }
        });
        issuebook.add(issuebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 560, 50));

        close1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(102, 102, 102));
        close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close1.setText("X");
        close1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        close1.setOpaque(true);
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close1MouseExited(evt);
            }
        });
        issuebook.add(close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 2, 50, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Borrow_Book_18px.png"))); // NOI18N
        jLabel20.setText(" Issue Book");
        jLabel20.setOpaque(true);
        issuebook.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 556, 30));

        javax.swing.GroupLayout jDialogissueLayout = new javax.swing.GroupLayout(jDialogissue.getContentPane());
        jDialogissue.getContentPane().setLayout(jDialogissueLayout);
        jDialogissueLayout.setHorizontalGroup(
            jDialogissueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(issuebook, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialogissueLayout.setVerticalGroup(
            jDialogissueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogissueLayout.createSequentialGroup()
                .addComponent(issuebook, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDialogreturn.setTitle("Return Book");
        jDialogreturn.setMinimumSize(new java.awt.Dimension(550, 510));
        jDialogreturn.setUndecorated(true);
        jDialogreturn.setSize(new java.awt.Dimension(550, 510));

        returnbook.setBackground(new java.awt.Color(255, 255, 255));
        returnbook.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(153, 153, 153)));
        returnbook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator18.setForeground(new java.awt.Color(204, 204, 204));
        returnbook.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 300, 10));

        stafid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        stafid.setForeground(new java.awt.Color(102, 102, 102));
        stafid.setBorder(null);
        stafid.setSelectionColor(new java.awt.Color(0, 153, 0));
        stafid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                stafidFocusGained(evt);
            }
        });
        returnbook.add(stafid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 230, 31));

        regno1.setEditable(false);
        regno1.setBackground(new java.awt.Color(255, 255, 255));
        regno1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        regno1.setForeground(new java.awt.Color(102, 102, 102));
        regno1.setBorder(null);
        regno1.setSelectionColor(new java.awt.Color(0, 153, 0));
        regno1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                regno1FocusGained(evt);
            }
        });
        returnbook.add(regno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 230, 31));

        firstname1.setEditable(false);
        firstname1.setBackground(new java.awt.Color(255, 255, 255));
        firstname1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstname1.setForeground(new java.awt.Color(102, 102, 102));
        firstname1.setBorder(null);
        firstname1.setSelectionColor(new java.awt.Color(0, 153, 0));
        firstname1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstname1FocusGained(evt);
            }
        });
        returnbook.add(firstname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 230, 31));

        isbn1.setEditable(false);
        isbn1.setBackground(new java.awt.Color(255, 255, 255));
        isbn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        isbn1.setForeground(new java.awt.Color(102, 102, 102));
        isbn1.setBorder(null);
        isbn1.setSelectionColor(new java.awt.Color(0, 153, 0));
        isbn1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                isbn1FocusGained(evt);
            }
        });
        returnbook.add(isbn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 230, 31));

        booktitle1.setEditable(false);
        booktitle1.setBackground(new java.awt.Color(255, 255, 255));
        booktitle1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        booktitle1.setForeground(new java.awt.Color(102, 102, 102));
        booktitle1.setBorder(null);
        booktitle1.setSelectionColor(new java.awt.Color(0, 153, 0));
        booktitle1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                booktitle1FocusGained(evt);
            }
        });
        returnbook.add(booktitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 230, 31));

        searchstudent1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchstudent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Search_20px.png"))); // NOI18N
        searchstudent1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchstudent1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchstudent1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchstudent1MouseExited(evt);
            }
        });
        returnbook.add(searchstudent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 40, 35));

        Err3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Err3.setForeground(new java.awt.Color(255, 0, 0));
        Err3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Err3.setText("  Incorrect ID !  Please try again..");
        returnbook.add(Err3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        bookid1.setEditable(false);
        bookid1.setBackground(new java.awt.Color(255, 255, 255));
        bookid1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookid1.setForeground(new java.awt.Color(102, 102, 102));
        bookid1.setBorder(null);
        bookid1.setSelectionColor(new java.awt.Color(0, 153, 0));
        bookid1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookid1FocusGained(evt);
            }
        });
        returnbook.add(bookid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 230, 31));

        issuedate1.setEditable(false);
        issuedate1.setBackground(new java.awt.Color(255, 255, 255));
        issuedate1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        issuedate1.setForeground(new java.awt.Color(102, 102, 102));
        issuedate1.setBorder(null);
        issuedate1.setSelectionColor(new java.awt.Color(0, 153, 0));
        issuedate1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                issuedate1FocusGained(evt);
            }
        });
        returnbook.add(issuedate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 230, 31));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Issue Date :");
        returnbook.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 120, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Return Date :");
        returnbook.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 120, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Enter Student ID :");
        returnbook.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Reg No :");
        returnbook.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 120, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("First Name :");
        returnbook.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Book ID :");
        returnbook.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 120, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("ISBN :");
        returnbook.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 120, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Book Title :");
        returnbook.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 120, 30));

        return_btn.setBackground(new java.awt.Color(60, 0, 60));
        return_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        return_btn.setForeground(new java.awt.Color(255, 255, 255));
        return_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        return_btn.setText("Return");
        return_btn.setOpaque(true);
        return_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                return_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                return_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                return_btnMouseExited(evt);
            }
        });
        returnbook.add(return_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 550, 50));

        returndate.setFieldFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
        returnbook.add(returndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 260, 30));

        close2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        close2.setForeground(new java.awt.Color(102, 102, 102));
        close2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close2.setText("X");
        close2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close2MouseExited(evt);
            }
        });
        returnbook.add(close2, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 2, 50, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Return_Book_18px.png"))); // NOI18N
        jLabel8.setText(" Return Book");
        jLabel8.setOpaque(true);
        returnbook.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 546, 30));

        javax.swing.GroupLayout jDialogreturnLayout = new javax.swing.GroupLayout(jDialogreturn.getContentPane());
        jDialogreturn.getContentPane().setLayout(jDialogreturnLayout);
        jDialogreturnLayout.setHorizontalGroup(
            jDialogreturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnbook, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialogreturnLayout.setVerticalGroup(
            jDialogreturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnbook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1030, 630));
        setMinimumSize(new java.awt.Dimension(1030, 630));
        setUndecorated(true);

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

        jPanel1.add(Traveller, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Issue Book & Return Book ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Circulation /");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/pnl123.jpg"))); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 220));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 960, 220));

        U1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Borrow_Book_48px.png"))); // NOI18N
        U1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                U1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                U1MouseExited(evt);
            }
        });
        jPanel1.add(U1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 100, 100));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Issue Book");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 80, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Return Book");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 100, -1));

        U2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Return_Book_48px.png"))); // NOI18N
        U2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                U2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                U2MouseExited(evt);
            }
        });
        jPanel1.add(U2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 100, 100));

        m1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Circled_Thin_20px.png"))); // NOI18N
        jPanel1.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));

        m2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Circled_Thin_20px.png"))); // NOI18N
        jPanel1.add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
        Home L = new Home();
        L.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_backMouseExited

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

    private void U1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U1MouseClicked
        ii = new ImageIcon(getClass().getResource("icons8_New_Moon_20px.png"));
        m1.setIcon(ii);
        ii = new ImageIcon(getClass().getResource("icons8_Circled_Thin_20px.png"));
        m2.setIcon(ii);
        
        jDialogissue.setVisible(true);
        jDialogissue.setLocationRelativeTo(null);
    }//GEN-LAST:event_U1MouseClicked

    private void U1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U1MouseEntered
        ii = new ImageIcon(getClass().getResource("icons8_Borrow_Book_48px_1.png"));
        U1.setIcon(ii);
    }//GEN-LAST:event_U1MouseEntered

    private void U1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U1MouseExited
        ii = new ImageIcon(getClass().getResource("icons8_Borrow_Book_48px.png"));
        U1.setIcon(ii);
    }//GEN-LAST:event_U1MouseExited

    private void U2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U2MouseClicked
        ii = new ImageIcon(getClass().getResource("icons8_New_Moon_20px.png"));
        m2.setIcon(ii);
        ii = new ImageIcon(getClass().getResource("icons8_Circled_Thin_20px.png"));
        m1.setIcon(ii);
        
        jDialogreturn.setVisible(true);
        jDialogreturn.setLocationRelativeTo(null);
    }//GEN-LAST:event_U2MouseClicked

    private void U2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U2MouseEntered
        ii = new ImageIcon(getClass().getResource("icons8_Return_Book_48px_3.png"));
        U2.setIcon(ii);
    }//GEN-LAST:event_U2MouseEntered

    private void U2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U2MouseExited
        ii = new ImageIcon(getClass().getResource("icons8_Return_Book_48px.png"));
        U2.setIcon(ii);
    }//GEN-LAST:event_U2MouseExited

    private void studentidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentidFocusGained
        studentid.setText("");
    }//GEN-LAST:event_studentidFocusGained

    private void regnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regnoFocusGained
        regno.setText("");
    }//GEN-LAST:event_regnoFocusGained

    private void firstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnameFocusGained
        firstname.setText("");
    }//GEN-LAST:event_firstnameFocusGained

    private void isbnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_isbnFocusGained
        isbn.setText("");
    }//GEN-LAST:event_isbnFocusGained

    private void booktitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_booktitleFocusGained
        booktitle.setText("");
    }//GEN-LAST:event_booktitleFocusGained

    private void searchstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchstudentMouseClicked
        String a1= studentid.getText();
        String sql = "select * from students where studentid='"+a1+"'";
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if (rs.next()){
                regno.setText(rs.getString(2));
                firstname.setText(rs.getString(3));
                pst.execute();
                Err2.setVisible(false);
                Err1.setVisible(false);
                rs.close();
                pst.close();
            }
            else{
                //JOptionPane.showMessageDialog(null,"Please check your inputs.");
                Err2.setVisible(true);
            }
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_searchstudentMouseClicked

    private void searchstudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchstudentMouseEntered
        searchstudent.setOpaque(true);
    }//GEN-LAST:event_searchstudentMouseEntered

    private void searchstudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchstudentMouseExited
        searchstudent.setOpaque(false);
    }//GEN-LAST:event_searchstudentMouseExited

    private void bookidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookidFocusGained
        bookid.setText("");
    }//GEN-LAST:event_bookidFocusGained

    private void searchbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbookMouseClicked
        String a1= bookid.getText();
        String sql = "select * from books where bookid='"+a1+"'";
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if (rs.next()){
                
                isbn.setText(rs.getString(2));
                booktitle.setText(rs.getString(3));
                searchbook.setVisible(false);
                Err1.setVisible(false);
                Err2.setVisible(false);
                
                rs.close();
                pst.close();
            }
            else{
                Err1.setVisible(true);
            }
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_searchbookMouseClicked

    private void searchbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbookMouseEntered
        searchbook.setOpaque(true);
    }//GEN-LAST:event_searchbookMouseEntered

    private void searchbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbookMouseExited
        searchbook.setOpaque(false);
    }//GEN-LAST:event_searchbookMouseExited

    private void issuebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuebtnMouseClicked
        String sql="Insert into issuebook(studentid,regno,firstname,bookid,isbn,booktitle,issuedate)values(?,?,?,?,?,?,?)";
        try {

            pst=conn.prepareStatement(sql);
            pst.setString(1,studentid.getText());
            pst.setString(2,regno.getText());
            pst.setString(3,firstname.getText());
            pst.setString(4,bookid.getText());
            pst.setString(5,isbn.getText());
            pst.setString(6,booktitle.getText());
            pst.setString(7,issuedate.getText());

            pst.execute();

            JOptionPane.showMessageDialog(null,"Book Issued");

            rs.close();
            pst.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_issuebtnMouseClicked

    private void issuebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuebtnMouseEntered
        issuebtn.setBackground(new Color(51,0,51));
        issuebtn.setForeground(new Color(102,0,102));
    }//GEN-LAST:event_issuebtnMouseEntered

    private void issuebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuebtnMouseExited
        issuebtn.setBackground(new Color(102,0,102));
        issuebtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_issuebtnMouseExited

    private void stafidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stafidFocusGained
        stafid.setText("");
    }//GEN-LAST:event_stafidFocusGained

    private void regno1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regno1FocusGained
        regno1.setText("");
    }//GEN-LAST:event_regno1FocusGained

    private void firstname1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstname1FocusGained
        firstname1.setText("");
    }//GEN-LAST:event_firstname1FocusGained

    private void isbn1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_isbn1FocusGained

    }//GEN-LAST:event_isbn1FocusGained

    private void booktitle1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_booktitle1FocusGained
        booktitle1.setText("");
    }//GEN-LAST:event_booktitle1FocusGained

    private void searchstudent1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchstudent1MouseClicked
           String a1= stafid.getText();
        String sql = "select * from issuebook where studentid='"+a1+"'";
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if (rs.next()){
               
                regno1.setText(rs.getString(2));
                firstname1.setText(rs.getString(3));
                bookid1.setText(rs.getString(4));
                isbn1.setText(rs.getString(5));
                booktitle1.setText(rs.getString(6));
                issuedate1.setText(rs.getString(7));
                rs.close();
                pst.close();
            }
            else{
               // Err3.setVisible(true); // txt_username.setText(null);
            }
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null,ex);
        }
     
    }//GEN-LAST:event_searchstudent1MouseClicked

    private void searchstudent1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchstudent1MouseEntered
        searchstudent1.setOpaque(true);
    }//GEN-LAST:event_searchstudent1MouseEntered

    private void searchstudent1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchstudent1MouseExited
        searchstudent1.setOpaque(false);
    }//GEN-LAST:event_searchstudent1MouseExited

    private void bookid1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookid1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_bookid1FocusGained

    private void issuedate1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_issuedate1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_issuedate1FocusGained

    private void return_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_btnMouseClicked
        String sql="delete from issuebook where studentid=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,stafid.getText());

            pst.execute();
            addreturnvalue();
            JOptionPane.showMessageDialog(null,"Book is Returned");

            rs.close();
            pst.close();

        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_return_btnMouseClicked

    private void return_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_btnMouseEntered
        return_btn.setBackground(new Color(51,0,51));
        return_btn.setForeground(new Color(102,0,102));
    }//GEN-LAST:event_return_btnMouseEntered

    private void return_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_btnMouseExited
        return_btn.setBackground(new Color(102,0,102));
        return_btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_return_btnMouseExited

    private void Btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn6MouseClicked
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

    private void Btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseClicked

        Btn3.setBackground(new Color(240,240,240));
        Btn1.setBackground(new Color(255,255,255));
        Btn2.setBackground(new Color(255,255,255));
        Btn5.setBackground(new Color(255,255,255));
        dispose();
        remove a = new remove ();
        a.setVisible(true);
    }//GEN-LAST:event_Btn3MouseClicked

    private void Btn3reClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3reClicked

    }//GEN-LAST:event_Btn3reClicked

    private void Btn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseEntered
        AnimationClass AC = new AnimationClass();
        // AC.jLabelYDown(-196, 30, 1, 1, H3);
    }//GEN-LAST:event_Btn3MouseEntered

    private void Btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseExited
        AnimationClass AC = new AnimationClass();
        // AC.jLabelYUp(30, -196, 1, 1, H3);
    }//GEN-LAST:event_Btn3MouseExited

    private void Btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseClicked
        Btn3.setBackground(new Color(255,255,255));
        Btn1.setBackground(new Color(255,255,255));
        Btn2.setBackground(new Color(255,255,255));
        Btn5.setBackground(new Color(255,255,255));
        AnimationClass AC = new AnimationClass();

        dispose();
        Update R = new Update();
        R.setVisible(true);
    }//GEN-LAST:event_Btn5MouseClicked

    private void Btn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseEntered
        AnimationClass AC = new AnimationClass();
        // AC.jLabelYDown(-196, 30, 1, 1, H5);
    }//GEN-LAST:event_Btn5MouseEntered

    private void Btn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseExited
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        //  AC.jLabelYUp(30, -196, 1, 1, H5);
    }//GEN-LAST:event_Btn5MouseExited

    private void Btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseClicked

        Btn1.setBackground(new Color(240,240,240));
        Btn3.setBackground(new Color(255,255,255));
        Btn2.setBackground(new Color(255,255,255));
        Btn5.setBackground(new Color(255,255,255));
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

    private void Btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseClicked

        Btn2.setBackground(new Color(240,240,240));
        Btn1.setBackground(new Color(255,255,255));
        Btn3.setBackground(new Color(255,255,255));
        Btn5.setBackground(new Color(255,255,255));
        dispose();
        Add a = new Add ();
        a.setVisible(true);
    }//GEN-LAST:event_Btn2MouseClicked

    private void Btn2reClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2reClicked
        AnimationClass AC = new AnimationClass();

    }//GEN-LAST:event_Btn2reClicked

    private void Btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseEntered
        AnimationClass AC = new AnimationClass();
        //AC.jLabelYDown(-196, 30, 1, 1, H2);
    }//GEN-LAST:event_Btn2MouseEntered

    private void Btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseExited
        AnimationClass AC = new AnimationClass();
        // AC.jLabelYUp(30, -196, 1, 1, H2);
    }//GEN-LAST:event_Btn2MouseExited

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        jDialogissue.dispose();
    }//GEN-LAST:event_close1MouseClicked

    private void close1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseEntered
        close1.setBackground(new Color(60,60,60));
    }//GEN-LAST:event_close1MouseEntered

    private void close1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseExited
        close1.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_close1MouseExited

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
        UserSearch S = new UserSearch();
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

    private void close2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseExited
        close2.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_close2MouseExited

    private void close2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseEntered
        close2.setBackground(new Color(60,60,60));
    }//GEN-LAST:event_close2MouseEntered

    private void close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseClicked
        jDialogreturn.dispose();
    }//GEN-LAST:event_close2MouseClicked

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
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue().setVisible(true);
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
    private javax.swing.JLabel Err1;
    private javax.swing.JLabel Err2;
    private javax.swing.JLabel Err3;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JPanel Traveller;
    private javax.swing.JLabel U1;
    private javax.swing.JLabel U2;
    private javax.swing.JLabel back;
    private javax.swing.JTextField bookid;
    private javax.swing.JTextField bookid1;
    private javax.swing.JTextField booktitle;
    private javax.swing.JTextField booktitle1;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel close2;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField firstname1;
    private javax.swing.JTextField isbn;
    private javax.swing.JTextField isbn1;
    private javax.swing.JPanel issuebook;
    private javax.swing.JLabel issuebtn;
    private datechooser.beans.DateChooserCombo issuedate;
    private javax.swing.JTextField issuedate1;
    private javax.swing.JDialog jDialogissue;
    private javax.swing.JDialog jDialogreturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m2;
    private javax.swing.JLabel menu;
    private javax.swing.JTextField regno;
    private javax.swing.JTextField regno1;
    private javax.swing.JLabel return_btn;
    private javax.swing.JPanel returnbook;
    private datechooser.beans.DateChooserCombo returndate;
    private javax.swing.JLabel searchbook;
    private javax.swing.JLabel searchstudent;
    private javax.swing.JLabel searchstudent1;
    private javax.swing.JTextField stafid;
    private javax.swing.JTextField studentid;
    // End of variables declaration//GEN-END:variables
}
