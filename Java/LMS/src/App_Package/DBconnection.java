
package App_Package;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level; 
import java.util.logging.Logger;

public class DBconnection {
    Connection conn;
    public static Connection getConnection(){
          
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/xdb","root","");
             return conn;       
        } catch (Exception ex) {
           //JOptionPane.showMessageDialog(null,ex);
            return null;
        }
       
    }
}
