package com.techlabs.Student_Sorting_System;

import java.util.ArrayList;
import java.util.regex.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    List<Student> students = new ArrayList<>();
    System.out.println("\n---Student sorting system---");
    
    try {
    	int studentCount= -1;
    	while (studentCount <=0) {
    		System.out.println("How many students?");
    		if (sc.hasNextInt()) {
    			studentCount = sc.nextInt();
    			if (studentCount <= 0) {
    				System.out.println("Please enter a positive number for student: ");
    			}
    		}else {
    			System.out.println("Invalid input! Please enter a valid positive numeric value: ");
    			sc.next();
    		}
    	}
    	sc.nextLine();
    	
    	for(int i=0;i<studentCount; i++) {
    		int id = -1;
    		while(id<=0) {
    	  		System.out.println("Enter ID for student " +(i+1));
    	  		if (sc.hasNextInt()) {
    	  			id = sc.nextInt();
    	  			if ( id<=0) {
    	  				System.out.println("Invalid ID! Please enter a valid positive numeric value: ");
    	  			}
    	  		} else {
    	  			System.out.println("Invalid input! ID must be a positive value: ");
    	  			sc.next();
    	  		}
    		}
    		sc.nextLine();
  
    		String name ="";
    		while (name.trim().isEmpty()) {
    			System.out.println("Enter name for student " +(i+1));
    			name = sc.nextLine().trim();
    			if (name.isEmpty()) {
    				System.out.println("Name cannot be empty or just spaces");
    			}
    		}
    		students.add(new Student(id, name));
    	}
    	
    	int criteria = -1;
    	while ( criteria != 1 && criteria != 2 ) {
    		System.out.println("\nChoose sorting Criteria");
        	System.out.println("1. sorting by ID");
        	System.out.println("2. Sorting by Name");
        	if (sc.hasNextInt()) {
        		criteria = sc.nextInt();
        		if (criteria != 1 && criteria != 2) {
        			System.out.println("Invalid input. Please try again.");
        		}
        	} else {
        		System.out.println("Invalid input! Please enter a number.");
        		sc.next();
        	}
    	}
    	
    	int order = -1;
    	while (order != 1 && order != 2) {
    		System.out.println("Choose order: ");
    		System.out.println("1. Ascending");
    		System.out.println("2. Descending");
    		if (sc.hasNextInt()) {
    			order = sc.nextInt();
    			if (order !=1 && order!= 2) {
        			System.out.println("Invalid order choice. Please try again.");
        		}
    		} else {
    			System.out.println("Invalid input! Please enter a number: ");
    			sc.next();
    		}
    	}
    	
    	
    	if (criteria == 1) {	//for ID
    		if (order ==1) {	  //asc
    			Collections.sort(students, new IDSortASC());
    		} else {			//desc
    			Collections.sort(students, new IDSortDesc());
    		}
    	} else {		//for name
    		if (order == 1) {	//asc
    			Collections.sort(students, new NameSortASC());
    		} else {		//desc
    			Collections.sort(students, new NameSortDesc());
    		}
    	}
    	
    	
    	System.out.println("\n--Sorted Students--");
    	for (Student res : students) {
    		System.out.println("Student Info: \nID: " +res.id+ " Name: " +res.name);
    	}
    	
    } catch(InputMismatchException e){
    	System.out.println("Error: Invalid input type. Please enter a numeric value!");
    } catch (Exception e) {
    	System.out.println("Unexpected Error: " + e.getMessage());
    } finally {
    	sc.close();
    }
}
}
