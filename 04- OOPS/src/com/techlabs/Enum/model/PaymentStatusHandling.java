package com.techlabs.Enum.model;

public class PaymentStatusHandling {
	public void main(PaymentStatus status) {
		switch(status) {
		case SUCCESS: 
			System.out.println("Payment recieved");
			break;
		case PENDING: 
			System.out.println("Payment IS PENDING");
			break;
		case FAILED: 
			System.out.println("Payment failed");
			break;
		case CANCELLED: 
			System.out.println("Payment cancelled");
			break;
		default:
			System.out.println("Status unknown");
		}
	}

}
