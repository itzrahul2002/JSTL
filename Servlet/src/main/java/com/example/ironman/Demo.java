package com.example.ironman;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class Demo implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Servlet Init Method");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
            res.setContentType("text/html");
            PrintWriter pr = res.getWriter();
            pr.println("<h1 style='color :red'>Hello Welcome Servlet Interface I am Here</h1>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Destroy Invoked");
    }
}
