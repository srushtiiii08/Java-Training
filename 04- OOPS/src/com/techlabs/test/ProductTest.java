package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Product;

public class ProductTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Product prod = new Product();			//obj
	System.out.println("Enter product name: ");
	String name = sc.nextLine();
	
	System.out.println("Enter product ID: ");
	int id = sc.nextInt();
	sc.nextLine();
	
	System.out.println("enter product price: ");
	double price = sc.nextDouble();
	
	prod.setDetails(id, name, price);
	prod.display();
}
}
