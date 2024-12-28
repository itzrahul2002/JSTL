package com.example.ironman;

import java.io.*;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ConfigServlet", value = "/Config-servlet")
public class Config extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ServletConfig sc = getServletConfig();

        out.println(sc.getInitParameter("name"));
        out.println(sc.getInitParameter("email"));
        out.println(sc.getInitParameter("password"));


        Enumeration<String> e = sc.getInitParameterNames();

        while (e.hasMoreElements()){
            String str = e.nextElement();

            out.println(str);
        }

        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

}