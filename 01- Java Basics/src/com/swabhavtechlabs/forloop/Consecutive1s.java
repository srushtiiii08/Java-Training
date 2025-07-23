package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class Consecutive1s {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the size of binary array: ");
	int size = scanner.nextInt();
	
	System.out.println("Enter the elements (in 0 & 1 only): ");
	int[] binarray = new int[size];
	
	for (int i =0; i<binarray.length; i++) {
		binarray[i] = scanner.nextInt();
		
		if (binarray[i] !=0 && binarray[i] != 1) {
			System.out.println("Invalid Input! \nElement should either be 0 or 1.");
		}
	}
	int count =0;
	int maxcount = 0;
	
	for (int i = 0; i<binarray.length; i++) {
		if (binarray[i] == 1) {
			count++;
			if (count > maxcount) {
				maxcount = count;
			}
		}
		else {
			count = 0; //0 encountered
	}
	}
	System.out.println("Maximum number of consecutive 1s is: " + maxcount);
}
}
