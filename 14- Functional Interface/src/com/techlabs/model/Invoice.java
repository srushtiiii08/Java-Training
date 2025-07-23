package com.techlabs.model;

public class Invoice {
	
	public String itemName;
	public int quantity;
	public int price;
	
	public Invoice(String itemName, int quantity, int price) {
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
}
