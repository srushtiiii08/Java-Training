package com.techlabs.Flight_Fare_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FlightTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("===Airline System===");
	List<Flight> flightArr = new ArrayList<>();
	
	while (true) {
		
		String choice;  
		while(true) {
			System.out.println("\nSelect the option that you want to perform: \n1. Add airline details");
			System.out.println("2. Show details");
			System.out.println("0. Exit");
			choice = sc.nextLine().trim();
			
			if (choice.equals("1") || choice.equals("2") || choice.equals("0")) 
				break;
			System.out.println("Invalid input! Enter 1, 2 or 0 only!");
		}
		
		if (choice.equals("1")) {
			String airline=""; /////
			while(true) {
				System.out.println("Airline: ");
				airline = sc.nextLine().trim();
				if (airline.isEmpty()) {
					System.out.println("Airline name cannot be empty. Try again:");
				}else {
					break;
				}
			}
			
			double fare;
			while(true) {
				System.out.println("Fare: ");
				try {
					fare = Double.parseDouble(sc.nextLine().trim());
					break;
				} catch(NumberFormatException e) {
					System.out.println("Fare must be a number: ");
				}
			}
			flightArr.add(new Flight(airline, fare));
		}else if (choice.equals("2")) {
			if (flightArr.isEmpty()) {
				System.out.println("No flight details added yet! Add details first");
			}else {
				Collections.sort(flightArr, new FareSortDesc());
				System.out.println("\n---Sorted Flights by fare---");
				for (Flight res: flightArr) {
					System.out.println(res);
				}
			}
		}else {
			System.out.println("\nExiting. Thankyou!");
			break;
		}
	}
}
}
