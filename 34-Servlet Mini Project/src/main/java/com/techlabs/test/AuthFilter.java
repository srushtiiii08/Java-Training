package com.techlabs.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter("/dashboard")
public class AuthFilter implements Filter{

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        
		HttpServletRequest request = (HttpServletRequest) req;
        
		HttpSession session = request.getSession(false);
		
        if (session == null || session.getAttribute("studentName") == null) {
            req.getRequestDispatcher("error.html").forward(req, res);
        } else {
            chain.doFilter(req, res);
        }
    }
	
}
