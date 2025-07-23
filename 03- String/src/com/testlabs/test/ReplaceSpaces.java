package com.testlabs.test;

import java.util.Scanner;

public class ReplaceSpaces {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a string:");
	String str = sc.nextLine();
	
	String result = "";
	
	for (int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		if (ch == ' ') {
			result += '_';
		}
		else {
			result +=ch;
		}
	}
	System.out.println("String after replacing spaces is: " +result);
}
}
