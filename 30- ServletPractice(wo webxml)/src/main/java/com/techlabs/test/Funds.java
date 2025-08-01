package com.techlabs.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/transfer")
public class Funds extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        
		String source = request.getParameter("sourceAcc");
        String dest = request.getParameter("destAcc");
        String amountStr = request.getParameter("amount");

        StringBuilder errors = new StringBuilder();

        if (source == null || source.trim().isEmpty()) {
            errors.append("<p>Source account number is required.</p>");
        }
        if (dest == null || dest.trim().isEmpty()) {
            errors.append("<p>Destination account number is required.</p>");
        }
        
        if (source != null && dest != null && source.equals(dest)) {
            errors.append("<p>Source and destination accounts cannot be the same.</p>");
        }
        double amount = 0;
        try {
            amount = Double.parseDouble(amountStr);
            if (amount <= 0 || amount > 50000) {
                errors.append("Amount must be positive and < 50,000");
            }
        } catch (Exception e) {
            errors.append("Invalid amount.");
        }
        
        if (errors.length() > 0) {
            response.getWriter().println("<h3>Validation Errors:</h3>" + errors.toString());
        } else {
            response.getWriter().println("<h3>Fund Transfer Successful</h3>");
            response.getWriter().println("From Account: " + source);
            response.getWriter().println("To Account: " + dest );
            response.getWriter().println(String.format("Transferred Amount: ", +amount));
        }
	}
}
