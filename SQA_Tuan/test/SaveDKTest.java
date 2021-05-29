/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static controller.thoikhoabieuDAO.deletaAllThoiKhoaBieu;
import static controller.thoikhoabieuDAO.insertMonHoc;
import static controller.thoikhoabieuDAO.saveThoiKhoaBieu;
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
public class SaveDKTest {
    
    public SaveDKTest() {
    }
    
    @Test
    public void testInsert1(){
        deletaAllThoiKhoaBieu();
        insertMonHoc("B123");
        insertMonHoc("B781");
        String rs1 = saveThoiKhoaBieu();
        String exp1 = "Số lượng tín chỉ hợp lệ. Lưu thành công!";
        assertEquals(exp1, rs1);
        
        deletaAllThoiKhoaBieu();
        insertMonHoc("B123");
        insertMonHoc("B781");
        insertMonHoc("A246");
        String rs2 = saveThoiKhoaBieu();
        String exp2 = "Đăng ký quá số lượng tín chỉ!";
        assertEquals(exp2, rs2);
        
        deletaAllThoiKhoaBieu();
        insertMonHoc("B123");
        String rs3 = saveThoiKhoaBieu();
        String exp3 = "Đăng ký chưa đủ số lượng tín chỉ!";
        assertEquals(exp3, rs3);
        
    }
}
