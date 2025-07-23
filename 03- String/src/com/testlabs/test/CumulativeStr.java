package com.testlabs.test;

import java.util.Scanner;

public class CumulativeStr {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter size of array: ");
	int size = scanner.nextInt();
	int[] arr = new int[size];
	
	System.out.println("Enter the string: ");
	int sum =0;
	for (int i=0; i<arr.length; i++) {
		String str = scanner.nextLine();
		sum = sum+str.length();
	}
	System.out.println("the length of the string is: " +sum);
}
}
