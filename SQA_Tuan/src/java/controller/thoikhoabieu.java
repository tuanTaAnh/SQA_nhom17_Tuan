/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.thoikhoabieuDAO.getThoiKhoaBieu;
import static controller.thoikhoabieuDAO.insertMonHoc;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tuan
 */
@WebServlet(name = "thoikhoabieu", urlPatterns = {"/thoikhoabieu"})
public class thoikhoabieu extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        
        String maLH = request.getParameter("maLH");
        String rs = insertMonHoc(maLH);
        
        if(rs.equals("Mon hoc da duoc dang ky!"))
        {
            HttpSession session = request.getSession();
            session.setAttribute("noticeDK", "Mon hoc da duoc dang ky. Vui lòng xóa lớp đã đăng ký để đăng ký lại!");
            request.getRequestDispatcher("dangkymon.jsp").forward(request, response);
        }
        else if(rs.equals("Lop Hoc da day!"))
        {
            HttpSession session = request.getSession();
            session.setAttribute("noticeDK", "Lop hoc da day. Vui Long chon lop khac!");
            request.getRequestDispatcher("dangkymon.jsp").forward(request, response);
        }
        else if(rs.equals("Mon hoc bi trung lich hoc!"))
        {
            HttpSession session = request.getSession();
            session.setAttribute("noticeDK", "Mon hoc bi trung lich hoc!");
            request.getRequestDispatcher("dangkymon.jsp").forward(request, response);
        }
        else
        {
            String rsTKB = "";
            String[] rsArray = getThoiKhoaBieu();
            int len = rsArray.length;
            int i = 0;
            while(i < len && rsArray[i] != null)
            {
                rsTKB += rsArray[i] + "<br>";
                i++;
            }

            HttpSession session = request.getSession();
            session.setAttribute("resultTKB", rsTKB);
            session.setAttribute("resultFC", rs);
            session.setAttribute("noticeSaveTKB", "");

            request.getRequestDispatcher("thoikhoabieu.jsp").forward(request, response);
        }
                 
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
