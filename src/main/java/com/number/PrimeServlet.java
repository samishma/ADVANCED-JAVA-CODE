/*6c. Build a servlet program to check the given number is prime number or not using HTML with step by step procedure.*/

package com.number;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String numStr = request.getParameter("number");

        if (numStr == null || numStr.trim().equals("")) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                    "Error: Number cannot be empty!");
            return;
        }

        int number;
        try {
            number = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                    "Error: Invalid input! Enter a valid integer.");
            return;
        }

        if (number <= 0) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                    "Error: Enter positive number greater than 0.");
            return;
        }

        boolean isPrime = number != 1;

        for (int i = 2; i <= Math.sqrt(number) && isPrime; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Prime Number Checker Result</h2>");

        if (isPrime) {
            out.println("<h3>" + number + " is a Prime Number.</h3>");
        } else {
            out.println("<h3>" + number + " is NOT a Prime Number.</h3>");
        }

        out.println("<br><a href='index.html'>Check Again</a>");
        out.println("</body></html>");
    }
}