package controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpSession;
import model.User;


public class UserDAO {

    public UserDAO() {
    }
    
    public User checkLogin(String user, String pass) throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseName=sqa_demo", "root", "viet1999");
        
        String sql = "SELECT username, password FROM user WHERE username = ? AND password = ?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, user);
        stm.setString(2, pass);
        
        ResultSet rs = stm.executeQuery();
        User us = null;
        if(rs.next()){
            us = new User(rs.getString("username"), rs.getString("password"));
        }
        conn.close();
        stm.close();
        rs.close();
        
        return us;
    }
    
    public static String getKhachHang(String name, String pass)
    {
        
        Connection connection = null;
        String databaseName = "studentdatabase";
        String url = "jdbc:mysql://localhost:3306/" + databaseName + "?autoReconnect=true&useSSL=false";

        String usernameDB = "root";
        String passwordDB = "tuan@314159";
        
        if(name == "" || pass == "" || name == null || pass == null)
        {
//            System.out.println("EMPTY NAME OR PASSWORD");
            return "Tên hoặc mật khẩu bị bỏ trống!";
        } 
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, usernameDB, passwordDB);
            PreparedStatement ps = connection.prepareStatement("select * from user where userName=? and password=?");
            ps.setString(1, name);
            ps.setString(2, pass);
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {

                int id=rs.getInt(1);
                String user = rs.getString(2);
                String education = rs.getString(4);
                String address = rs.getString(5);
                String major = rs.getString(6);
                
                
//                System.out.println("LOGIN SUCCESSFUL WITH USERID: " + id + " " + user + " " + education + " " + address + " " + major);
                return "LOGINSUCCESSFUL"+ ";" + user + ";" + education + ";" + address + ";" + major;
//                return "LOGINSUCCESSFUL;tuan;Học viện Công nghệ Bưu chính Viễn thông;Hà Đông, Hà Nội;Công Nghệ Phần Mềm";   
            }
                                  
        }
        catch(Exception e)
        {
            System.out.println(e);
            return "Lỗi kết nối!" + e;
        }
        
        System.out.println("LOGIN FAILURE");
        return "Sai mật khẩu hoặc tên đăng nhập!";
    }
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
        String rs = getKhachHang("tuanUser", "123456");
        System.out.println("rs: " + rs);
        rs = getKhachHang("tuan", "123");
        System.out.println("rs: " + rs);
    }     

    
}
