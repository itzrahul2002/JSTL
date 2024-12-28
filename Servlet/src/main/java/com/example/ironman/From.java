package com.example.ironman;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "FromServlet", value = "/From-servlet")
public class From extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals("admin") && password.equals("admin123")){
           RequestDispatcher rd = request.getRequestDispatcher("Welcome-servlet");
           rd.forward(request,response);
        }
        else {
            out.println("<h1 style='text-align:center'>Please Enter Invalid UserName Password</h1>");
            RequestDispatcher rd = request.getRequestDispatcher("From.html");
            rd.include(request,response);
        }

//        out.println("<html><body>");
//        out.println("<h1>"  "</h1>");
//        out.println("</body></html>");
    }


}