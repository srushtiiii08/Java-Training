package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Movie;

public class MovieTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	Movie[] moviearr = new Movie[5];
	
	System.out.println("Enter details of 5 movies: ");
	for (int i=0; i<5; i++) {
		System.out.println("Enter movie name: ");
		String movieName = scanner.nextLine();
		
		System.out.println("Enter movie genre: ");
		String genreName = scanner.nextLine();
		
		moviearr[i] = new Movie(movieName, genreName);
	}
	
	for (Movie res:moviearr) {
		res.acDisplay();	
	}
}
}
