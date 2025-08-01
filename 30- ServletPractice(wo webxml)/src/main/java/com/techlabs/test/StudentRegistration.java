package com.techlabs.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class StudentRegistration extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String name = req.getParameter("name");
        String email = req.getParameter("email");
        String ageStr = req.getParameter("age");
        String course = req.getParameter("course");

        StringBuilder errors = new StringBuilder();
        
        if (name == null || name.trim().isEmpty()) {
            errors.append("<p>Name is required.</p>");
        }
        if (email == null || email.trim().isEmpty()) {
            errors.append("<p>Email is required.</p>");
        }
        int age = 0;
        try {
            age = Integer.parseInt(ageStr);
            if (age < 18) {
                errors.append("<p>Age should be 18 or above.</p>");
            }
        } catch (Exception e) {
            errors.append("<p>Invalid age.</p>");
        }
        
        if (course == null || course.trim().isEmpty()) {
            errors.append("<p>Please select a course.</p>");
        }

        if (errors.length() > 0) {
            resp.getWriter().println("<h3>Validation Errors:</h3>" + errors.toString());
        } else {
        	resp.getWriter().println("<h3>Registration Successful</h3>");
        	resp.getWriter().println("<p>Name: " + name + "</p>");
        	resp.getWriter().println("<p>Email: " + email + "</p>");
        	resp.getWriter().println("<p>Age: " + age + "</p>");
        	resp.getWriter().println("<p>Course: " + course + "</p>");
        }
	}
}
