/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static controller.MonHocDAO.getLopHoc;
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
public class TimKiemTest {
    
    public TimKiemTest() {
    }
    
    @Test()
    public void testTimKiem()
    {
        String[] rs1 = getLopHoc("Đảm Bảo Chất Lượng Phần Mềm");
        String[] exp1 = new String[100];
        exp1[0] = "LOGINSUCCESSFUL";
        exp1[1] = "B214;DBCL;Đảm Bảo Chất Lượng Phần Mềm;Đỗ Thị Bích Ngọc;30;3;504;5;Kíp 2 Thứ 6";
        exp1[2] = "B211;DBCL;Đảm Bảo Chất Lượng Phần Mềm;Đỗ Thị Bích Ngọc;40;3;204;0;Kíp 6 Thứ 3";
        exp1[3] = "B781;DBCL;Đảm Bảo Chất Lượng Phần Mềm;Đỗ Thị Bích Ngọc;50;3;202;3;Kíp 3 Thứ 4";
        assertEquals(exp1, rs1);
        
        String[] rs2 = getLopHoc("");
        String[] exp2 = new String[100];
        exp2[0] = "Tên môn học bị bỏ trống!";
        assertEquals(exp2, rs2);
        
        String[] rs3 = getLopHoc("abc");
        String[] exp3 = new String[100];
        exp3[0] = "LOGINFAILURE";
        assertEquals(exp3, rs3);
        
    }
}
