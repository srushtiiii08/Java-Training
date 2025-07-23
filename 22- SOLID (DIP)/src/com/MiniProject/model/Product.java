package com.MiniProject.model;

public class Product {

	String name;
	int quantity;
	int reorderThreshold;
	double price;
	
	public Product(String name, int quantity, int reorderThreshold, double price) {
		this.name = name;
		this.quantity = quantity;
		this.reorderThreshold = reorderThreshold;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getReorderThreshold() {
		return reorderThreshold;
	}

	public double getPrice() {
		return price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
