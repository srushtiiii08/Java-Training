package com.techlabs.TransactSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.techlabs.Product.ComparatorSort;
import com.techlabs.Product.Product;

public class TransactionTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("===Transaction Amount Sorting System===");
	List<Transaction> transactions = new ArrayList<>();
	
	while(true) {
		System.out.println("\nSelect the option that you want to perform: \n1. Add transaction details");
		System.out.println("2. Show details");
		System.out.println("0. Exit");
		System.out.println("Choice: ");
		String choice = sc.nextLine().trim();
		
		switch(choice) {
		case "1": 
			int id;
			while (true) {
				System.out.println("ID: ");
				try {
					id = Integer.parseInt(sc.nextLine().trim());
					if (id <= 0) {
						System.out.println("Invalid input! Enter a positive number:");
					}else {
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("ID must be a whole number.");
				}
			}
			
			double amount;
			while(true) {
				System.out.println("Amount: ");
				try {
					amount = Double.parseDouble(sc.nextLine().trim());
					break;
				}catch (NumberFormatException e) {
					System.out.println("Amount must be a whole number.");
				}
			}
			transactions.add(new Transaction(id, amount));
			break;
			
		case "2":
			if (transactions.isEmpty()) {
				System.out.println("No transaction details added yet! Add details first");
			}else {
				Collections.sort(transactions,new AmountSortComparator());
				System.out.println("\n---Sorted transaction by amount---");
				for (Transaction res: transactions) {
					System.out.println(res);
				}
			}
			break;
			
		case "0":
			System.out.println("\nExiting. \nThankyou!!");
			sc.close();
			return;
		
		default:
			System.out.println("Invalid Input! Enter 1, 2 or 0 only. Try again: ");
		}
	}
}
}
