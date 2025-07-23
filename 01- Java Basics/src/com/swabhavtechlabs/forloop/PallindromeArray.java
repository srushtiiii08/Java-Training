package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class PallindromeArray {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the size of array: ");
	int size = scanner.nextInt();
	
	int arr[] = new int[size];
	
	System.out.println("Enter the elements of array:");
	for (int i =0; i<arr.length; i++) {
		arr[i] = scanner.nextInt();
	}
	
	int start = 0;
	int end = size-1;
	boolean palindrome = true;
	
	while (start < end) {
		if (arr[start] != arr[end]) {
			palindrome = false;
			break;
		}
		start++;
		end--;
	}
	if (palindrome == true) {
		System.out.println("array is a pallindrome");
	}
	else {
		System.out.println("not a pallindrome");
	}
}
}
