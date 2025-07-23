package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class SwitchCaseEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month in number:");
		int month = scanner.nextInt();
		
		switch (month) {
		case 1: 
			System.out.println("This month has 31 days");
			break;
		case 2:
			System.out.println("This month hasa 28 days");
			break;
		case 3: 
			System.out.println("this month has 31 days");
			break;
		case 4:
			System.out.println("This month has 30 days");
			break;
		case 5: 
			System.out.println("this month has 31 days");
			break;
		case 6:
			System.out.println("This month has 30 days");
			break;
		case 7: 
			System.out.println("this month has 31 days");
			break;
		case 8:
			System.out.println("This month has 31 days");
			break;
		case 9: 
			System.out.println("this month has 30 days");
			break;
		case 10:
			System.out.println("This month has 31 days");
			break;
		case 11: 
			System.out.println("this month has 30 days");
			break;
		case 12:
			System.out.println("This month has 31 days");
			break;
		default:
			System.out.println("Incorrect input");
			break;
		
		}
	}

}
