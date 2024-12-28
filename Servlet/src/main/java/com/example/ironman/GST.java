package com.example.ironman;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

public class GST extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pr = res.getWriter();

        double a = Double.parseDouble(req.getParameter("amt"));
        double r = Double.parseDouble(req.getParameter("rate"));

        double ans = a*(r)/100;
        double total =ans+a;

        pr.println(ans+"<br>");
        pr.println(total);
    }
}
