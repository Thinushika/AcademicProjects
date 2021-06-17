
package App_Package;
import AppPackage.AnimationClass;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class remove extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
   
    public remove() {
         super("remove");
        initComponents();
        conn = DBconnection.getConnection();
        setLocationRelativeTo(null);
        Err2.setVisible(false);
        Err1.setVisible(false);
    }
static ImageIcon ii;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogBook = new javax.swing.JDialog();
        BookPnl = new javax.swing.JPanel();
        bookid = new javax.swing.JTextField();
        clear = new javax.swing.JLabel();
        deletebook = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        isbn = new javax.swing.JTextField();
        booktitle = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        edition = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        Err1 = new javax.swing.JLabel();
        clearBook = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDialogStudents = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        StudentPnl = new javax.swing.JPanel();
        studentid = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        regno = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        grade = new javax.swing.JTextField();
        contactno = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        clear1 = new javax.swing.JLabel();
        clearSt = new javax.swing.JLabel();
        searchstudent = new javax.swing.JLabel();
        Err2 = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        close2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        U1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        U2 = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        m2 = new javax.swing.JLabel();

        jDialogBook.setTitle("Delete Book");
        jDialogBook.setMinimumSize(new java.awt.Dimension(620, 425));
        jDialogBook.setUndecorated(true);
        jDialogBook.setSize(new java.awt.Dimension(620, 425));
        jDialogBook.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BookPnl.setBackground(new java.awt.Color(255, 255, 255));
        BookPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        BookPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookid.setForeground(new java.awt.Color(102, 102, 102));
        bookid.setBorder(null);
        bookid.setOpaque(false);
        bookid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookidFocusGained(evt);
            }
        });
        BookPnl.add(bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 218, 31));

        clear.setBackground(new java.awt.Color(51, 51, 51));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        clear.setForeground(new java.awt.Color(153, 153, 153));
        clear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Clear_Symbol_20px.png"))); // NOI18N
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        BookPnl.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 64, 40, 35));

        deletebook.setBackground(new java.awt.Color(51, 0, 51));
        deletebook.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        deletebook.setForeground(new java.awt.Color(255, 255, 255));
        deletebook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deletebook.setText("Delete");
        deletebook.setOpaque(true);
        deletebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletebookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletebookMouseExited(evt);
            }
        });
        BookPnl.add(deletebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 300, 30));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        BookPnl.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 280, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Enter Book ID :");
        BookPnl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 75, -1, -1));

        search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Search_20px.png"))); // NOI18N
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        BookPnl.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 64, 40, 35));

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
        BookPnl.add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 218, 31));

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
        BookPnl.add(booktitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 218, 31));

        author.setEditable(false);
        author.setBackground(new java.awt.Color(255, 255, 255));
        author.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        author.setForeground(new java.awt.Color(102, 102, 102));
        author.setBorder(null);
        author.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                authorFocusGained(evt);
            }
        });
        BookPnl.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 218, 31));

        edition.setEditable(false);
        edition.setBackground(new java.awt.Color(255, 255, 255));
        edition.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edition.setForeground(new java.awt.Color(102, 102, 102));
        edition.setBorder(null);
        edition.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editionFocusGained(evt);
            }
        });
        BookPnl.add(edition, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 218, 31));

        type.setEditable(false);
        type.setBackground(new java.awt.Color(255, 255, 255));
        type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(102, 102, 102));
        type.setBorder(null);
        type.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                typeFocusGained(evt);
            }
        });
        BookPnl.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 218, 31));

        price.setEditable(false);
        price.setBackground(new java.awt.Color(255, 255, 255));
        price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        price.setForeground(new java.awt.Color(102, 102, 102));
        price.setBorder(null);
        price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                priceFocusGained(evt);
            }
        });
        BookPnl.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 218, 31));

        Err1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Err1.setForeground(new java.awt.Color(255, 0, 0));
        Err1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Err1.setText("  Incorrect Book ID !  Please try again..");
        BookPnl.add(Err1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        clearBook.setBackground(new java.awt.Color(102, 0, 102));
        clearBook.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        clearBook.setForeground(new java.awt.Color(255, 255, 255));
        clearBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearBook.setText("Clear");
        clearBook.setOpaque(true);
        clearBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearBookMouseExited(evt);
            }
        });
        BookPnl.add(clearBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 300, 30));

        close1.setBackground(new java.awt.Color(255, 255, 255));
        close1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(102, 102, 102));
        close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close1.setText("X");
        close1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        BookPnl.add(close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 0, 50, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Trash_18px_1.png"))); // NOI18N
        jLabel1.setText(" Remove Book");
        jLabel1.setOpaque(true);
        BookPnl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 596, 30));

        jDialogBook.getContentPane().add(BookPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jDialogStudents.setTitle("Delete Student");
        jDialogStudents.setMinimumSize(new java.awt.Dimension(560, 475));
        jDialogStudents.setUndecorated(true);
        jDialogStudents.setSize(new java.awt.Dimension(560, 475));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        StudentPnl.setBackground(new java.awt.Color(255, 255, 255));
        StudentPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        StudentPnl.setMaximumSize(new java.awt.Dimension(560, 475));
        StudentPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentid.setForeground(new java.awt.Color(102, 102, 102));
        studentid.setBorder(null);
        studentid.setOpaque(false);
        studentid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                studentidFocusGained(evt);
            }
        });
        StudentPnl.add(studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 230, 31));

        jSeparator11.setForeground(new java.awt.Color(204, 204, 204));
        StudentPnl.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 280, 10));

        regno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        regno.setForeground(new java.awt.Color(102, 102, 102));
        regno.setBorder(null);
        regno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                regnoFocusGained(evt);
            }
        });
        StudentPnl.add(regno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 230, 31));

        firstname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstname.setForeground(new java.awt.Color(102, 102, 102));
        firstname.setBorder(null);
        firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstnameFocusGained(evt);
            }
        });
        StudentPnl.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 230, 31));

        lastname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastname.setForeground(new java.awt.Color(102, 102, 102));
        lastname.setBorder(null);
        lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastnameFocusGained(evt);
            }
        });
        StudentPnl.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 230, 31));

        grade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        grade.setForeground(new java.awt.Color(102, 102, 102));
        grade.setBorder(null);
        grade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gradeFocusGained(evt);
            }
        });
        StudentPnl.add(grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 230, 31));

        contactno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contactno.setForeground(new java.awt.Color(102, 102, 102));
        contactno.setBorder(null);
        contactno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactnoFocusGained(evt);
            }
        });
        StudentPnl.add(contactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 230, 31));

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setBorder(null);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });
        StudentPnl.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 230, 31));

        clear1.setBackground(new java.awt.Color(51, 51, 51));
        clear1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        clear1.setForeground(new java.awt.Color(153, 153, 153));
        clear1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Clear_Symbol_20px.png"))); // NOI18N
        clear1.setMaximumSize(new java.awt.Dimension(26, 26));
        clear1.setMinimumSize(new java.awt.Dimension(26, 26));
        clear1.setPreferredSize(new java.awt.Dimension(26, 26));
        clear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear1MouseClicked(evt);
            }
        });
        StudentPnl.add(clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 40, 35));

        clearSt.setBackground(new java.awt.Color(102, 0, 102));
        clearSt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        clearSt.setForeground(new java.awt.Color(255, 255, 255));
        clearSt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearSt.setText("Clear");
        clearSt.setOpaque(true);
        clearSt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearStMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearStMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearStMouseExited(evt);
            }
        });
        StudentPnl.add(clearSt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 280, 35));

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
        StudentPnl.add(searchstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 40, 35));

        Err2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Err2.setForeground(new java.awt.Color(255, 0, 0));
        Err2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Err2.setText("  Incorrect Student ID !  Please try again..");
        StudentPnl.add(Err2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        Delete.setBackground(new java.awt.Color(102, 0, 102));
        Delete.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Delete.setText("Delete");
        Delete.setOpaque(true);
        Delete.setPreferredSize(null);
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteMouseExited(evt);
            }
        });
        StudentPnl.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 280, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Enter Student ID :");
        StudentPnl.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        close2.setBackground(new java.awt.Color(255, 255, 255));
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
        StudentPnl.add(close2, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 0, 50, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Trash_18px_1.png"))); // NOI18N
        jLabel6.setText(" Remove Student");
        jLabel6.setOpaque(true);
        StudentPnl.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 556, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jDialogStudentsLayout = new javax.swing.GroupLayout(jDialogStudents.getContentPane());
        jDialogStudents.getContentPane().setLayout(jDialogStudentsLayout);
        jDialogStudentsLayout.setHorizontalGroup(
            jDialogStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialogStudentsLayout.setVerticalGroup(
            jDialogStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1030, 630));
        setMinimumSize(new java.awt.Dimension(1030, 630));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1030, 630));
        setSize(new java.awt.Dimension(1030, 630));
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Remove /");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Delete book or student");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/pnl123.jpg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 220));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 960, 220));

        U1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Cancel_48px.png"))); // NOI18N
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
        jPanel1.add(U1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 100, 100));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 80, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Student");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 80, -1));

        U2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Remove_Administrator_48px.png"))); // NOI18N
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
        jPanel1.add(U2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 100, 100));

        m1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Circled_Thin_20px.png"))); // NOI18N
        jPanel1.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        m2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Package/icons8_Circled_Thin_20px.png"))); // NOI18N
        jPanel1.add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

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

    private void U1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U1MouseClicked
        ii = new ImageIcon(getClass().getResource("icons8_New_Moon_20px.png"));
        m1.setIcon(ii);
        ii = new ImageIcon(getClass().getResource("icons8_Circled_Thin_20px.png"));
        m2.setIcon(ii);
        
        jDialogBook.setVisible(true);
        jDialogBook.setLocationRelativeTo(null);
    }//GEN-LAST:event_U1MouseClicked

    private void U1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U1MouseEntered
        ii = new ImageIcon(getClass().getResource("icons8_Cancel_48px_1.png"));
        U1.setIcon(ii);
    }//GEN-LAST:event_U1MouseEntered

    private void U1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U1MouseExited
        ii = new ImageIcon(getClass().getResource("icons8_Cancel_48px.png"));
        U1.setIcon(ii);
    }//GEN-LAST:event_U1MouseExited

    private void U2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U2MouseClicked
        ii = new ImageIcon(getClass().getResource("icons8_New_Moon_20px.png"));
        m2.setIcon(ii);
        ii = new ImageIcon(getClass().getResource("icons8_Circled_Thin_20px.png"));
        m1.setIcon(ii);
        
        jDialogStudents.setVisible(true);
        jDialogStudents.setLocationRelativeTo(null);

    }//GEN-LAST:event_U2MouseClicked

    private void U2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U2MouseEntered
        ii = new ImageIcon(getClass().getResource("icons8_Remove_Administrator_48px_1.png"));
        U2.setIcon(ii);
    }//GEN-LAST:event_U2MouseEntered

    private void U2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U2MouseExited
        ii = new ImageIcon(getClass().getResource("icons8_Remove_Administrator_48px.png"));
        U2.setIcon(ii);
    }//GEN-LAST:event_U2MouseExited

    private void bookidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookidFocusGained
        bookid.setText("");
    }//GEN-LAST:event_bookidFocusGained

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        bookid.setText("");
        isbn.setText(" ");
        booktitle.setText(" ");
        author.setText(" ");
        edition.setText(" ");
        type.setText("");
        price.setText(" ");

    }//GEN-LAST:event_clearMouseClicked

    private void deletebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebookMouseClicked
        String sql="delete from books where bookid=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,bookid.getText());

            pst.execute();

            JOptionPane.showMessageDialog(null,"Book is Deleted");

            rs.close();
            pst.close();

        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_deletebookMouseClicked

    private void deletebookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebookMouseEntered
        deletebook.setBackground(new Color (102,0,102));
    }//GEN-LAST:event_deletebookMouseEntered

    private void deletebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebookMouseExited
        deletebook.setBackground(new Color (51,0,51));
    }//GEN-LAST:event_deletebookMouseExited

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        String a1= bookid.getText();
        String sql = "select * from books where bookid='"+a1+"'";
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if (rs.next()){
                booktitle.setText(rs.getString(3));
                author.setText(rs.getString(4));
                type.setText(rs.getString(6));
                isbn.setText(rs.getString(2));
                price.setText(rs.getString(7));
                edition.setText(rs.getString(5));
                search.setVisible(false);
                Err1.setVisible(false);
                rs.close();
                pst.close();
            }
            else{
                Err1.setVisible(true);
            }
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_searchMouseClicked

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        search.setOpaque(true);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        search.setOpaque(false);
    }//GEN-LAST:event_searchMouseExited

    private void isbnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_isbnFocusGained
        //isbn.setText("");
    }//GEN-LAST:event_isbnFocusGained

    private void booktitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_booktitleFocusGained
        //booktitle.setText("");
    }//GEN-LAST:event_booktitleFocusGained

    private void authorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_authorFocusGained
        //author.setText("");
    }//GEN-LAST:event_authorFocusGained

    private void editionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editionFocusGained
        //edition.setText("");
    }//GEN-LAST:event_editionFocusGained

    private void typeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typeFocusGained
       // type.setText("");
    }//GEN-LAST:event_typeFocusGained

    private void priceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceFocusGained
       // price.setText("");
    }//GEN-LAST:event_priceFocusGained

    private void clearBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBookMouseClicked

    private void clearBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBookMouseEntered
        clearBook.setBackground(new Color (102,0,102));
    }//GEN-LAST:event_clearBookMouseEntered

    private void clearBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBookMouseExited
        clearBook.setBackground(new Color (51,0,51));
    }//GEN-LAST:event_clearBookMouseExited

    private void studentidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentidFocusGained
        //studentid.setText("");
    }//GEN-LAST:event_studentidFocusGained

    private void regnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regnoFocusGained
        //regno.setText("");
    }//GEN-LAST:event_regnoFocusGained

    private void firstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnameFocusGained
        //firstname.setText("");
    }//GEN-LAST:event_firstnameFocusGained

    private void lastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusGained
        //lastname.setText("");
    }//GEN-LAST:event_lastnameFocusGained

    private void gradeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gradeFocusGained
        //grade.setText("");
    }//GEN-LAST:event_gradeFocusGained

    private void contactnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactnoFocusGained
        //contactno.setText("");
    }//GEN-LAST:event_contactnoFocusGained

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        //email.setText("");
    }//GEN-LAST:event_emailFocusGained

    private void clear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear1MouseClicked
        
    }//GEN-LAST:event_clear1MouseClicked

    private void clearStMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearStMouseClicked
        studentid.setText(" ");
        regno.setText(" ");
        firstname.setText(" ");
        lastname.setText(" ");
        grade.setText(" ");
        contactno.setText(" ");
        email.setText(" ");
    }//GEN-LAST:event_clearStMouseClicked

    private void clearStMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearStMouseEntered
        clearSt.setBackground(new Color (102,0,102));
    }//GEN-LAST:event_clearStMouseEntered

    private void clearStMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearStMouseExited
        clearSt.setBackground(new Color (51,0,51));
    }//GEN-LAST:event_clearStMouseExited

    private void searchstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchstudentMouseClicked
        String a1= studentid.getText();
        String sql = "select * from students where studentid='"+a1+"'";
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if (rs.next()){
                regno.setText(rs.getString(2));
                firstname.setText(rs.getString(3));
                grade.setText(rs.getString(5));
                lastname.setText(rs.getString(4));
                contactno.setText(rs.getString(6));
                email.setText(rs.getString(7));
                Err2.setVisible(false);
                Err1.setVisible(false);
                rs.close();
                pst.close();
            }
            else{
                Err2.setVisible(true);
            }
        }catch(Exception ex){
            // JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_searchstudentMouseClicked

    private void searchstudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchstudentMouseEntered
        searchstudent.setOpaque(true);
    }//GEN-LAST:event_searchstudentMouseEntered

    private void searchstudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchstudentMouseExited
        searchstudent.setOpaque(false);
    }//GEN-LAST:event_searchstudentMouseExited

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        String sql="delete from students where studentid=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,studentid.getText());

            pst.execute();

            JOptionPane.showMessageDialog(null,"Student is Deleted");

            rs.close();
            pst.close();

        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_DeleteMouseClicked

    private void DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseEntered
        Delete.setBackground(new Color (102,0,102));
    }//GEN-LAST:event_DeleteMouseEntered

    private void DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseExited
        Delete.setBackground(new Color (51,0,51));
    }//GEN-LAST:event_DeleteMouseExited

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
        jDialogBook.dispose();
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

    private void close2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseExited
        close2.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_close2MouseExited

    private void close2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseEntered
        close2.setBackground(new Color(60,60,60));
    }//GEN-LAST:event_close2MouseEntered

    private void close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseClicked
        jDialogStudents.dispose();
    }//GEN-LAST:event_close2MouseClicked
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
            java.util.logging.Logger.getLogger(remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new remove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel A4;
    private javax.swing.JPanel BookPnl;
    private javax.swing.JLabel Btn1;
    private javax.swing.JLabel Btn2;
    private javax.swing.JLabel Btn3;
    private javax.swing.JLabel Btn5;
    private javax.swing.JLabel Btn6;
    private javax.swing.JLabel Delete;
    private javax.swing.JLabel Err1;
    private javax.swing.JLabel Err2;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JPanel StudentPnl;
    private javax.swing.JPanel Traveller;
    private javax.swing.JLabel U1;
    private javax.swing.JLabel U2;
    private javax.swing.JTextField author;
    private javax.swing.JLabel back;
    private javax.swing.JTextField bookid;
    private javax.swing.JTextField booktitle;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel clear1;
    private javax.swing.JLabel clearBook;
    private javax.swing.JLabel clearSt;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel close2;
    private javax.swing.JTextField contactno;
    private javax.swing.JLabel deletebook;
    private javax.swing.JTextField edition;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField grade;
    private javax.swing.JTextField isbn;
    private javax.swing.JDialog jDialogBook;
    private javax.swing.JDialog jDialogStudents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m2;
    private javax.swing.JLabel menu;
    private javax.swing.JTextField price;
    private javax.swing.JTextField regno;
    private javax.swing.JLabel search;
    private javax.swing.JLabel searchstudent;
    private javax.swing.JTextField studentid;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
