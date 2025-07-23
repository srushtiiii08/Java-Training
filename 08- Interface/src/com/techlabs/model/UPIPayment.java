package com.techlabs.model;

public class UPIPayment implements IPayment{

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("UPI payment of amount " +amount);
	}

}
