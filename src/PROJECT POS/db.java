package Simple_POS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    
    public static Connection mycon() throws SQLException{
        Connection con = null ; 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/login3","root","");       
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return con;
    }
}
