package com.techlabs.staticc.model;

public class Shop {

	public static final double tax = 0.18;
	
	public static double calcTotal(double price) {
		return price + (price*tax);
	}
}
