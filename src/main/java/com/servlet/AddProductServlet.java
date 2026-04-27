package com.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import com.dao.ProductDAO;
import com.model.Product;

public class AddProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));  // ✅ added
            String name = request.getParameter("name");
            String category = request.getParameter("category");
            double price = Double.parseDouble(request.getParameter("price"));
            int quantity = Integer.parseInt(request.getParameter("quantity"));

            Product p = new Product();
            p.setId(id);   // ✅ important
            p.setName(name);
            p.setCategory(category);
            p.setPrice(price);
            p.setQuantity(quantity);

            ProductDAO.addProduct(p);

            response.sendRedirect("productdisplay.jsp");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}