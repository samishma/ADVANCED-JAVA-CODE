package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.dao.ProductDAO;

public class DeleteProductServlet extends HttpServlet {

    // ✅ Handle POST (from your form)
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        ProductDAO.deleteProduct(id);

        response.sendRedirect("productdisplay.jsp");
    }

    // ✅ Optional: if someone uses GET, still works
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doPost(request, response);
    }
}