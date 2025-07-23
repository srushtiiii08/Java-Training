package com.techlabs.BankAccount;

public class BankAccount {

	double balance = 0;
	
	public void deposit(double amt) {
		if (amt>0)
			balance += amt;
	}
	
	public void withdraw(double amt) {
		if (amt>0 && balance >= amt)
			balance -= amt;
	}
	
	public double getBalance() { 
		return balance; 
	}
}
