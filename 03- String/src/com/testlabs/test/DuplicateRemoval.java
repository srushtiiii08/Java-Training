package com.testlabs.test;

import java.util.Scanner;

public class DuplicateRemoval {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = scanner.nextLine();
		
		str1 = str1.toLowerCase();
		System.out.println("String before removing duplicates: " + str1);
				
		String result ="";
		for (int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			if (result.indexOf(ch) == -1) {		//indexof checks if the character is present in the result. If not found then returns '-1'. 
				result += ch;
			}
		}
		System.out.println("String after removing duplicates: " +result);

	}	
}
