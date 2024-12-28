package com.example.ironman;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "UrlWelcomeServlet", value = "/UrlWelcome")
public class UrlWelcome extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name =  request.getParameter("UserName");

        out.println("<h1>Welcome" + name + " In My World 🧑‍💻</h1>");
    }


}