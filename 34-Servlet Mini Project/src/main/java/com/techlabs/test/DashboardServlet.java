package com.techlabs.test;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(
	    urlPatterns = "/dashboard",
	    initParams = {
	        @WebInitParam(name = "instructorName", value = "Prof. Amit Tiwari")
	    }
	)
public class DashboardServlet extends HttpServlet{

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		HttpSession session = req.getSession(false);
        
		if (session == null || session.getAttribute("studentName") == null) {
            resp.sendRedirect(resp.encodeRedirectURL("index.html"));
            return;
        }
        
        String name = (String) session.getAttribute("studentName");
        String loginTime = (String) session.getAttribute("loginTime");

        // Read the previous last-visit time from the cookie
        String lastVisit = "First visit!";
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("lastVisit".equals(c.getName())) {
                    lastVisit = URLDecoder.decode(c.getValue(), "UTF-8");
                    break;
                }
            }
        }
        
        // After showing previous last-visit, store the current login time as the new last-visit for next time
        String encodedNow = URLEncoder.encode(loginTime, "UTF-8");
        Cookie updatedCookie = new Cookie("lastVisit", encodedNow);
        updatedCookie.setMaxAge(60 * 60 * 60); 
        resp.addCookie(updatedCookie);

        //
        ServletContext con = getServletContext();
        Integer online = (Integer) con.getAttribute("onlineCount");
        
        if (online == null) 
        	online = 0;
        
        String instructor = getServletConfig().getInitParameter("instructorName");
        String motto = (String) con.getAttribute("portalMotto");

        
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("<!DOCTYPE html><html lang='en'><head>"
                + "<title>Dashboard</title>"
                + "<meta charset='UTF-8'>"
                + "<meta name='viewport' content='width=device-width, initial-scale=1'>"
                + "<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css'>"
                + "<script src='https://use.fontawesome.com/releases/v5.15.1/js/all.js'></script>"
                + "</head><body class='bg-light'>"
                + "<nav class='navbar navbar-expand-lg navbar-dark bg-primary'>"
                + "<a class='navbar-brand' href='#'><i class='fa fa-user-graduate'></i> Student Portal</a>"
                + "<form action='logout' method='post' class='ml-auto'><button type='submit' class='btn btn-danger'>Logout</button></form>"
                + "</nav>"
                
                + "<div class='container my-5'>"
                + " <div class='card shadow-lg'>"
                + "   <div class='card-body'>"
                + "     <h4 class='card-title mb-3 text-primary'>Hello, " + name + "!</h4>"
                + "     <p><strong>Login Time:</strong> " + loginTime + "</p>"
                + "     <p><strong>Last Visit:</strong> " + lastVisit + "</p>"
                + "     <div class='alert alert-success mt-4 mb-4' role='alert'>"
                + "       " + motto + "<br><small class='text-muted'>Instructor: " + instructor + "</small>"
                + "     </div>"
                + "     <div class='d-flex align-items-center'>"
                + "       <span class='badge badge-info p-2 mr-2'><i class='fa fa-users'></i> Online Students: " + online + "</span>"
                + "       <span class='ml-auto text-muted small'>Session ends after 5 min inactivity.</span>"
                + "     </div>"
                + "   </div>"
                + " </div>"
                + "</div>"

                + "</body></html>"
            );
        }
                
}
