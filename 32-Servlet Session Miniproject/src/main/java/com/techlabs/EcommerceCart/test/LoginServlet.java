package com.techlabs.EcommerceCart.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		String user = request.getParameter("username");
	    
		if (user == null || user.trim().isEmpty()) {
	        response.sendRedirect("login.html?error=1");
	        return;
	    }
		
	    HttpSession session = request.getSession();
	    
	    session.setAttribute("username", user);
	    session.setAttribute("cart", new java.util.ArrayList<String>());  //create empty cart
	    
	    response.sendRedirect("products");
	}


}
