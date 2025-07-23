package com.techlabs.abstractt.model;
import com.techlabs.abstractt.model.Customer;

public class CommercialCustomer extends Customer{
	
	int baseRate = 8;
	
	public CommercialCustomer(String name, int unitsConsumed) {
		super(name, unitsConsumed);
		this.baseRate= baseRate;
	}

	@Override
	public int calcBill() {
		// TODO Auto-generated method stub
		return baseRate*unitsConsumed;
	}

}
