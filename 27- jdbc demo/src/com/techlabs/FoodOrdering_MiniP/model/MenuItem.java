package com.techlabs.FoodOrdering_MiniP.model;

public class MenuItem {

	private int itemId;
    private String itemName;
    private double price;
    private boolean available;
    
	public MenuItem(int itemId, String itemName, double price, boolean available) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.available = available;
	}

    
	
}
