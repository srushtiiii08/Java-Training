package com.techlabs.ACIDtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.techlabs.ACIDmodel.Admin;
import com.techlabs.ACIDmodel.Customer;

public class TransactionsTest {
public static void main(String[] args) throws ClassNotFoundException, Exception {
	
	//1. register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
					
	//2. create connection
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "root");
	System.out.println("Connected to DB successfully!");
		
	Scanner sc = new Scanner(System.in);
	
	while (true) {
		System.out.println("\n--- Bank System Main Menu ---");
	    System.out.println("1. Admin Login");
	    System.out.println("2. Customer Login");
	    System.out.println("3. Exit");
	    System.out.println("Choose an option: ");

	    int choice = 0;
	    
	    try {
	        choice = Integer.parseInt(sc.nextLine());
	        
	    } catch (NumberFormatException e) {
	        System.out.println("Invalid input! Please enter a number.");
	        continue;
	    }
	    
	    if (choice == 1) {
	        Admin admin = new Admin(connection, sc);
	        admin.start();
	        
	    } else if (choice == 2) {
	        Customer customer = new Customer(connection, sc);
	        customer.start();
	        
	    } else if (choice == 3) {
	        System.out.println("Exiting...");
	        break;
	        
	    } else {
	        System.out.println("Invalid choice! Try again ");
	    }
	    
	}
	
	
}
}
