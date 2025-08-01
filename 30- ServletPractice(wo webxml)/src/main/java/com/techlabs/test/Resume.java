package com.techlabs.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resume")
public class Resume extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String resume = request.getParameter("resume");
        String skillsStr = request.getParameter("skills");

        StringBuilder errors = new StringBuilder();

        if (name == null || name.trim().length() < 3) {
            errors.append("Name must be at least 3 characters");
        }
        
        if (email == null || !email.matches("^[\\w-.]+@[\\w-]+\\.[a-z]{2,}$")) {
            errors.append("Invalid email format");
        }
        if (skillsStr == null || skillsStr.trim().isEmpty()) {
            errors.append("Please enter at least one skill");
        }
        
        if (errors.length() > 0) {
            response.getWriter().println("<h3>Validation Errors:</h3>" + errors.toString());
        } else {
        	String[] skills = skillsStr.trim().split("\\s*,\\s*");
            response.getWriter().println("<h3>Resume Preview</h3>");
            response.getWriter().println("<strong>Name:</strong> " + name );
            response.getWriter().println("<strong>Email:</strong> " + email );
            response.getWriter().println("<strong>Skills:</strong><ul>");
            
            for (String skill : skills) {
                response.getWriter().println("<li>" + skill + "</li>");
            }
            
            response.getWriter().println("</ul>");
            response.getWriter().println("<strong>Resume Content:</strong>");
            response.getWriter().println("<pre>" + resume + "</pre>");
        }
            
	}
}
