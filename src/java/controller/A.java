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

//        oranized code
//        out.print("<!DOCTYPE html>\n");
//        out.print("<html>\n");
//        out.print("\t<head>\n");
//        out.print("\t\t<title>\n");
//        out.print("\t\t</title>\n");
//        out.print("\t</head>\n");
//        out.print("\t<body>\n");
//        out.print("\t\t<button onclick='test()'>Send Request</button>\n");
//        out.print("\t\t<script>");
//        out.print("function test() {");
//        out.print("alert('working');");
//        out.print("}</script>\n");
//        out.print("\t</body>\n");
//        out.print("</html>");
        //unorganized code
        resp.setContentType("text/html;charset=UTF-8");
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>");
        out.print("</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<button onclick='test()'>Send Request</button>");
        out.print("<script>");

        out.print("function test(){");

        out.print("var r = new XMLHttpRequest();");
        out.print("r.onreadystatechange = function () {");
        out.print("if (r.readyState == 4 && r.status == 200) {");
        out.print("alert(r.responseText);");
        out.print("}");
        out.print("};");
        out.print("r.open('GET', 'B', true);");
        out.print("r.send();");
        out.print("}");

        out.print("</script>");
        out.print("</body>");
        out.print("</html>");
    }

}
