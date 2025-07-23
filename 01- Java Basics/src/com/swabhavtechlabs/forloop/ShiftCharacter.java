package com.swabhavtechlabs.forloop;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftCharacter {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a one word string: ");
	String string = scanner.nextLine();
	
	System.out.println("Enter the position to be shifted");
	int position = scanner.nextInt();
	
	scanner.nextLine();
	
	char[] stringArr = string.toCharArray();
	
	for (int i=0; i<stringArr.length; i++) {
		stringArr[i] += position;
	}
	
	System.out.println("The string after shifting position is: " + Arrays.toString(stringArr));
}
}
