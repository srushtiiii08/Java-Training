package com.techlabs.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/booking")
public class ConferenceBooking extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String numSeats = request.getParameter("numSeats");
        String date = request.getParameter("date");
        String sessionType = request.getParameter("sessionType");

        StringBuilder errors = new StringBuilder();

        if (name == null || name.trim().isEmpty()) {
            errors.append("<p>Name is required.</p>");
        }
        
        if (email == null || email.trim().isEmpty()) {
            errors.append("<p>Email is required.</p>");
        }
        int count = 0;
        try {
        	count = Integer.parseInt(numSeats);
            if (count < 1 || count > 5) {
                errors.append("Number of seats must be between 1 and 5");
            }
        } catch (Exception e) {
            errors.append("Invalid number of seats");
        }
        
        if (date == null || date.trim().isEmpty()) {
            errors.append("Date of attendance is required");
        }
        if (sessionType == null || sessionType.trim().isEmpty()) {
            errors.append("Please select a session type");
        }

        if (errors.length() > 0) {
            response.getWriter().println("<h3>Validation Errors:</h3>" + errors.toString());
        } else {
        	response.getWriter().println("<h3>Booking Confirmed</h3>");
            response.getWriter().println("Name: " + name );
            response.getWriter().println("Email: " + email);
            response.getWriter().println("Number of Seats: " + count);
            response.getWriter().println("Date of Attendance: " + date );
            response.getWriter().println("Session Type: " + sessionType);
        }
        
	}
}
