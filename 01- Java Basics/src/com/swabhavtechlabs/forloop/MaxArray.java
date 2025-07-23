package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class MaxArray {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number of elements in the array: ");
	int size = scanner.nextInt();
	
	int[] number = new int[size];
	
	for (int i = 0; i<number.length; i++) {
		System.out.println("Enter the value of " + i + " index: ");
		number[i] = scanner.nextInt();
	}
	
	int max = number[0];
	for (int i = 0; i < number.length; i++) {
		if (number[i] > max) {
			max = number[i];
		}
	}
	System.out.println("Maximum number in the array is: " + max);
	scanner.close();
}
}
