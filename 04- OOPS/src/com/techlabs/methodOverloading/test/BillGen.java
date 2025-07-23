package com.techlabs.methodOverloading.test;

public class BillGen {
	
	public void bill(String item, int qty, int price) {
		double total = price*qty;
		System.out.println("Item name: " + item+ ", Quantity: " + qty);
		System.out.println("\nTotal price: " +total);
	}
	
	public void bill(String item, int qty, double disc, int price) {
		double total = (price*qty) - (disc/100);
		System.out.println("\ntotal price after " +disc+ "% discount: " + total);
	}
	
	public void bill(String item, int qty, double disc, int price, double tax) {
		double total = ((price*qty) - (disc/100))+(tax/100);
		System.out.println("\nTotal price after " +disc+ "% dicount and " +tax+ "% tax: " + total);
	}

	
	
	public static void main(String[] args) {
		BillGen bg = new BillGen();
		
		bg.bill("broom", 2, 70);
		bg.bill("broom", 2, 5, 70);
		bg.bill("broom", 2, 5, 70, 3.12);
	}
}
