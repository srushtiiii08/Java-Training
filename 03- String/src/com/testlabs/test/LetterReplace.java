package com.testlabs.test;

import java.util.Scanner;

public class LetterReplace {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a string: ");
	String str = sc.nextLine();
	
	String result = str.replaceAll("e", "i");
	System.out.println("The original string before replacement is: " + str);
	System.out.println("the new string after replacement is: " + result);
}
}
