package com.testlabs.test;

import java.util.Scanner;

public class PatternNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows for pattern: ");
		int rows = sc.nextInt();
		
		for (int i=1; i<=rows; i++) {				//row number
			for (int j=1; j<= i; j++) {				//col 
				System.out.print(j);
			}
			System.out.println();				//moves to next row after inner loop finishes
		}
	}
}
