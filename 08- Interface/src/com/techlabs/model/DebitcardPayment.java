package com.techlabs.model;

public class DebitcardPayment implements IPayment{

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Debit card payment of amount " +amount);
	}

}
