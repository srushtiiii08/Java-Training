package com.techlabs.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/courses")
public class Courses extends HttpServlet{

	private static final HashMap<String, String[]> courseMap = new HashMap<>();
    
    	@Override
    	public void init() {
    		courseMap.put("CS", new String[]{"Data Structures", "Algorithms", "Operating Systems"});
    		courseMap.put("ME", new String[]{"Thermodynamics", "Eng Drawing", "Machine Design"});
    		courseMap.put("EE", new String[]{"Circuit Analysis", "Electromagnetics", "Control Systems"});
    }
    	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    	PrintWriter pw = resp.getWriter();
    	
    	resp.setContentType("text/html");
    	String dept = req.getParameter("department");
    	
    	if (dept == null || dept.isEmpty()) {
    		pw.println("Error: Department parameter required");
    		return;
    	}
    	
    	dept = dept.toUpperCase();
    	if (!courseMap.containsKey(dept)) {
    		pw.println("Error: department not found!");
    		return;
    	}
    	
    	pw.println("<h2>Courses for Department: " + dept + "</h2><ul>");
        
    	for(String course : courseMap.get(dept)){
            pw.println("<li>" + course + "</li>");
        }
        pw.println("</ul>");
    }
}
