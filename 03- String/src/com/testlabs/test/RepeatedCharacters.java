package com.testlabs.test;

import java.util.Scanner;

public class RepeatedCharacters {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a string: ");
	String str = sc.nextLine();
	str=str.toLowerCase();
	
	for (int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		int count=0;
		if (str.indexOf(ch) != i) {     //skip if already counted
			continue;
		}
		for (int j=0; j<str.length(); j++) { 			//to count occurences
			if (str.charAt(j) == ch) {
				count++;
			}
		}
		if (count>1) {
			System.out.println("In the above string " +ch+ " is repeated");
		}
	}
}
}
