package com.example.ironman;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Welcome_CookieServlet", value = "/Welcome_Cookie-servlet")
public class Welcome_Cookie extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookie = request.getCookies();


        out.println("<html><body>");
        out.println("<h1> Welcome " +cookie[0].getValue()+ "</h1>");
        out.println("</body></html>");
    }


}