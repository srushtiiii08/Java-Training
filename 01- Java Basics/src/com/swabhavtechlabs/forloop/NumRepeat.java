package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class NumRepeat {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int size = scanner.nextInt();
	
	int[] number = new int[size];
	
	for (int i=0; i<number.length; i++) {
		System.out.println("Enter the value of " + i + " index: ");
		number[i] = scanner.nextInt();
	}
	
	System.out.println("enter the number to be counted: ");
	int a = scanner.nextInt();
	
	int count = 0;
	for (int i = 0; i<number.length; i++) {
		if (number[i] == a) {
			count = count + 1;
		}
	}
	System.out.println("the count of given number is: " + count);
	
}
}
