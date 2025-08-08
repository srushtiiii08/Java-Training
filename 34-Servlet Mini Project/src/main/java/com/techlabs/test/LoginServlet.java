package com.techlabs.test;

import java.io.IOException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		String name = req.getParameter("studentName");
        
        if (name == null || name.trim().isEmpty()) {
            req.getRequestDispatcher("error.html").forward(req, resp);
            return;
        }

        // Start session, store name and new login time
        HttpSession session = req.getSession(true);
        session.setAttribute("studentName", name);

        String loginTime = java.time.LocalDateTime.now()
                .format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        session.setAttribute("loginTime", loginTime);
        
        resp.sendRedirect(resp.encodeRedirectURL("dashboard")); 
	}
}
