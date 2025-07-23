package com.techlabs.Enum.test;

import java.util.Scanner;

public class PaymentTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter payment status: \nSUCCESS \nPENDING \nFAILED \nCANCELLED");
	String pay = sc.next().toUpperCase();
	
	if (pay.equals("SUCCESS")) {
		System.out.println("Payment recieved");
	}
	else if (pay.equals("PENDING")) {
		System.out.println("Payment pending");
	}
	else if (pay.equals("FAILED") ) {
		System.out.println("payment failed");
	}
	else if (pay.equals("CANCELLED")) {
		System.out.println("payment cancelled");
	}
	else {
		System.out.println("Invalid");
	}
}
}
