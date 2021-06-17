
package App_Package;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author PC
 */
public class appcode {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    //public void inserttologoin(){
    /*String sql="Insert into loggin(username,password)values(?,?)";
        try {

            pst=conn.prepareStatement(sql);
            pst.setString(1,username.getText());
            pst.setString(2,password.getText()); pst.execute();
          
            rs.close();
            pst.close();

        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null,ex);
        }
}
public void exitfromlogin(){
        String sql="delete from loggin where username=?";
        try {
            pst=conn.prepareStatement(sql);
            // pst.setString(1,UserName.getText());
       
            pst.execute(); rs.close();
            pst.close();

        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null,ex);
        }
}*/
}
