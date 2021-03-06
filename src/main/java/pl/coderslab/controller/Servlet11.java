package pl.coderslab.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(name = "Servlet11", urlPatterns = "/servlet11")
public class Servlet11 extends HttpServlet {


    public LocalDateTime initDateTime;

    @Override
    public void init() throws ServletException {
        super.init();
        this.initDateTime = LocalDateTime.now();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Request from client to servlet11");
        response.getWriter()
                .append("Hello first value")
                .append(LocalDateTime.now().toString())
                .append("Servlet initialized at: ")
                .append(this.initDateTime.toString());
    }
}
