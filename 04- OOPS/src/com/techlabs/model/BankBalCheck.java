package com.techlabs.model;

public class BankBalCheck {
	int accNum;
	String accHolder;
	double bal;
	
	public BankBalCheck(int accNum, String accHolder, double bal) {
		this.accNum = accNum;
		this.accHolder= accHolder;
		this.bal=bal;
	}
	
	public void CheckBal() {
		System.out.println("current balance: " +bal);
	}
}
