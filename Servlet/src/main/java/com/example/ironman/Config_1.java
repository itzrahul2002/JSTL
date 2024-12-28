package com.example.ironman;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Config_1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter  out = res.getWriter();

        ServletConfig sc = getServletConfig();
        String name = sc.getInitParameter("Name");
        String email = sc.getInitParameter("Email");
        String pass = sc.getInitParameter("Password");


//        date read from form
        String password = req.getParameter("password");

        if(pass.equals(password)){
            out.println("<h2>Your name is : " + name+"</h2>");
            out.println("<h2>Email: " + email+"</h2>");
        }
        else {
            out.println("<h2>OOPS !! Your Password is Wrong</h2>");
        }

    }
}
