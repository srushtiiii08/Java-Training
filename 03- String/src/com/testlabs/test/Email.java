package com.testlabs.test;

import java.util.Scanner;

public class Email {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter an email: ");
	String email = sc.nextLine();
	
	String username = "";
	for (int i=0; i<email.length(); i++) {
		if (email.charAt(i) == '@') {
			break;   //stop at @
		}
		else {
			username += email.charAt(i);
		}
	}
	System.out.println("Username is: " + username);
}
}
