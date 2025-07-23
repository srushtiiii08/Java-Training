package com.techlabs.model;

public class CreditcardPayment implements IPayment{

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit card payment of amount " +amount);
	}

}
