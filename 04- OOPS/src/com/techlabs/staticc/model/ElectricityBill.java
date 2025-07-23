package com.techlabs.staticc.model;

public class ElectricityBill {
	int aptNo;
	int units;			//units used or consumed
	static double costPerUnit = 7.0;  //default
	
	public ElectricityBill(int aptNo, int units) {
		this.aptNo=aptNo;
		this.units=units;
	}
	
	public double calcBill() {
		return units*costPerUnit;
	}
	
	public static void changeCostPerUnit(double newCost) {		//static to change cost per unit
		costPerUnit= newCost;
	}
	
	public static void displayCurrentCost() {
		System.out.println("Current cost per unit: " + costPerUnit);
	}
	
	public void displayBill() {
		System.out.println("Apartment Number: " + aptNo);
		System.out.println("Units Consumed: " + units);
		System.out.println("Total Bill: " + calcBill());
	}

}
