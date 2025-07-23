package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.CreditcardPayment;
import com.techlabs.model.DebitcardPayment;
import com.techlabs.model.IPayment;
import com.techlabs.model.UPIPayment;

public class PaymentTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Choose payment method: \n1.Credit card    2.debit card     3.UPI");
	int choice = sc.nextInt();
	
	System.out.println("Enter amount: ");
	double amount = sc.nextDouble();
	
	IPayment payment = null; 		//creating object "payment" of "IPayment" data type
	
	switch (choice) {
	case 1:
		payment = new CreditcardPayment();
		break;
	case 2:
		payment = new DebitcardPayment();
		break;
	case 3:
		payment = new UPIPayment();
		break;
	default:
		System.out.println("Invalid Input");
	}
	
	if (payment != null) {
		payment.processPayment(amount);
	}
	sc.close();
}
}
