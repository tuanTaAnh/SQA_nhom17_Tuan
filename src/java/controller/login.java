/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.UserDAO.getKhachHang;
import static controller.thoikhoabieuDAO.getThoiKhoaBieu;
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
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

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
        
        
        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        
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
        
        String rs = getKhachHang(username, password);
        
        session.setAttribute("result", rs);
        
        String checkDangNhap = "YES";
        session.setAttribute("checkDangNhap", checkDangNhap);
        
//        request.getRequestDispatcher("default.jsp").forward(request, response);
        
        String[] splitRS = rs.split(";");
        if (splitRS[0].equals("LOGINSUCCESSFUL")) {
            String user = splitRS[1];
            String education = splitRS[2];
            String address = splitRS[3];
            String major = splitRS[4];
            
            session.setAttribute("user", user);
            session.setAttribute("university", education);
            session.setAttribute("address", address);
            session.setAttribute("major", major);
            
            session.setAttribute("result", "");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        else
        {
            request.getRequestDispatcher("dangnhap.jsp").forward(request, response);
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
