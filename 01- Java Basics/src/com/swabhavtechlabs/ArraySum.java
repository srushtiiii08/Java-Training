package com.swabhavtechlabs;

import java.util.Scanner;

public class ArraySum {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number of elements in the array: ");
	int size = scanner.nextInt();
	
	int[] number = new int[size];
	
	for (int i = 0; i<number.length; i++) {
		System.out.println("Enter the value of " + i + " index: ");
		number[i] = scanner.nextInt();
	}
	int sum = 0;
	for (int i = 0; i<number.length; i++) {
		sum = sum + number[i];
	}
	System.out.println("Sum of elements of array is: " + sum);
}
}
