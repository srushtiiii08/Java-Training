package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class EvenOddArray {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the size of array: ");
	int size = scanner.nextInt();
	
	int[] arr = new int[size];
	
	System.out.println("Enter the elements: ");
	for (int i=0; i<arr.length; i++) {
		arr[i] = scanner.nextInt();
	}
	for (int i=0; i<size; i++) {
		for (int j=i+1; j<size; j++) {
			if (arr[i]%2 != 0 && arr[j]%2 == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println("Array after rearranging: ");
	for (int result:arr) {
		System.out.println(result + " ");
	}
}
}
