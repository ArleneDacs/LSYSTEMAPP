
package lsystemapp;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class db {

    public static Connection mycon(){
    
        Connection con = null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
      con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/login1","root","");
        
        }catch (ClassNotFoundException | SQLException e){
        System.out.println(e);
        }
        
      return con;  
    
    }

}
   
   