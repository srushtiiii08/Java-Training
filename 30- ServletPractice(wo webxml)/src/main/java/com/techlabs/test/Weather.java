package com.techlabs.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/weather")
public class Weather extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String city = request.getParameter("city");

		if (city == null || city.trim().isEmpty()) {
			pw.println("<h3 style='color:red;'>City name cannot be empty!</h3>");
			return;
		}

		city = city.trim().toLowerCase();

		Map<String, String[]> weatherData = new HashMap<>();
		weatherData.put("delhi", new String[] { "38°C", "20%", "Sunny" });
		weatherData.put("mumbai", new String[] { "32°C", "70%", "Humid" });
		weatherData.put("bangalore", new String[] { "28°C", "60%", "Cloudy" });
		weatherData.put("chennai", new String[] { "36°C", "65%", "Hot" });

		if (weatherData.containsKey(city)) {
			String[] data = weatherData.get(city);
			pw.println("<h2>Weather for " + capitalize(city) + ":</h2>");
			pw.println("<ul>");
			pw.println("<li>Temperature: " + data[0] + "</li>");
			pw.println("<li>Humidity: " + data[1] + "</li>");
			pw.println("<li>Forecast: " + data[2] + "</li>");
			pw.println("</ul>");
		} else {
			pw.println("<h3 style='color:red;'>Invalid city name or no data available!</h3>");
		}
	}

	private String capitalize(String str) {
		if (str == null || str.isEmpty())
			return str;
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}
