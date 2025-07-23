package com.techlabs.model;

public interface IAccountOperations {

	void deposit(double amount);
	void withdrawal(double amount);
	void checkBalance();
	String getAccountType();
	
	
}
