/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.MonHocDAO.getLopHoc;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
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
@WebServlet(name = "dangky", urlPatterns = {"/dangky"})
public class dangky extends HttpServlet {

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
        
        String tenMonHocSearch = request.getParameter("search");
        HttpSession session = request.getSession();
        if(tenMonHocSearch.equals(""))
        {
            session.setAttribute("noticeDK", "Tên môn bị bỏ trống");
            request.getRequestDispatcher("dangkymon.jsp").forward(request, response);
        }
             
        
        String[] rsArray = getLopHoc(tenMonHocSearch);
        int len = rsArray.length;
        String rs = "";
        int i = 1;
        
        while(i < len && rsArray[i] != null)
        {
            rs += rsArray[i] + "<br>";
            i++;
        }
        
        session.setAttribute("len", i-1);
        session.setAttribute("resultDKM", rs);
        
//        session.setAttribute("noticeDK", rsArray[0]);
        if(rsArray[0].equals("LOGINSUCCESSFUL"))
        {
            session.setAttribute("noticeDK", "OK");
        }
        else
        {
            session.setAttribute("noticeDK", "Sai tên môn học!");
        }
       
        request.getRequestDispatcher("dangkymon.jsp").forward(request, response);
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
