package pl.coderslab.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Get5", urlPatterns = {"/Get5"})
public class Get5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        Writer wr = response.getWriter();
        String[] learn = request.getParameterValues("learn");


        wr.append("<ul>")
          .append("<li>company:<ul>")
          .append("<li>"+request.getParameter("company")+"</li></ul></li>")
          .append("<li>learn:<ul>");
        for (int i=0; i<learn.length; i++){
            wr.append("<li>"+learn[i]+"</li>");
        }
        wr.append("</ul></li></ul>");
    }
}
