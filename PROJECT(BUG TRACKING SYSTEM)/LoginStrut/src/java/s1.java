/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
@WebServlet(urlPatterns = {"/s1"})
public class s1 extends HttpServlet {

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
       PrintWriter out = response.getWriter();
         try
     {
         
                       String name = request.getParameter("m1");
                       String num = request.getParameter("m2");
                       String pname = request.getParameter("m3");
                        String email = request.getParameter("m4");
                       String pass = request.getParameter("m5");
                       String rpass = request.getParameter("m6");
                		Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/login","root","LPU");
			//Statement st=con.createStatement();
			PreparedStatement pst=con.prepareStatement("insert into sign values(?,?,?,?,?,?)"); 
			pst.setString(1,name);
			pst.setString(2,num);
                        pst.setString(3,pname);
                        pst.setString(4,email);
			pst.setString(5,pass);
                        pst.setString(6,rpass);
			int status=pst.executeUpdate();
			if(status>0)
			{
			//	out.println("\n \t -------------- \n");
			//	out.println("\n \t DATA SAVED SUCCESSFULLY. \n");
			//	out.println("\n \t ----------------- \n");
                                
		
                JOptionPane.showMessageDialog(null,"saved");
                response.sendRedirect("START.jsp");
                        }
                        
			else
			{
				

                                // out.println("DATA IS NOT SAVED");

                      response.sendRedirect("sign.jsp");
                        }
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			out.println("CAUGHT" +e);
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
