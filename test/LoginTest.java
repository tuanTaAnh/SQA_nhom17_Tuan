/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static controller.UserDAO.getKhachHang;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author tuan
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @Test
    public void testInsert1(){
        String rs1 = getKhachHang("", "");
        String exp1 = "Tên hoặc mật khẩu bị bỏ trống!";
        assertEquals(exp1, rs1);
        
        String rs2 = getKhachHang("tuan", "");
        assertEquals("Tên hoặc mật khẩu bị bỏ trống!", rs2);
        
        String rs3 = getKhachHang("", "abc");
        assertEquals("Tên hoặc mật khẩu bị bỏ trống!", rs3);
        
        String rs4 = getKhachHang("taAnhTuan", "123");
        assertEquals("Sai mật khẩu hoặc tên đăng nhập!", rs4);
        
        String rs5 = getKhachHang("tuan", "123");
        assertEquals("LOGINSUCCESSFUL;tuan;Học viện Công nghệ Bưu chính Viễn thông;Hà Đông, Hà Nội;Công Nghệ Phần Mềm", rs5);
    }
    
}
