package com.techlabs.test;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionListener{

	@Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        // Set session timeout to 5 minutes (300 seconds)
//        session.setMaxInactiveInterval(5 * 60);

        session.setMaxInactiveInterval(10);
        
        ServletContext con = session.getServletContext();
        
        synchronized (con) {
            Integer online = (Integer) con.getAttribute("onlineCount");
            con.setAttribute("onlineCount", (online == null ? 1 : online + 1));
        }
    }
	
	
	@Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext con = se.getSession().getServletContext();
        synchronized (con) {
            Integer online = (Integer) con.getAttribute("onlineCount");
            con.setAttribute("onlineCount", (online == null || online <= 0) ? 0 : online - 1);
        }
    }
	
}
