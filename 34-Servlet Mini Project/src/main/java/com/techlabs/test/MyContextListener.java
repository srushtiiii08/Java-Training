package com.techlabs.test;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextListener{

	 public void contextInitialized(ServletContextEvent sce) {
	        
		 ServletContext con = sce.getServletContext();
	     
		 con.setAttribute("onlineCount", 0);
		 con.setAttribute("portalMotto", "Learn More, Grow More!");
	    }
	    public void contextDestroyed(ServletContextEvent sce) {
	        // Cleanup if necessary
	    }
}
