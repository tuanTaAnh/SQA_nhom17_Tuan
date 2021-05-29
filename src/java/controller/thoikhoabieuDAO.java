/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tuan
 */
public class thoikhoabieuDAO {
    public static String[] getThoiKhoaBieu()
    {
        
        Connection connection = null;
        String databaseName = "studentdatabase";
        String url = "jdbc:mysql://localhost:3306/" + databaseName + "?autoReconnect=true&useSSL=false";
        
        String usernameDB = "root";
        String passwordDB = "tuan@314159";
        
        try{
            int flag = 0;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, usernameDB, passwordDB);
            
            PreparedStatement ps = connection.prepareStatement(
                    "Select * from thoikhoabieu tkb, lophoc lh where  tkb.maLopHoc = lh.maLopHoc;");
//                    "select * from thoikhoabieu full outer join lophoc on thoikhoabieu.maLopHoc=lophoc.maLopHoc");
            
//            SELECT Customers.CustomerName, Orders.OrderID
//            FROM Customers
//            FULL OUTER JOIN Orders ON Customers.CustomerID=Orders.CustomerID
//            ORDER BY Customers.CustomerName;
            
            ResultSet rs=ps.executeQuery();
            
            String[] rsArray = new String[100];
            int numMH = 1;
            
            while(rs.next()) {
                String maLH = rs.getString(2);
                String maMH = rs.getString(5);
                String tenMH = rs.getString(6);
                String tenGV = rs.getString(8);
                int soTC = rs.getInt(10);
                String lopHoc = rs.getString(11);
                String tgHoc = rs.getString(12);
                
//                System.out.println("maLH: " + maLH);
//                System.out.println("maMH: " + maMH);
//                System.out.println("tenMH: " + tenMH);
//                System.out.println("tenGV: " + tenGV);
//                System.out.println("soTC: " + soTC);
//                System.out.println("lopHoc: " + lopHoc);
//                System.out.println("tgHoc: " + tgHoc);
                
                rsArray[numMH] = maLH + ";" + maMH + ";" + tenMH + ";" + tenGV + ";" + soTC + ";" + lopHoc + ";" + tgHoc;
                numMH++;
            }
            
//            System.out.println("Register SUCCESS");
            rsArray[0] = "Lay thanh cong!";
            return rsArray;                        
        }
        catch(Exception e)
        {
            String[] rsArray = new String[100];
            System.out.println(e);
            rsArray[0] = "Lỗi kết nối!" + e;
            return rsArray;
        }

    }
    
    public static String insertMonHoc(String name)
    {
        
        Connection connection = null;
        String databaseName = "studentdatabase";
        String url = "jdbc:mysql://localhost:3306/" + databaseName + "?autoReconnect=true&useSSL=false";

        String usernameDB = "root";
        String passwordDB = "tuan@314159";
        
        if(name == "" || name == null)
        {
            System.out.println("EMPTY NAME");
            return "Ten bi bo trong!";
        } 
        
        try{
            int flagMaMH = 0;
            int flagKipHoc = 0;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, usernameDB, passwordDB);
            
            String maMHInsert = "";
            String kipHocInsert = "";
            PreparedStatement ps = connection.prepareStatement("select * from lophoc where maLopHoc=?");
            ps.setString(1, name);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                maMHInsert = rs.getString(3);
                kipHocInsert = rs.getString(11);
            }
            System.out.println("maMHInsert: " + maMHInsert);
            System.out.println("kipHocInsert: " + kipHocInsert);
            
            PreparedStatement ps1 = connection.prepareStatement(
                    "Select * from thoikhoabieu tkb, lophoc lh where  tkb.maLopHoc = lh.maLopHoc;");
            
            ResultSet rs1=ps1.executeQuery();
            while(rs1.next()) {
                String maMH = rs1.getString(5);
                String kipHoc = rs1.getString(13);
                System.out.println("maMH: " + maMH);
                System.out.println("kipHoc: " + kipHoc);
                if(maMH.equals(maMHInsert)) flagMaMH = 1;
                if(kipHoc.equals(kipHocInsert)) flagKipHoc = 1;
            }
            
            if(flagMaMH == 1)
            {
                System.out.println("Register fail");
                return "Mon hoc da duoc dang ky!";
            }
            else if(flagKipHoc == 1)
            {
                System.out.println("Register fail");
                return "Mon hoc bi trung lich hoc!";
            }
            {
                int flagConLai = 0;
                String x = "";
                PreparedStatement ps2 = connection.prepareStatement("select * from lophoc where maLopHoc=?");
                ps2.setString(1, name);
                ResultSet rs2=ps2.executeQuery();
                
                while(rs2.next())
                {
                    int conLai = rs2.getInt(10);
                    System.out.println("conLai: " + conLai);
                    if(conLai == 0) flagConLai = 1;
                    x += conLai + " ";
                }
                
                if(flagConLai == 1)
                {
                    System.out.println("Register fail");
                    return "Lop Hoc da day!";
                }
                PreparedStatement ps3 = connection.prepareStatement("INSERT INTO thoikhoabieu(maLopHoc) VALUES (?)");
                ps3.setString(1, name);
                ps3.executeUpdate();
            
                System.out.println("LOGIN SUCCESS");
                return "Dang ky thanh cong!";
            }                         
        }
        catch(Exception e)
        {
            System.out.println(e);
            return "Lỗi kết nối!" + e;
        }

    }
    
    public static String deleteMonHoc(String maLH)
    {
        Connection connection = null;
        String databaseName = "studentdatabase";
        String url = "jdbc:mysql://localhost:3306/" + databaseName + "?autoReconnect=true&useSSL=false";

        String usernameDB = "root";
        String passwordDB = "tuan@314159";
        
        if(maLH == "" || maLH == null)
        {
            System.out.println("EMPTY NAME");
            return "Ten bi bo trong!";
        } 
        
        try{
            int flag = 0;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, usernameDB, passwordDB);
            
            PreparedStatement ps = connection.prepareStatement("delete from thoikhoabieu where maLopHoc=?");
            ps.setString(1, maLH);

            ps.executeUpdate();

            System.out.println("LOGIN SUCCESS");
            return "Xoa thanh cong!";                       
        }
        catch(Exception e)
        {
            System.out.println(e);
            return "Lỗi kết nối!" + e;
        }

    }
    
     public static String saveThoiKhoaBieu()
     {
        String[] rsArray = getThoiKhoaBieu();
        
        int tongTC = 0;
        String notice = "";
        
        int len = rsArray.length;
        System.out.println("len: " + len);
        int i = 1;
        while(i < len && rsArray[i] != null)
        {
            String[] arrVal = rsArray[i].split(";");
            int soTC = parseInt(arrVal[4]);
            System.out.println("rs: " + soTC);
            tongTC += soTC;
            i++;
        }
        
        if(tongTC > 8)
        {
            return "Đăng ký quá số lượng tín chỉ!";
        }
        else if(tongTC < 4)
        {
            return "Đăng ký chưa đủ số lượng tín chỉ!";
        }
        
        return "Số lượng tín chỉ hợp lệ. Lưu thành công!";
     }
     
     public static String deletaAllThoiKhoaBieu()
     {
        Connection connection = null;
        String databaseName = "studentdatabase";
        String url = "jdbc:mysql://localhost:3306/" + databaseName + "?autoReconnect=true&useSSL=false";

        String usernameDB = "root";
        String passwordDB = "tuan@314159";

        
        try{
            int flag = 0;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, usernameDB, passwordDB);
            
            PreparedStatement ps = connection.prepareStatement("delete from thoikhoabieu");

            ps.executeUpdate();

            System.out.println("LOGIN SUCCESS");
            return "Xoa thanh cong!";                       
        }
        catch(Exception e)
        {
            System.out.println(e);
            return "Lỗi kết nối!" + e;
        }
     }
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
//        String rs = insertMonHoc("B211");
//        System.out.println("rs: " + rs);
//        String rsTKB = "";
//        String[] rsArray = getThoiKhoaBieu();
//        int len = rsArray.length;
//        System.out.println("len: " + len);
//        int i = 1;
//        while(i < len && rsArray[i] != null)
//        {
//            String[] arrVal = rsArray[i].split(";");
//            int soTC = parseInt(arrVal[4]);
//            System.out.println("rs: " + soTC);
//            i++;
//        }
//        String rs = deleteMonHoc("B123");
//        System.out.println("rs: " + rs);
//        String notice = saveThoiKhoaBieu();
//        System.out.println("rs: " + notice);
//        String notice = deletaAllThoiKhoaBieu();
//        System.out.println("rs: " + notice);
        
        
//        deletaAllThoiKhoaBieu();
//        String rs2 = insertMonHoc("B211");
        
//        deletaAllThoiKhoaBieu();
//        insertMonHoc("B123");
//        String rs2 = insertMonHoc("B115");
        
        deletaAllThoiKhoaBieu();
        insertMonHoc("B123");
        String rs2 = insertMonHoc("A216");
        
        System.out.println("rs: " + rs2);
    }
}
