package com.example.ironman;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ValidateServlet", value = "/Validate-servlet")
public class Validate extends HttpServlet {
    private String message;


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String password = request.getParameter("password");


        if(password.equals("java123")){
            HttpSession s = request.getSession();
            s.setAttribute("name", name);

            response.sendRedirect("Validate_1-servlet");
        }


        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

}