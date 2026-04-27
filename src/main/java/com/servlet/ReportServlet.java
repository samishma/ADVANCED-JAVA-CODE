package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

import com.dao.ProductDAO;
import com.model.Product;

public class ReportServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String priceStr = request.getParameter("price");
        String category = request.getParameter("category");
        String limitStr = request.getParameter("limit");

        List<Product> list = new ArrayList<>();

        try {

            if(priceStr != null && !priceStr.isEmpty()) {
                double price = Double.parseDouble(priceStr);
                list = ProductDAO.getProductsByPrice(price);

            } else if(category != null && !category.isEmpty()) {
                list = ProductDAO.getProductsByCategory(category);

            } else if(limitStr != null && !limitStr.isEmpty()) {
                int limit = Integer.parseInt(limitStr);
                list = ProductDAO.getTopProducts(limit);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("list", list);
        RequestDispatcher rd = request.getRequestDispatcher("report_result.jsp");
        rd.forward(request, response);
    }

    // ✅ ADD THIS (IMPORTANT)
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        doGet(request, response);
    }
}