package com.testlabs.test;

import java.util.Scanner;

public class CountAll {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str = scanner.nextLine();
		
		str = str.toLowerCase();
		int letter=0, digit=0, special=0;
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch>= 'a' && ch<='z') {
				letter++;
			}
			else if (ch>='0' && ch<='9') {
				digit++;
			}
			else {
				special++;
			}
		}
		System.out.println("The string has: \nLetters: " +letter+ "\nDigits: " +digit+ "\nSpecial Characters: " +special);
	}
}
