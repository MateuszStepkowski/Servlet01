package pl.coderslab.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(name = "Servlet16", urlPatterns = "/Servlet16")
public class Servlet16 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter()
                .append("Your IpAddress is: ")
                .append(request.getRemoteAddr())
                .append('\n'+request.getHeader("User-Agent"))
                .append('\n'+LocalDateTime.now().toString());
    }
}
