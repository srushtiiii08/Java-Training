package com.techlabs.model;

public class Product {
	private int id;
	private String name;
	private double price;
	
	public void setDetails(int id, String name, double price) {
		this.id=id;
		this.name=name;
		if (price>0) {
			this.price=price;
		}
		else {
			System.out.println("Price must be greater than 0.");
		}
	}
	
	public void display() {
		System.out.println("______________________");
		System.out.println("Product ID: " + id);
		System.out.println("Product name: " + name);
		System.out.println("Product price: " + price);
		System.out.println("______________________");
	}

}
