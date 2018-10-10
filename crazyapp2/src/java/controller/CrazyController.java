/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manu
 */
public class CrazyController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.sendRedirect("vistaoperacion.jsp");
       /*
       response.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CrazyController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action='CrazyController' method='POST'>");
            out.print("nombre");
            out.println("<input type='text' name='usuario' required><br>");
            out.print("numero1");
            out.println("<input type='text' name='num1' required><br>");
            out.print("numero2");
            out.println("<input type='text' name='num2' required><br>");
            out.println("<input type='hidden' name='operacion' value='suma'>");
            out.println("<input type='submit' value='Confirmar'>");
       */
         
       /*
             <form action="CrazyController" method="POST">
      Nombre:
      <input type="text" name="usuario" required><br>
      Numero 1:
      <input type="text" name="num1" required><br>
      Numero 2:
      <input type="text" name="num2" required><br>
      
      <input type="hidden" name="operacion" value="suma">
      <br>
      <input type="submit" value="Confirmar">
  </form>
       */
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
            String usuario=request.getParameter("usuario");
            String numero1=request.getParameter("num1");
            String numero2=request.getParameter("num2");
            int res=Integer.parseInt(numero1)+Integer.parseInt(numero2);
            /* TODO output your page here. You may use following sample code. */
            request.setAttribute("usuariojsp", usuario);
    request.getRequestDispatcher("destino.jsp").forward(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
