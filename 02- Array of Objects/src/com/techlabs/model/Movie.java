package com.techlabs.model;

public class Movie {
	String title;
	String genre;
	
	public Movie(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}
	
	public void acDisplay() {
		if (genre.equalsIgnoreCase("action")) {
			System.out.println("Action movies are: " +title);	
			System.out.println("_____________________________");
		}
	}

}
