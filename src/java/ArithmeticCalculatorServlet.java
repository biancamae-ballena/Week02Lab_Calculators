/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 785284
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        
        String firstValue = request.getParameter("first");
        String secondValue = request.getParameter("second");
        
        String bAdd = request.getParameter("add");
        String bSub = request.getParameter("sub");
        String bMul = request.getParameter("mul");
        String bMod = request.getParameter("mod");
        
        request.setAttribute("first", firstValue);
        request.setAttribute("second", secondValue);
        
        if (firstValue != null && secondValue != null) {
            if (!firstValue.equals("") && !secondValue.equals("")) {
                try {
                    int first = Integer.parseInt(firstValue);
                    int second = Integer.parseInt(secondValue);
                    if (bAdd != null) {
                        request.setAttribute("result", first + second);
                    } else if (bSub != null) {
                        request.setAttribute("result", first - second);
                    } else if (bMul != null) {
                        request.setAttribute("result", first * second);
                    } else if (bMod != null) {
                        request.setAttribute("result", first % second);
                    }
                } catch (NumberFormatException e) {
                    request.setAttribute("result", "Invalid.");
                }
            } else {
                request.setAttribute("result", "Invalid.");
            }
        } else {
            request.setAttribute("result", "---");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
