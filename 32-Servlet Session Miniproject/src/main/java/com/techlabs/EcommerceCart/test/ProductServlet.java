package com.techlabs.EcommerceCart.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/products")
public class ProductServlet extends HttpServlet{

	private static final String[] products = {"Laptop", "Phone", "Headphones", "Mouse", "Smartwatch"};

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
        
		if (session == null || session.getAttribute("username") == null) {
            response.sendRedirect("login.html");
            return;
        }
		
        String username = (String) session.getAttribute("username");
        
        response.setContentType("text/html");
        
        PrintWriter pw = response.getWriter();
        
        pw.println("<!DOCTYPE html><html><head><title>Product Selection</title>");
        pw.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
        pw.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css'>");
        pw.println("<style>");
        
        pw.println("html,body{height:100%;}body{min-height:100vh;"
        		+ "width:100vw;background:linear-gradient(135deg,#e0eafc 0%,#cfdef3 100%);"
        		+ "display:flex;align-items:center;justify-content:center;}");
        pw.println(".products-card{max-width:410px;width:100%;"
        		+ "margin:auto;border-radius:1rem;"
        		+ "box-shadow:0 2px 10px rgba(0,0,0,0.10);"
        		+ "background:#fff;padding:2rem 1rem;}");
        
        pw.println("</style></head><body>");
        pw.println("<main class='products-card mx-auto text-center'>");
        pw.println("<img src='https://img.icons8.com/color/48/000000/shopping-cart.png' style='width:2.2rem;margin-bottom:1em'>");
        pw.println("<h4 class='fw-bold text-primary mb-3'>Welcome, " + username + "!</h4>");
        pw.println("<h6 class='mb-4'>Select products to add to your cart</h6>");
        pw.println("<form action='cart' method='post' class='text-start'>");
        
        for (String p : products) {
        	pw.println("<div class='form-check mb-2'>"
                + "<input class='form-check-input' type='checkbox' name='product' value='" + p + "' id='" + p + "'>"
                + "<label class='form-check-label' for='" + p + "'>" + p + "</label></div>");
        }
        
        pw.println("<button type='submit' class='btn btn-success w-100 shadow mt-3'>Add to Cart</button>");
        pw.println("</form>");
        pw.println("<a href='logout' class='btn btn-outline-secondary btn-sm mt-3 w-100'>Logout</a>");
        pw.println("</main></body></html>");
    
	}
}
