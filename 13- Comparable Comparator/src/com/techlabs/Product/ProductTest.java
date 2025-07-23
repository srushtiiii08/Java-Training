package com.techlabs.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.techlabs.MovieSort.Movie;
import com.techlabs.MovieSort.YearComparatorDesc;

public class ProductTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("===Product Category Sorting System===");
	List<Product> productArr = new ArrayList<>();
	
	while(true) {
		System.out.println("\nSelect the option that you want to perform: \n1. Add product details");
		System.out.println("2. Show details");
		System.out.println("0. Exit");
		System.out.println("Choice: ");
		String choice = sc.nextLine().trim();
		
		switch(choice) {
		case "1": 
			String category;
			while(true) {
				System.out.println("Category: ");
				category = sc.nextLine().trim().toLowerCase();
				if (category.isEmpty()) {
					System.out.println("Product category cannot be empty. Try again: ");
				}else {
					break;
				}
			}
			
			String name;
			while(true) {
				System.out.println("Name: ");
				name = sc.nextLine().trim().toLowerCase();
				if (name.isEmpty()) {
					System.out.println("Product name cannot be empty. Try again: ");
				}else {
					break;
				}
			}
			
			int price;
			while(true) {
				System.out.println("Price: ");
				try {
					price = Integer.parseInt(sc.nextLine().trim());
					if (price < 0) {
						System.out.println("Price must be greater than orequal to zero. Try again:");
					}else {
						break;
					}
				}catch (NumberFormatException e) {
					System.out.println("Invalid input! Enter a valid number: ");
				}
			}
			
			productArr.add(new Product(category, name, price));
			break;
			
		case "2":
			if (productArr.isEmpty()) {
				System.out.println("No product details added yet! Add details first");
			}else {
				Collections.sort(productArr,new ComparatorSort());
				System.out.println("\n---Sorted Flights by fare---");
				for (Product res: productArr) {
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
