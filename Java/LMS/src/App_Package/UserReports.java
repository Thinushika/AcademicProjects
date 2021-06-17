/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Package;
import AppPackage.AnimationClass;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author PC
 */
public class UserReports extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    /**
     * Creates new form UserReports
     */
    public UserReports() {
        super("UserReports");
        initComponents();
        conn = DBconnection.getConnection();
        setLocationRelativeTo(null);
        
        jTable1();       
        setCount();
        setCountS();
        setCountIB();
        setCountRB();
        
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
     public void jTable1(){
    try{
        String sql="select bookid,isbn,booktitle,author,edition,price from books";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
    }
}
    public void jTable2() {
        try {
            String sql = "select studentid,regno,firstname,contactno,email from students";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void jTable3() {
        try {
            String sql = "select studentid,regno,firstname,bookid,isbn,booktitle,issuedate from issuebook";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void jTable4() {
        try {
            String sql = "select studentid,regno,firstname,bookid,isbn,booktitle,issuedate,returndate from returnbook";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void setCount(){
        try{
            String sql="select count(bookid) from books";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String count = rs.getString("count(bookid)");
                CB.setText(count);
            }
        }catch(Exception ex){
            
        }
    }
     public void setCountS(){
        try{
            String sql="select count(studentid) from students";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String count = rs.getString("count(studentid)");
                CS.setText(count);
            }
        }catch(Exception ex){
            
        }
    }
     public void setCountIB(){
        try{
            String sql="select count(studentid) from issuebook";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String count = rs.getString("count(studentid)");
                CIB.setText(count);
            }
        }catch(Exception ex){
            
        }
    }
     public void setCountRB(){
        try{
            String sql="select count(studentid) from returnbook";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String count = rs.getString("count(studentid)");
                CRB.setText(count);
            }
        }catch(Exception ex){
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Traveller = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        Btn2 = new javax.swing.JLabel();
        Btn1 = new javax.swing.JLabel();
        Btn5 = new javax.swing.JLabel();
        Btn3 = new javax.swing.JLabel();
        Btn6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        TB = new javax.swing.JPanel();
        CB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TS = new javax.swing.JPanel();
        CS = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TRB = new javax.swing.JPanel();
        TIB = new javax.swing.JPanel();
        CIB = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CRB = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        students1 = new javax.swing.JLabel();
        books = new javax.swing.JLabel();
        students2 = new javax.swing.JLabel();
        students = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1030, 630));
        setMinimumSize(new java.awt.Dimension(1030, 630));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1030, 630));
        setSize(new java.awt.Dimension(1030, 630));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "ISBN", "Book Title", "Author", "Edition", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(26);
        jTable1.setSelectionBackground(new java.awt.Color(102, 0, 102));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 960, 290));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TB.setBackground(new java.awt.Color(255, 255, 255));
        TB.setOpaque(false);
        TB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CB.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        CB.setForeground(new java.awt.Color(204, 204, 204));
        CB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CB.setText("0");
        TB.add(CB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 93, 75));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Total Books");
        TB.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jPanel4.add(TB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 211, -1));

        TS.setBackground(new java.awt.Color(255, 255, 255));
        TS.setOpaque(false);
        TS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CS.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        CS.setForeground(new java.awt.Color(204, 204, 204));
        CS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CS.setText("0");
        TS.add(CS, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 93, 75));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total Students");
        TS.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 130, -1));

        jPanel4.add(TS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 213, -1));

        TRB.setBackground(new java.awt.Color(255, 255, 255));
        TRB.setOpaque(false);
        TRB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(TRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, -1, -1));

        TIB.setBackground(new java.awt.Color(255, 255, 255));
        TIB.setOpaque(false);
        TIB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CIB.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        CIB.setForeground(new java.awt.Color(204, 204, 204));
        CIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CIB.setText("0");
        TIB.add(CIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 93, 75));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total Issued Books");
        TIB.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, -1));

        jPanel4.add(TIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        CRB.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        CRB.setForeground(new java.awt.Color(204, 204, 204));
        CRB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CRB.setText("0");
        jPanel4.add(CRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 93, 75));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Returned Books");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 200, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/pnl123.jpg"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 277));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 960, -1));

        students1.setBackground(new java.awt.Color(255, 255, 255));
        students1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        students1.setForeground(new java.awt.Color(102, 102, 102));
        students1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        students1.setText("Issue details");
        students1.setOpaque(true);
        students1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                students1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                students1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                students1MouseExited(evt);
            }
        });

        books.setBackground(new java.awt.Color(102, 0, 102));
        books.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        books.setForeground(new java.awt.Color(204, 204, 204));
        books.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        books.setText("Books");
        books.setOpaque(true);
        books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                booksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                booksMouseExited(evt);
            }
        });

        students2.setBackground(new java.awt.Color(255, 255, 255));
        students2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        students2.setForeground(new java.awt.Color(102, 102, 102));
        students2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        students2.setText("Return Details");
        students2.setOpaque(true);
        students2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                students2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                students2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                students2MouseExited(evt);
            }
        });

        students.setBackground(new java.awt.Color(255, 255, 255));
        students.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        students.setForeground(new java.awt.Color(102, 102, 102));
        students.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        students.setText("Students");
        students.setOpaque(true);
        students.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 360, Short.MAX_VALUE)
                .addComponent(books, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(students, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(students1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(students2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(books, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(students, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(students1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(students2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 960, 30));

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

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 630);

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

    private void students1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_students1MouseClicked
        jTable3();
        students1.setBackground(new Color(102,0,102)); 
        books.setBackground(new Color(255,255,255));
        students.setBackground(new Color(255,255,255));
        students2.setBackground(new Color(255,255,255));
         students1.setForeground(new Color(255,255,255));
        books.setForeground(new Color(102,102,102));
        students.setForeground(new Color(102,102,102));
        students2.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_students1MouseClicked

    private void students1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_students1MouseEntered
        //students1.setOpaque(true);
    }//GEN-LAST:event_students1MouseEntered

    private void students1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_students1MouseExited
        //students1.setOpaque(false);
    }//GEN-LAST:event_students1MouseExited

    private void booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMouseClicked
         jTable1();
        books.setBackground(new Color(102,0,102));
        students.setBackground(new Color(255,255,255));
        students1.setBackground(new Color(255,255,255));
        students2.setBackground(new Color(255,255,255));
         books.setForeground(new Color(255,255,255));
        students.setForeground(new Color(102,102,102));
        students1.setForeground(new Color(102,102,102));
        students2.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_booksMouseClicked

    private void booksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMouseEntered
        //books.setOpaque(true);
    }//GEN-LAST:event_booksMouseEntered

    private void booksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMouseExited
        //books.setOpaque(false);
    }//GEN-LAST:event_booksMouseExited

    private void students2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_students2MouseClicked
         jTable4();
        students2.setBackground(new Color(102,0,102));
        books.setBackground(new Color(255,255,255));
        students1.setBackground(new Color(255,255,255));
        students.setBackground(new Color(255,255,255));
        students2.setForeground(new Color(255,255,255));
        books.setForeground(new Color(102,102,102));
        students.setForeground(new Color(102,102,102));
        students1.setForeground(new Color(102,102,102));
        
    }//GEN-LAST:event_students2MouseClicked

    private void students2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_students2MouseEntered
       // students2.setOpaque(true);
    }//GEN-LAST:event_students2MouseEntered

    private void students2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_students2MouseExited
        //students2.setOpaque(false);
    }//GEN-LAST:event_students2MouseExited

    private void studentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMouseClicked
         jTable2();
        students.setBackground(new Color(102,0,102));
        books.setBackground(new Color(255,255,255));
        students1.setBackground(new Color(255,255,255));
        students2.setBackground(new Color(255,255,255));
         students.setForeground(new Color(255,255,255));
        books.setForeground(new Color(102,102,102));
        students1.setForeground(new Color(102,102,102));
        students2.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_studentsMouseClicked

    private void studentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMouseEntered
        //students.setOpaque(true);
    }//GEN-LAST:event_studentsMouseEntered

    private void studentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMouseExited
        //students.setOpaque(false);
    }//GEN-LAST:event_studentsMouseExited

    private void Btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseClicked

        Btn2.setBackground(new Color(240,240,240));
        Btn1.setBackground(new Color(255,255,255));
        Btn3.setBackground(new Color(255,255,255));
        Btn5.setBackground(new Color(255,255,255));
        Btn6.setBackground(new Color(255,255,255));
        JOptionPane.showMessageDialog(null,"Sorry ! Only Admin can enter this page");
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

    private void Btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseClicked

        Btn1.setBackground(new Color(240,240,240));
        Btn3.setBackground(new Color(255,255,255));
        Btn2.setBackground(new Color(255,255,255));
        Btn5.setBackground(new Color(255,255,255));
        Btn6.setBackground(new Color(255,255,255));
        JOptionPane.showMessageDialog(null,"Sorry ! Only Admin can enter this page");

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

    private void Btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseClicked
        Btn3.setBackground(new Color(255,255,255));
        Btn1.setBackground(new Color(255,255,255));
        Btn2.setBackground(new Color(255,255,255));
        Btn5.setBackground(new Color(255,255,255));
        Btn6.setBackground(new Color(255,255,255));
        AnimationClass AC = new AnimationClass();

        JOptionPane.showMessageDialog(null,"Sorry ! Only Admin can enter this page");
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

    private void Btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseClicked

        Btn3.setBackground(new Color(240,240,240));
        Btn1.setBackground(new Color(255,255,255));
        Btn2.setBackground(new Color(255,255,255));
        Btn5.setBackground(new Color(255,255,255));
        Btn6.setBackground(new Color(255,255,255));
        JOptionPane.showMessageDialog(null,"Sorry ! Only Admin can enter this page");
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
        UserHome S = new UserHome();
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
        UserAbout S = new UserAbout();
        S.setVisible(true);
    }//GEN-LAST:event_A3MouseClicked

    private void A4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseClicked

    }//GEN-LAST:event_A4MouseClicked

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
            java.util.logging.Logger.getLogger(UserReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserReports().setVisible(true);
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
    private javax.swing.JLabel CB;
    private javax.swing.JLabel CIB;
    private javax.swing.JLabel CRB;
    private javax.swing.JLabel CS;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JPanel TB;
    private javax.swing.JPanel TIB;
    private javax.swing.JPanel TRB;
    private javax.swing.JPanel TS;
    private javax.swing.JPanel Traveller;
    private javax.swing.JLabel back;
    private javax.swing.JLabel books;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel students;
    private javax.swing.JLabel students1;
    private javax.swing.JLabel students2;
    // End of variables declaration//GEN-END:variables
}
