/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static controller.UserDAO.getKhachHang;
import static controller.thoikhoabieuDAO.deletaAllThoiKhoaBieu;
import static controller.thoikhoabieuDAO.insertMonHoc;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tuan
 */
public class DangKyTest {
    
    public DangKyTest() {
    }
    
    @Test
    public void testInsert1(){
        deletaAllThoiKhoaBieu();
        String rs1 = insertMonHoc("B211");
        String exp1 = "Lop Hoc da day!";
        assertEquals(exp1, rs1);
        
        deletaAllThoiKhoaBieu();
        insertMonHoc("B123");
        String rs2 = insertMonHoc("B115");
        String exp2 = "Mon hoc da duoc dang ky!";
        assertEquals(exp2, rs2);
        
        deletaAllThoiKhoaBieu();
        String rs3 = insertMonHoc("B781");
        String exp3 = "Dang ky thanh cong!";
        assertEquals(exp3, rs3);
        
        deletaAllThoiKhoaBieu();
        insertMonHoc("B123");
        String rs4 = insertMonHoc("A216");
        String exp4 = "Mon hoc bi trung lich hoc!";
        assertEquals(exp4, rs4);
        
    }
}
