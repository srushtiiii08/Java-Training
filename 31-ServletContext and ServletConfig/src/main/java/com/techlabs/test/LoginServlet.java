package com.techlabs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginRD")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		
		if (user.equals("admin") && pass.equals("123")) {
			RequestDispatcher rd = req.getRequestDispatcher("welcomRD");
			rd.forward(req, resp);
		
		}else {
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();
			
			pw.println("<p style = 'color:red;'> Invalid username or password. Please try again. </p>");
			
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
	}
}
}
