package com.techlabs.abstractt.model;

public abstract class Customer {

	String name;
	int unitsConsumed;
	
	public Customer() {
	}
	
	public Customer(String name, int unitsConsumed) {
		this.name=name;
		this.unitsConsumed=unitsConsumed;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract int calcBill();
}
