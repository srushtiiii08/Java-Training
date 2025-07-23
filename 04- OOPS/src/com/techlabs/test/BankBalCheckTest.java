package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.BankBalCheck;

public class BankBalCheckTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number of accounts: ");
	int size = scanner.nextInt();
	scanner.nextLine();
	
	BankBalCheck[] bank = new BankBalCheck[size];
	
	for (int i=0; i<size; i++) {
		System.out.println("Enter details of account " + (i+1));
		System.out.println("enter account name: ");
		String name = scanner.nextLine();
		
		System.out.println("enter account number: ");
		int accNum = scanner.nextInt();
		
		System.out.println("enter balance: ");
		double bal = scanner.nextDouble();
		scanner.nextLine();
		
		bank[i] = new BankBalCheck(accNum, name, bal);
	}
	System.out.println("\nAccount balances: ");
	for (BankBalCheck res: bank) {
		res.CheckBal();
	}
}
}
