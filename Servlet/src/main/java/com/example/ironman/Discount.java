package com.example.ironman;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "DiscountServlet", value = "/Discount-servlet")
public class Discount extends HttpServlet {
    double message1, message2,Amount,Discount;
    double TotalAmt,Dis_Amt;
//
//    public void init() {
//        message1 = TotalAmt;
//        message2 = Dis_Amt;
//
//    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter pr = response.getWriter();

         Amount = Double.parseDouble(request.getParameter("amt"));
         Discount = Double.parseDouble(request.getParameter("dis"));

        Dis_Amt = (Amount*Discount)/100;
        TotalAmt = Amount-Dis_Amt;




        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + Amount + "</h1>");
        out.println("<h1>" + Dis_Amt + "</h1>");
        out.println("<h1>" + TotalAmt + "</h1>");
        out.println("</body></html>");
    }

}