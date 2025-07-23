package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.model.Bank;

public class BankTest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter  account number: ");
	int accNum = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter account holder's name: ");
	String name= sc.nextLine();
	
	System.out.println("Enter account balance: ");
	double bal = sc.nextDouble();
	sc.nextLine();
	
	Bank bank = new Bank(accNum, name, bal);
	
	System.out.println("Enter amount to be deposited: ");
	double depositamt = sc.nextDouble();
	bank.setDeposit(depositamt);
	
	System.out.println("Enter amount to withdraw: ");
	double withdrawAmt = sc.nextDouble();
	bank.withdraw(withdrawAmt);
	
	bank.displayBal();
	
}
}
