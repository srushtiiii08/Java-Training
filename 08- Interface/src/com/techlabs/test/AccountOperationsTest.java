package com.techlabs.test;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.techlabs.model.IAccountOperations;
import com.techlabs.model.CurrentAccount;
import com.techlabs.model.LoanAccount;
import com.techlabs.model.SavingsAccount;

public class AccountOperationsTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	IAccountOperations[] accounts = { new SavingsAccount(), new CurrentAccount(), new LoanAccount() };

	while (true) {
        try {
            System.out.println("\n==== Welcome to Bank ====");
            for (int i = 0; i < accounts.length; i++) {
                System.out.println((i + 1) + ". " + accounts[i].getAccountType());
            }
            System.out.println("0. Exit");

            int accChoice = -1;
            while (accChoice < 0 || accChoice > accounts.length) {
                System.out.print("Choose account (0-3): ");
                try {
                    accChoice = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a number.");
                    sc.next(); 
                }
            }

            if (accChoice == 0) {
                System.out.println("Thanks for banking with us!");
                break;
            }

            IAccountOperations selected = accounts[accChoice - 1];

            System.out.println("\nSelected: " + selected.getAccountType());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");

            int action = -1;
            while (action < 1 && action > 3) {
                System.out.print("Choose operation: ");
                try {
                    action = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Enter a valid number.");
                    sc.next(); // Clear invalid input
                }
            }

            double amount = 0;
            if (action == 1 || action == 2) {
                while (amount <= 0) {
                    System.out.print("Enter amount: ₹");
                    try {
                        amount = sc.nextDouble();
                        if (amount <= 0) {
                            System.out.println("Amount must be greater than 0.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Enter a valid amount.");
                        sc.next(); 
                    }
                }
            }

            try {
                if (action == 1)
                    selected.deposit(amount);
                else if (action == 2)
                    selected.withdrawal(amount);
                else
                    selected.checkBalance();
            } catch (Exception e) {
                System.out.println("Operation failed: " + e.getMessage());
            }

            sc.nextLine(); // Clear buffer

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
            sc.nextLine(); // Clear buffer
        }
    }

    sc.close();
}
}
