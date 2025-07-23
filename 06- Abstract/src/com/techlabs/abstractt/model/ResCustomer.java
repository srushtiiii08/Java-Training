package com.techlabs.abstractt.model;
import com.techlabs.abstractt.model.Customer;

public class ResCustomer extends Customer{
	
	int baseRate = 5;
	
	public ResCustomer(String name, int unitsConsumed) {
		super(name, unitsConsumed);
		this.baseRate=baseRate;
	}

	@Override
	public int calcBill() {
		// TODO Auto-generated method stub
		return unitsConsumed*baseRate;
	}

}
