package com.testlabs.test;

import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a string: ");
	String str= scanner.nextLine();
	
	String rev = "";
	
	for (int i = str.length()-1; i>=0; i--) {
		rev = rev + str.charAt(i);
	}
	System.out.println("reversed string is: " +rev);
}
}
