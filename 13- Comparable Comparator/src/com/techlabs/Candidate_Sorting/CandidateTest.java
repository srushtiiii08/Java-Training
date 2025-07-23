package com.techlabs.Candidate_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CandidateTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String choice = "yes";
	while (choice.equalsIgnoreCase("yes")) {
		List<Candidate> candidateArray = new ArrayList<>();
		
		int candidateCount = 0;
		System.out.println("\nEnter number of candidates: ");
		while (true) {
			try {
				candidateCount = Integer.parseInt(sc.nextLine());
				if (candidateCount <= 0) {
					System.out.println("Please enter a positive number: ");
				} else {
					break;
				}
			}catch (NumberFormatException e) {
				System.out.println("Invalid input! Please try again: ");
			}
		}
		
		for (int i=1; i<=candidateCount; i++) {    
			System.out.println("Enter details for candidate " +(+i)+": ");
			
			String name="";
			while (name.isEmpty()) {
				System.out.println("Name: ");
				name = sc.nextLine();
				if (name.isEmpty()) {
					System.out.println("Name cannot be empty. Try again: ");
				}
			}
			
			int age = 0;
			while (true) {
				System.out.println("Age: ");
				try {
					age = Integer.parseInt(sc.nextLine());
					if (age <=0) {
						System.out.println("Age must be a positive number");
					}else {
						break;
					}
				}catch(NumberFormatException e) {
					System.out.println("Invalid input! Please try again: ");
				}
			}
			candidateArray.add(new Candidate(name, age));
		}
		
		int sortChoice = 0;
		System.out.println("\nChoose sorting criteria: ");
		System.out.println("1. Sort by Name, then Age");
		System.out.println("2. Sort by age only");
		
		while(true) {
			System.out.println("Please enter a choice: ");
			
			try {
				sortChoice = Integer.parseInt(sc.nextLine());
				if (sortChoice==1 || sortChoice==2) {
					break;
				}else {
					System.out.println("Please enter 1 or 2: ");
				}
			}catch (NumberFormatException e) {
				System.out.println("Invalid input! Please enter 1 or 2: ");
			}
		}
		
		if (sortChoice==1) {
			Collections.sort(candidateArray, new NameComparator());
		}else {
			Collections.sort(candidateArray, new AgeComparator());
		}
		
		System.out.println("\n---Sorted Candidates---");
		for (Candidate res: candidateArray) {
			System.out.println(res);
		}
		
		String choice2 = "";
		while (true) {
			System.out.println("\nDo you want to perform another sort? (yes/no):" );
			choice2 = sc.nextLine();
			if (choice2.equalsIgnoreCase("yes") || choice2.equalsIgnoreCase("no")) {
				break;
			}else {
				System.out.println("Please enter only yes or no: ");
			}
		}
		if (choice2.equalsIgnoreCase("no")) {
			System.out.println("\nExiting! Thank you");
			break;
		}
	}
}
}
