package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class ArrayExample {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter the size of an array: ");
	int size = scanner.nextInt();
	
	int[] marks = new int[size];
	
	for (int i = 0; i<marks.length; i++) {
		System.out.println("Enter the value of " + i + " index: ");
		marks[i] = scanner.nextInt();
	}
	
	System.out.println("You entered: ");
	for (int result : marks) {					//for each; marks values will be stored in result 
		System.out.println(result);
	}
	
//	for (int i = 0; i> marks.length; i++) {
//		System.out.println("value of " +i+ "index" + marks[i]);
//	
//	}
}
}
