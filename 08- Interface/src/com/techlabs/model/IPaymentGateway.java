package com.techlabs.model;

public interface IPaymentGateway {

	void pay(double amount);
	void refund(double amount);
	String getMethodName();
	
	
}
