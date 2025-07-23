package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class Calculator {
	public static int Add(int a, int b) {
		return a+b;
	}
	
	public static int Sub(int a, int b) {
		if (a>b) {
			return a-b;	
		}
		else {
			return b-a;
		}
	}
	
	public static int Mul(int a, int b) {
		return a*b;
	}
	
	public static int Div(int a, int b) {
		return a\\b;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int number2 = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Enter the calculation you wamt to perform. \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n");
		String choice = scanner.nextLine();
		
		
		switch (choice) {
		case 1 :
			System.out.println("Addition is: " +Add(number1, number2));
			break;
		case 2 :
			System.out.println("Subtraction is: " +Sub(number1, number2));
			break;
		case 3 :
			System.out.println("Multiplication is: " +Mul(number1, number2));
			break;
		case 4 :
			System.out.println("Division is: " +Div(number1, number2));
			break;
		default : 
			System.out.println("Please enter valid input from the options provided");
			break;
		}
		

	}

}
