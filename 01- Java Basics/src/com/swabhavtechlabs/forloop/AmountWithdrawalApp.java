package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class AmountWithdrawalApp {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter amount to be withdrawn: ");
	int amount = scanner.nextInt();
	
	if (amount > 50000 && amount <= 0 && amount % 100 != 0) {
		System.out.println("Enter a valid amount. \nAmount should be a multiple of 100 and not exceed 50000");
	}
	if (amount >= 2000) {
		int note2000 = amount / 2000;
		System.out.println("Two thousand: " + note2000);
		amount = amount % 2000; 
	}
	if (amount >= 500) {
		int note500 = amount / 500;
		System.out.println("Five hundred: " + note500);
		amount = amount % 500;
	}
	if (amount >= 200) {
		int note200 = amount / 200;
		System.out.println("Two hundred: " + note200);
		amount = amount % 200;
	}
	if (amount >= 100) {
		int note100 = amount / 100;
		System.out.println("One hundred: " + note100);
	}
	scanner.close();
}
}
