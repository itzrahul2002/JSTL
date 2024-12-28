package com.example.ironman;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class GST_1 extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pr = res.getWriter();

//        String s =
        double a = Double.parseDouble(req.getParameter("amt"));
        double r = Double.parseDouble(req.getParameter("rate"));

        double result = (a*r)/100;
        double gs = result+a;

        pr.println(res);
        pr.println(gs);

    }
}
