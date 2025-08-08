package com.techlabs.EcommerceCart.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/viewcart")
public class ViewCartServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		showCart(request, response, null);
    }
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		String remove = request.getParameter("removeAll");
        
		HttpSession session = request.getSession(false);
        
		if (session != null && remove != null) {
            ((List<String>) session.getAttribute("cart")).clear();
        }
        
		showCart(request, response, "Cart Updated");
    }
	
	
	private void showCart(HttpServletRequest request, HttpServletResponse response, String msg) throws IOException {
		
		HttpSession session = request.getSession(false);
        
		response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        
        pw.println("<!DOCTYPE html><html><head><title>Your Cart</title>");
        pw.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
        pw.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css'>");
        pw.println("<style>");
        pw.println("html,body{height:100%;}body{min-height:100vh;"
        		+ "width:100vw;"
        		+ "background:linear-gradient(135deg,#e0eafc 0%,#cfdef3 100%);"
        		+ "display:flex;align-items:center;"
        		+ "justify-content:center;}");
        
        pw.println(".cart-card{max-width:410px;"
        		+ "width:100%; margin:auto; border-radius:1rem;"
        		+ "box-shadow:0 2px 10px rgba(0,0,0,0.10);background:#fff;padding:2rem 1rem;}");
        pw.println("</style></head><body>");
        pw.println("<main class='cart-card mx-auto text-center'>");
        pw.println("<img src='https://img.icons8.com/fluency/48/000000/shopping-cart.png' style='width:2.2rem;margin-bottom:0.7em'>");
        pw.println("<h4 class='fw-bold text-primary mb-3'> Your Cart</h4>");
        
        if (msg != null) {
        	pw.println("<div class='alert alert-info'>" + msg + "</div>");
        }
        
        List<String> cart = (List<String>) session.getAttribute("cart");
        
        if (cart == null || cart.isEmpty()) {
        	pw.println("<div class='alert alert-warning text-center mb-3'>Your cart is empty.</div>");
        } else {
        	pw.println("<ul class='list-group mb-3'>");
            
        	for (String item : cart) {
            	pw.println("<li class='list-group-item'>" + item + "</li>");
            }
        	
            pw.println("</ul>");
        }
        
        pw.println("<div class='d-flex justify-content-between mb-3'>");
        pw.println("<form action='viewcart' method='post' class='me-2 flex-grow-1'>"
             + "<button name='removeAll' value='1' class='btn btn-danger w-100 shadow-sm'>Remove All Items</button>"
             + "</form>");
        pw.println("<a href='products' class='btn btn-outline-primary flex-grow-1'>Back to Products</a>");
        pw.println("</div>");
        pw.println("<a href='logout' class='btn btn-outline-secondary btn-sm w-100'>Logout</a>");

	}
}
