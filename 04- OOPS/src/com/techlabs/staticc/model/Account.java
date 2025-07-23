package com.techlabs.staticc.model;

public class Account {

	int accNum;
	public static String bankName = "HDFC";
	
	public Account(int accNum) {
		this.accNum=accNum;
	}
	
	public void show() {
		System.out.println("Account: " +accNum+ ", Bank name: " +bankName);
	}
}
