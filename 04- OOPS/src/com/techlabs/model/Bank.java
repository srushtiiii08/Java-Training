package com.techlabs.model;

public class Bank {
	private int accNum;
	private String holderName;
	private double bal;
//	private double deposit;
	
	public Bank(int accNum, String holderName, double bal) {
		this.accNum= accNum;
		this.holderName=holderName;
		this.bal=bal;
	}
	
	public double getBal() {
		return bal;
	}

	public void setDeposit(double amount) {
		bal += amount;
	}
	
	public void withdraw(double amount) {
		if (bal>=amount) {
			bal-= amount;
		}
		else {
			System.out.println("Insufficient balance!");
		}
	}
	
	public void displayBal() {
		System.out.println("Current balance: " + bal);
	}
}
