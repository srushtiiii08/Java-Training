package com.techlabs.MovieSort;

public class Movie {

	String title;
	int year;
	
	public Movie(String title, int year) {
		super();
		this.title = title;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return title + ": " + year;
	}
	
}
