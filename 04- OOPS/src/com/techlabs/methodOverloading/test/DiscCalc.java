package com.techlabs.methodOverloading.test;

public class DiscCalc {
	
	double disc = 0.05;
	public void discount(double price) {
		disc = price - ((price*disc)/100);
		System.out.println("Total price: " + disc);
	}
	
	public void discount(double price, String coupon) {
		if (coupon.equalsIgnoreCase("SAVE10")) {
			disc = price - (price*0.1);
		}
		System.out.println("total price: " + disc);
	}
	
	public void discount(double price, String coupon, boolean isMember) {
		if (coupon.equalsIgnoreCase("SAVE10")) {
			disc = price - (price*0.1);
		}
		if (isMember) {
			disc = price - (price*0.5);
		}
		System.out.println("Total price: " + disc);
	}
	
	
	public static void main(String[] args) {
		DiscCalc dc = new DiscCalc();
		
		dc.discount(9.9);
		dc.discount(9.9, "SAVE10");
		dc.discount(9.9, "safe20");
		dc.discount(9.9, "save10", true);
	}
}
