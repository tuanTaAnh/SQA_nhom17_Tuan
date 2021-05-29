package controller;

import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.MonHoc;

public class MonHocDAO {
    public ArrayList<MonHoc> listMH;
    
    public void getAllMH(){
        listMH = new ArrayList<MonHoc>();
        MonHoc mh1 = new MonHoc("1", "SQA", 3, 1440000, "Đ.T.B.Ngọc");
        MonHoc mh2 = new MonHoc("2", "MAD", 3, 1440000, "N.H.Anh");
        MonHoc mh3 = new MonHoc("3", "SOC", 3, 1440000, "N.T.Khanh");
        listMH.add(mh1);
        listMH.add(mh2);
        listMH.add(mh3);
        
    }
    public MonHoc timTheoMa(String maMH){
        for(MonHoc mh:listMH){
            if(mh.getMaMH() == maMH){
                return mh;
            }
        }
        return null;
    }
    public MonHoc timTheoTen(String tenMH){
        for(MonHoc mh:listMH){
            if(mh.getTenMH()== tenMH){
                return mh;
            }
        }
        return null;
    }
    
    public static String[] getLopHoc(String name)
    {
        
        Connection connection = null;
        String databaseName = "studentdatabase";
        String url = "jdbc:mysql://localhost:3306/" + databaseName + "?autoReconnect=true&useSSL=false";

        String usernameDB = "root";
        String passwordDB = "tuan@314159";
        
        if(name == "")
        {
            String[] rsArray = new String[100];
            System.out.println("EMPTY NAME");
            rsArray[0] = "Tên môn học bị bỏ trống!";
            return rsArray;
        } 
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, usernameDB, passwordDB);
            PreparedStatement ps = connection.prepareStatement("select * from lophoc where tenMonHoc=?");
            ps.setString(1, name);
            ResultSet rs=ps.executeQuery();
            int flag = 0;
            
            String[] rsArray = new String[100];
            
            int numOfLopHoc = 1;
            while(rs.next()) {

                int id=rs.getInt(1);
                String maLopHoc = rs.getString(2);
                String maMonHoc = rs.getString(3);
                String tenMonHoc = rs.getString(4);
                int soLuong = rs.getInt(5);
                String tenGV = rs.getString(6);
                String dkSV = rs.getString(7);
                int soTC = rs.getInt(8);
                String lopHoc = rs.getString(9);
                int conLai = rs.getInt(10);
                String thoiGianHoc = rs.getString(11);
                rsArray[numOfLopHoc] = maLopHoc + ";" + maMonHoc + ";" + tenMonHoc + ";" + tenGV + ";" + soLuong + ";" + soTC + ";" + lopHoc + ";" + conLai + ";" + thoiGianHoc;
                numOfLopHoc++;
//                System.out.println("LOGIN SUCCESSFUL WITH USERID: " + id + " " + maLopHoc + " " + maMonHoc + " " + 
//                                                                tenMonHoc + " " + tenGV + " " + soLuong + " " + soTC);
                flag = 1;
            }
            
            if(flag == 1)
            {
                rsArray[0] = "LOGINSUCCESSFUL";
                return rsArray;
            }
            else
            {
                System.out.println("LOGIN FAILURE");
                rsArray[0] = "LOGINFAILURE";
                return rsArray;
            }
                                  
        }
        catch(Exception e)
        {
            String[] rsArray = new String[2];
            System.out.println(e);
            rsArray[0] = "Lỗi kết nối!" + e;
            return rsArray;
        }
    }
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
        String[] rsArray = getLopHoc("Đảm Bảo Chất Lượng Phần Mềm");
        int len = rsArray.length;
        String rs = "";
        int i = 1;
        while(i < len && rsArray[i] != null)
        {

//            String[] splitRS = rsArray[i].split(";");
//            int leng = splitRS.length;
            System.out.println("rsArray[i]: " + rsArray[i]);
//            System.out.println("leng: " + leng);
//            for(int j = 0; j < leng;j++)
//            {
//                System.out.println("a: " + splitRS[j]);
//            }
//            String maLopHoc = splitRS[0];
//            String maMonHoc = splitRS[1];
//            String tenMonHoc = splitRS[2];
//            rs += rsArray[i] + "<br>";
            i++;
        }
//        System.out.println(rs);
//        try {
//                System.out.println(URLDecoder.decode("Äáº£m Báº£o Cháº¥t LÆ°á»£ng Pháº§n Má»m", "UTF-8"));
//            } 
//            catch (Exception e) {
//                e.printStackTrace();
//        }
    }  
}
