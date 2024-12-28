package com.example.ironman;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Validate_1Servlet", value = "/Validate_1-servlet")
public class Validate_1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession s = request.getSession();

        String name = (String) s.getAttribute("name");


        out.println("<html><body>");
        out.println("<h1> Welcome to My Session "+name+"</h1>");
        out.println("</body></html>");
    }


}