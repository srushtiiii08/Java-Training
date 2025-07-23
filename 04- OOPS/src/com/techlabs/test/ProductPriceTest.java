package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.ProductPrice;

public class ProductPriceTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ProductPrice[] prod = new ProductPrice[2];
	
	for (int i=0; i<2; i++) {
		System.out.println("Enter details of product " + (i+1)+ ":");
		System.out.println("Product name: ");
		String name= sc.nextLine();
		
		System.out.println("Price: ");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();
		sc.nextLine();
		prod[i] = new ProductPrice(name, price, quantity);
	}
	System.out.println("\n   Total Cost");
	for (ProductPrice res: prod) {
		res.displayTotal();
	}
}
}
