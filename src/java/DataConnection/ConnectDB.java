/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tuan
 */
public class ConnectDB {
    // DB Connection variables
    
    static Connection connection = null;
    static String databaseName = "studentdatabase";
    static String url = "jdbc:mysql://localhost:3306/" + databaseName;
    
    static String username = "root";
    static String password = "tuan@314159";
    
    
    public static String getKhachHang(String name, String pass)
    {
        
        System.out.println("USER: " + username);
        System.out.println("Password: " + password);
        if(name == "")
            return "EMPTY NAME;";
        if(password == "")
        {
            System.out.println("EMPTY PASSWORD");
            return "EMPTY PASSWORD";
        }
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = connection.prepareStatement("select * from student where name=? and password=?");
            ps.setString(1, name);
            ps.setString(2, pass);
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {

                int id=rs.getInt(1);
                String ten=rs.getString(2);
                System.out.println("LOGIN SUCCESSFUL");
                return "LOGIN SUCCESSFUL";
            }
                                  
        }
        catch(Exception e)
        {
            System.out.println(e);
            return "LOGIN SUCCESSFUL";
        }
        
        return "LOGIN FAILURE";
    }
    
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
        getKhachHang("taAnhTuan", "123");
//           try{
////               getKhachHang("taAnhTuan", "123");
//                System.out.println("Now connecting to databse...\n");
//                Class.forName("com.mysql.jdbc.Driver").newInstance();
//                connection = DriverManager.getConnection(url, username, password);
//                System.out.println("Database is connected");
//                PreparedStatement ps = connection.prepareStatement("INSERT INTO student (`name`, `password`) VALUES ('taAnhTuan', 'abcxyz');");
//
//                int status = ps.executeUpdate();
//                if(status != 0)
//                {
//                    System.out.println("Recore is INSERTED");
//                }
//                                  
//           }
//           catch(Exception e)
//           {
//               System.out.println(e);
//           }
        
    }     
}
