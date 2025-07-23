package com.techlabs.Product;

public class Product {

	String category;
	String name;
	int price;
	
	public Product(String category, String name, int price) {
		this.category = category;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[" + category + "]" + name + ": " + price;
	}
	
	
}
