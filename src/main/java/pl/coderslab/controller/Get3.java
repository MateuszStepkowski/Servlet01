package pl.coderslab.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "Get3", urlPatterns = {"/get3"})
public class Get3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        int width=5, height=20;

        try {
            width = Integer.parseInt(request.getParameter("width"));
            height = Integer.parseInt(request.getParameter("height"));
        }catch (NumberFormatException e){}

        Writer wr = response.getWriter();

        wr.append("<table>")
          .append("<tr>");

        for (int i=0; i<=width; i++){
            wr.append("<th>"+i+"</th>");
        }
        wr.append("</tr>");
        for (int i=1; i <= height; i++){
            wr.append("<tr><th>"+i+"</th>");
            for (int j=1; j <= width; j++){
                wr.append("<td>"+(i*j)+"</td>");
            }
            wr.append("</tr>");
        }
        wr.append("</table");
    }
}
