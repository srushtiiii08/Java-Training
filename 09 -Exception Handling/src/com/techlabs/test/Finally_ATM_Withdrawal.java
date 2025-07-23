package com.techlabs.test;

import java.util.Scanner;

public class Finally_ATM_Withdrawal {

	public static void main(String[] args) {
		int amount = 10000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of withdrawal: ");
		int withdraw = sc.nextInt();
		
		try {
			if (withdraw>amount) {
				throw new ArithmeticException("Arithmetic Exception");
			}else {
				amount -= withdraw;
				System.out.println("amount withdraw successfull");
			}
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Transaction end");
		}
	}
}
