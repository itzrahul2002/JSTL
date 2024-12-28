package com.example.ironman;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "CookiesServlet", value = "/Cookies-servlet")
public class Cookies extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name  = request.getParameter("name");
        String password = request.getParameter("password");

        if(password.equals("java")){
            Cookie cookie = new Cookie("UserName",name);
            response.addCookie(cookie);

            response.sendRedirect("Welcome_Cookie-servlet");
        }

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        doGet(request, response);
    }

}