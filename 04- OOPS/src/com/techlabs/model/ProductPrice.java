package com.techlabs.model;

public class ProductPrice {
	String name;
	double price;
	int quantity;
	
	public ProductPrice(String name, double price, int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	public double calcTotal() {
		return price*quantity;
	}
	
	public void displayTotal() {
		System.out.println("-----------------------");
		System.out.println("Product name: " +name);
		System.out.println("total cost: " +calcTotal());
		System.out.println("------------------------");
	}
}
