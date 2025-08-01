package com.techlabs.MiniProject.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = "/admin",
		initParams = {
				@WebInitParam(name = "storeName", value = "BookVerse"),
				@WebInitParam(name = "adminEmail", value = "admin@bookverse.com"),
				@WebInitParam(name = "category", value = "Science")
		})
public class AdminConfigServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 ServletConfig config = getServletConfig();

	     String storeName = config.getInitParameter("storeName");
	     String adminEmail = config.getInitParameter("adminEmail");
	     String category = config.getInitParameter("category");

	     resp.setContentType("text/html");
	     PrintWriter pw = resp.getWriter();
	     
	     pw.println("<html><head><title>Admin Panel</title></head><body>");
	     pw.println("<h2>Admin Panel</h2>");
	     pw.println("<p><strong>Configured Category:</strong> " + category + "</p>");
	     pw.println("<p><strong>Store Name:</strong> " + storeName + "</p>");
	     pw.println("<p><strong>Contact Admin:</strong> " + adminEmail + "</p>");
	     pw.println("</body></html>");
	}
}
