package com.swabhavtechlabs.forloop;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the size of array: ");
	int size = scanner.nextInt();
	
	int[] number = new int[size];
	
	for (int i=0; i<number.length; i++) {
		System.out.println("Enter the value of " + i + " index: ");
		number[i] = scanner.nextInt();
	}
	int max = 0;
	for (int i =0; i<number.length; i++) {
		if (number[i] > max) {
			max = number[i];
		}
	}
	
	int secondmax = 0;
	for (int i=0; i<number.length; i++) {
		if (number[i] != max && number[i]>secondmax) {
			secondmax = number[i];
			System.out.println("Second largest number is: " + secondmax);
		}
	}
	System.out.println("All elements are same!");
	
	
//	Arrays.sort(number);
////	System.out.println(number);
//	
//	int max2 = number[size-2];
//	System.out.println("the second largest number is: " + max2);
}
}
