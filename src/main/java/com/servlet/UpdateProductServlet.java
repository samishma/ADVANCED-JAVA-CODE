package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.dao.ProductDAO;
import com.model.Product;

public class UpdateProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        Product p = new Product();
        p.setId(id);
        p.setName(name);
        p.setCategory(category);
        p.setPrice(price);
        p.setQuantity(quantity);

        ProductDAO.updateProduct(p);

        response.getWriter().println("Product Updated Successfully");
    }
}