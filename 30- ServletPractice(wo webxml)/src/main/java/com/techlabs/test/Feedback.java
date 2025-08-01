package com.techlabs.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class Feedback extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        String productId = request.getParameter("productId");
        String ratingStr = request.getParameter("rating");
        String review = request.getParameter("review");

        StringBuilder errors = new StringBuilder();
        
        if (productId == null || productId.trim().isEmpty()) {
            errors.append("<p>Product ID is required.</p>");
        }
        
        int rating = 0;
        try {
            rating = Integer.parseInt(ratingStr);
            if (rating < 1 || rating > 5) {
                errors.append("<p>Rating must be between 1 and 5.</p>");
            }
        } catch (Exception e) {
            errors.append("<p>Invalid rating.</p>");
        }
        if (review == null || review.trim().isEmpty()) {
            errors.append("<p>Review text is required.</p>");
        }
        
        if (errors.length() > 0) {
            response.getWriter().println("<h3>Validation Errors:</h3>" + errors.toString());
        } else {
        	response.getWriter().println("<h3>Thank you for your feedback!</h3>");
            response.getWriter().println("<p>Product ID: " + productId + "</p>");
            response.getWriter().println("<p>Rating: " + rating + "</p>");
            response.getWriter().println("<p>Review: " + review + "</p>");
        }
	}
}
