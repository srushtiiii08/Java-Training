package com.techlabs.EcommerceCart.test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cart")
public class CartServlet  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
//		session.setMaxInactiveInterval(10);
        
		if (session == null || session.getAttribute("username") == null) {
            response.sendRedirect("login.html");
            return;
        }
		
        String[] selectedProducts = request.getParameterValues("product");
        
        List<String> cart = (List<String>) session.getAttribute("cart");
        
        if (selectedProducts != null) {
            cart.clear();
            Collections.addAll(cart, selectedProducts);
        }
        
        request.getRequestDispatcher("viewcart").forward(request, response);
	}
}
