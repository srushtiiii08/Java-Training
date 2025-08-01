package com.techlabs.MiniProject.test;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class LandingServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
    	
        ServletContext context = getServletContext();
        
        synchronized (context) {		
            if (context.getAttribute("totalVisitors") == null) {
                context.setAttribute("totalVisitors", 0);
                context.setAttribute("fictionCount", 0);
                context.setAttribute("scienceCount", 0);
                context.setAttribute("techCount", 0);
            }
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    	ServletContext context = getServletContext();
    	
        synchronized (context) {
            Integer totalVisitors = (Integer) context.getAttribute("totalVisitors");
            totalVisitors++;
            context.setAttribute("totalVisitors", totalVisitors);
        }
        
        int totalVisitors = (Integer) context.getAttribute("totalVisitors");

        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        pw.println("<html><head><title>Welcome to BookVerse</title></head><body>");
        pw.println("<h2>Welcome to BookVerse!</h2>");
        pw.println("<p><strong>Total Visitors So Far:</strong> " + totalVisitors + "</p>");
        pw.println("<p>Select a Category:</p>");
        pw.println("<ul>");
        pw.println("<li><a href='book?name=Fiction'>Fiction</a></li>");
        pw.println("<li><a href='book?name=Science'>Science</a></li>");
        pw.println("<li><a href='book?name=Technology'>Technology</a></li>");
        pw.println("</ul>");
        pw.println("</body></html>");
    }
}
