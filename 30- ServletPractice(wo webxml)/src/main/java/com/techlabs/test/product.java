package com.techlabs.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/stock")
public class product extends HttpServlet{

	private static class Product {
        String name;
        int stockCount;
        Product(String name, int stockCount) {
            this.name = name;
            this.stockCount = stockCount;
        }
    }
    
	private static final HashMap<String, Product> inventory = new HashMap<>();
    
    	@Override
    	public void init() {
    		inventory.put("10", new Product("Wireless Mouse", 25));
    		inventory.put("50", new Product("laptop", 0));
    		inventory.put("11", new Product("Monitor", 10));
    }
    	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    	resp.setContentType("text/html");
    	PrintWriter pw = resp.getWriter();
    	
    	String productId = req.getParameter("productId");
    	
    	if (productId == null || productId.trim().isEmpty()) {
            resp.getWriter().println("Error: productId parameter is required.");
            return;
        }
    	
    	productId = productId.trim();
        Product p = inventory.get(productId);
        
        if (p == null) {
            resp.getWriter().println("Error: Product not found.");
            return;
        }
    	
    	String availability = p.stockCount > 0 ? "In Stock" : "Out of Stock";
        pw.println("<h2>Product Stock Details</h2>");
        pw.println("<p>Product ID: " + productId + "</p>");
        pw.println("<p>Product Name: " + p.name + "</p>");
        pw.println("<p>Availability: " + availability + "</p>");
        pw.println("<p>Stock Count: " + p.stockCount + "</p>");
    }
}
