package com.techlabs.E_commerce;

public class CreditCard implements IPaymentGateway{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit card payment of " +amount+ " was successful");
	}

	@Override
	public void refund(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit card refund of " +amount+ " was successful");
	}

	@Override
	public String getMethodName() {
		// TODO Auto-generated method stub
		return "Credit Card";
	}

}
