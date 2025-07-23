package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class PeakElement {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the size of an array: ");
	int size = scanner.nextInt();
	
	int[] number = new int[size];
	
	for (int i=0; i<number.length; i++) {
		System.out.println("Enter the value of " + i+ " index: ");
		number[i] = scanner.nextInt();
	}
	for (int i=0; i<number.length; i++) {
		boolean peak = false;
		
		if (i==0 && number[i]> number[i+1]) {
			peak = true;
			System.out.println("Peak of an array is: " + number[i]);
		}
		else if (i==number.length-1 && number[i]>number[i-1]) {
			peak = true;
			System.out.println("Peak of an array is: " + number[i]);
		}
		else if (i>0 && number[i]>number[i-1] && number[i]>number[i+1]) {
			peak = true;
			System.out.println("Peak of an array is: " + number[i]);
		}
	}
//	if (peak == false) {
//		System.out.println("No peak elements are found");
//	}
		
}
}
