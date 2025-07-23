package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class RideBillGenerator {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter your height in cm: ");
		int height = scanner.nextInt();
	//scanner.nextLine();
	
	System.out.println("enter your age: ");
	int age = scanner.nextInt();
	int bill = 0;
	
	if (height <= 120) {
		System.out.println("you cannot ride as your height does not meet the minimum criteria");
	}
	else {
		System.out.println(" you can ride");
		if (age < 12) {
			bill = bill + 5;
		}
		else if (age > 12 && age <= 18) {
			bill = bill + 7;
		}
		else if (age > 18) {
			if (age > 45) {
			bill = bill + 0;
			}
			else {
				bill = bill + 12;
		}
			System.out.println("Do you want photos (0 or 1)?");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1: 
				bill = bill + 3;
				System.out.println("Extra charge of $3 will be added.");
				break;
			case 0:
				bill = bill + 0;
				System.out.println("Your total bill i);
				break;
			default:
				System.out.println("enter valid input");
				break;
			}
			System.out.println("your total bill is $" +bill);
		}
	}
	
	
}
}
