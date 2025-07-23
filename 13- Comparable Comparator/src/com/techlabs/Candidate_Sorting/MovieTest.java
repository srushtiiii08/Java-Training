package com.techlabs.Candidate_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.techlabs.MovieSort.Movie;
import com.techlabs.MovieSort.TitleSortComparator;
import com.techlabs.MovieSort.YearComparatorDesc;

public class MovieTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("===Movie System===");
	List<Movie> movieArr = new ArrayList<>();

	while (true) {
		String choice;  
		while(true) {
			System.out.println("\nSelect the option that you want to perform: \n1. Add movie details");
			System.out.println("2. Show details (year wise)");
			System.out.println("3. Show details (title wise)");
			System.out.println("0. Exit");
			choice = sc.nextLine().trim();
			
			if (choice.equals("1") || choice.equals("2") || choice.equals("0") || choice.equals("3")) 
				break;
			System.out.println("Invalid input! Enter 1, 2, 3 or 0 only!");
		}
		
		if (choice.equals("1")) {
			String title=""; /////
			while(true) {
				System.out.println("Movie: ");
				title = sc.nextLine().trim();
				if (title.isEmpty()) {
					System.out.println("Movie title cannot be empty. Try again:");
				}else {
					break;
				}
			}
			int year;
			while(true) {
				System.out.println("Year: ");
				try {
					year = Integer.parseInt(sc.nextLine().trim());
					if (year <= 999) {
						System.out.println("Invalid input! Enter a realistic year: ");
					}else {
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input! year must be a 4-digit numeric value:");
				}
			}
			movieArr.add(new Movie(title, year));
			
		} else if (choice.equals("2")) {
			if (movieArr.isEmpty()) {
				System.out.println("No movie details added yet! Add details first");
			}else {
				Collections.sort(movieArr,new YearComparatorDesc());
				System.out.println("\n---Sorted Flights by fare---");
				for (Movie res: movieArr) {
					System.out.println(res);
				}
			}
			
		}else if (choice.equals("3")) {
			if (movieArr.isEmpty()) {
				System.out.println("No movie details added yet! Add details first");
			}else {
				Collections.sort(movieArr,new TitleSortComparator());
				System.out.println("\n---Sorted Flights by fare---");
				for (Movie result: movieArr) {
					System.out.println(result);
				}
			}
		} else {
			System.out.println("\nExiting. \nThank You!!");
			break;
		}
	} 
	sc.close();
}
}
