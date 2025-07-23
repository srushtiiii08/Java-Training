package com.techlabs.E_commerce;

public interface IPaymentGateway {

	void pay(double amount);
	void refund(double amount);
	String getMethodName();
	
	
}
