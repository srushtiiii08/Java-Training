package com.techlabs.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rating")
public class Rating extends HttpServlet{

	private static class Movie {
        String genre;
        double rating;
        String reviews;
        Movie(String genre, double rating, String reviews) {
            this.genre = genre;
            this.rating = rating;
            this.reviews = reviews;
        }
	}
	
	private static final HashMap<String, Movie> movieRating = new HashMap<>();
    
	@Override
	public void init() {
		movieRating.put("grownups", new Movie("comedy", 9.2, "family fun time"));
		movieRating.put("Holiday", new Movie("rom com", 7.5, "Good story"));
		movieRating.put("friends", new Movie("Sitcom", 8.7, "feel good"));
		movieRating.put("soty", new Movie("tp", 6.0, "okish"));
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		String movieName = req.getParameter("movieName");
		
		if (movieName == null || movieName.trim().isEmpty()) {
            pw.println("Error: movie name parameter is required.");
            return;
        }
		
		movieName = movieName.toLowerCase().trim();
        if (!movieRating.containsKey(movieName)) {
            pw.println("Error: Movie not found");
            return;
        }
        
        Movie m = movieRating.get(movieName);
        pw.println("<h2>Rating Summary for " + movieName.toUpperCase() + "</h2>");
        pw.println("<p>Genre: " + m.genre + "</p>");
        pw.println("<p>Rating: " + m.rating + "</p>");
        pw.println("<p>Reviews: " + m.reviews + "</p>");
        
	}
	
}

