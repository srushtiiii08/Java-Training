package com.testlabs.test;

import java.util.Scanner;

public class SBRemoveDigits {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter string with digits: ");
	String str1 = sc.nextLine();
	
	StringBuilder sb = new StringBuilder();
	
	for (char c: str1.toCharArray()) {
		if (!Character.isDigit(c)) {
			sb.append(c);				//if char is not a space then it stores the value to sb in array
		}
	}
	System.out.println("String without digits: " + sb.toString());
}
}
