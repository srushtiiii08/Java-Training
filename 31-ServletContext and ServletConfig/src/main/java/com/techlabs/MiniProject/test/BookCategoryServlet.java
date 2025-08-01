package com.techlabs.MiniProject.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/book")
public class BookCategoryServlet extends HttpServlet{

	private String storeName;
    private String adminEmail;
    
    @Override
    public void init() throws ServletException {
    	
    	storeName = "BookVerse";			//default set
        adminEmail = "admin@bookverse.com";
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	ServletContext context = getServletContext();
    	
    	String category = req.getParameter("name");
        
    	if (category == null) {
            category = "Fiction"; // default category
        }
    	
    	synchronized (context) {		//to safely increment counts for the selected category
    	
    	// Update per-category counts
        switch (category.toLowerCase()) {
        
        case "fiction":
            Integer ficCount = (Integer) context.getAttribute("fictionCount");
            
            if (ficCount == null) {
            	ficCount = 0;
            }
            ficCount++;
            context.setAttribute("fictionCount", ficCount);
            break;
        
        case "science":
            Integer sciCount = (Integer) context.getAttribute("scienceCount");
            
            if (sciCount == null) {
            	sciCount = 0;
            }
            sciCount++;
            context.setAttribute("scienceCount", sciCount);
            break;
            
        case "technology":
        case "tech":
            Integer techCount = (Integer) context.getAttribute("techCount");
            if (techCount == null) { techCount = 0; }
            techCount++;
            context.setAttribute("techCount", techCount);
            break;
        default:
//        	System.out.println("No category selected");
        }
    	}
    	
    	int totalVisitors = getCount(context, "totalVisitors");
        int fictionCount = getCount(context, "fictionCount");
        int scienceCount = getCount(context, "scienceCount");
        int techCount = getCount(context, "techCount");
        
        String appVersion = context.getInitParameter("App Version");
        if (appVersion == null) appVersion = "N/A";
        
        
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        
        pw.println("<html><head><title>Book Category: " + category + "</title></head><body>");
        pw.println("<p><strong>Book Category:</strong> " + category + "</p>");
        pw.println("<p><strong>Store:</strong> " + storeName + "</p>");
        pw.println("<p><strong>Admin Email:</strong> " + adminEmail + "</p><br/>");
        
        switch (category.toLowerCase()) {                   //disp count of each
        case "fiction":
            pw.println("<p><strong>Fiction Books Visited:</strong> " + fictionCount + "</p>");
            break;
        case "science":
            pw.println("<p><strong>Science Books Visited:</strong> " + scienceCount + "</p>");
            break;
        case "technology":
        case "tech":
            pw.println("<p><strong>Technology Books Visited:</strong> " + techCount + "</p>");
            break;
        default:
            pw.println("<p>Unknown Category</p>");
        }
        
        pw.println("<p><strong>Total Visitors:</strong> " + totalVisitors + "</p>");
        pw.println("<p><strong>App Version:</strong> " + appVersion + "</p>");
        pw.println("<p><a href='welcome'>Back to Home</a></p>");
        pw.println("</body></html>");
    }
    
    
    private int getCount(ServletContext context, String attr) {
        Integer count = (Integer) context.getAttribute(attr);
        return (count != null) ? count : 0;
    }
    
    
    }
    
    
