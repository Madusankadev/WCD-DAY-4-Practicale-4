/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MADUSANKA
 */
@WebServlet(name = "A", urlPatterns = {"/A"})
public class A extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
                out.print("<title>");
        out.print("</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<button>Send Request</button>");
        out.print("</body>");
        out.print("</html>");
    }

}
