package com.techlabs.bank;

public class LoanAccount implements IAccountOperations{

	private double loanBalance = 50000;

	public void deposit(double amount) {
		System.out.println("Deposit not allowed in Loan Account.");
	}

	public void withdrawal(double amount) {
		loanBalance += amount;
		System.out.println("Loan of Rs" + amount + " taken. Total Loan: Rs" + loanBalance);
	}

	public void checkBalance() {
		System.out.println("Loan Account Balance (Amount Due): Rs" + loanBalance);
	}

	public String getAccountType() {
		return "Loan Account";
	}
}
