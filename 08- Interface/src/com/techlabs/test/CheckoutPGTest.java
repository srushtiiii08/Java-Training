package com.techlabs.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.techlabs.model.CreditCard;
import com.techlabs.model.IPaymentGateway;
import com.techlabs.model.NetBanking;
import com.techlabs.model.UPI;

public class CheckoutPGTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	IPaymentGateway[] gateway = { new CreditCard(), new UPI(), new NetBanking() };
	
    try {
        System.out.println("==== E-Commerce Checkout ====");
        System.out.println("Choose payment method:");
        for (int i = 0; i < gateway.length; i++) {
            System.out.println((i + 1) + ". " + gateway[i].getMethodName());
        }

        int choice = -1;		//since -1 is a clear invalid input. So by giving invalid input it forces the loop to run atleast once and take input from the user
        while (choice < 1 || choice > gateway.length) {
            System.out.print("Enter your choice (1-3): ");
            try {
                choice = sc.nextInt();
                if (choice < 1 || choice > gateway.length) {
                    System.out.println("Please choose a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); 
            }
        }

        IPaymentGateway selected = gateway[choice - 1];

        double amount = 0;
        while (amount <= 0) {
            System.out.print("Enter amount: ₹");
            try {
                amount = sc.nextDouble();
                if (amount <= 0) {
                    System.out.println("Amount must be greater than zero.");
                }
            }catch (InputMismatchException e) {
                System.out.println("Invalid amount. Please enter a number.");
                sc.next(); // Clear the invalid input
            }
        }

        int action = -1;
        while (action != 1 && action != 2) {
            System.out.println("1. Pay");
            System.out.println("2. Refund");
            System.out.print("Enter action: ");
            try {
                action = sc.nextInt();
                if (action != 1 && action != 2) {
                    System.out.println("Please select either 1 (Pay) or 2 (Refund).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1 or 2.");
                sc.next(); 
            }
        }

        try {
            if (action == 1) {
                selected.pay(amount);
            } else {
                selected.refund(amount);
            }
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

    } catch (Exception e) {
        System.out.println("Something went wrong: " + e.getMessage());
    } finally {
        sc.close();
    }
	
}
}
