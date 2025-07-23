package com.techlabs.staticc.test;

import com.techlabs.staticc.model.ElectricityBill;

public class ElectricityBillTest {
public static void main(String[] args) {
	ElectricityBill.displayCurrentCost();
	
	System.out.println("\n");
	
	ElectricityBill apt1 = new ElectricityBill(101, 22);
	ElectricityBill apt2 = new ElectricityBill(102, 330);
	
	apt1.displayBill();
	System.out.println("\n");
	apt2.displayBill();
	System.out.println("\n");
	
	ElectricityBill.changeCostPerUnit(6);
	System.out.println("--------------------------------------");
	System.out.println("\nTotal Bill after updating cost per unit: ");
	
	ElectricityBill.displayCurrentCost();
	System.out.println("\n");
	
	apt1.displayBill();
	System.out.println("\n");
	apt2.displayBill();
}
}
