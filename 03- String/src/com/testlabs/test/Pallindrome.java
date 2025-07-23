package com.testlabs.test;

import java.util.Scanner;

public class Pallindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a string: ");
	String str = sc.nextLine();
	
	str = str.toLowerCase();
	String rev ="";
	for (int i=str.length()-1; i>=0; i--) {						//cursor starts from last character
		rev+=str.charAt(i);		
	}
	if (str.equalsIgnoreCase(rev)) {
		System.out.println("Pallindrome");
	}
	else {
		System.out.println("Not a pallindrome");
	}
}
}