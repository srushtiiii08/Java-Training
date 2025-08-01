package com.techlabs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/srushti")    //in annotation we have passed url mapping
public class ServletWithoutWebxml extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.write("without xml file..");
	
	}

	@Override			//service is a super class, so service will run and not doget etc
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");    //way to mention html file
		PrintWriter pw = resp.getWriter();
		pw.write("<h1> without xml file.. using service</h1>");
	
	}
}
