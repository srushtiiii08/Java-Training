package com.testlabs.test;

import java.util.Scanner;

public class LongestWord {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a string:");
	String str = sc.nextLine();
	
	String[] words = str.split(" ");
	String longest = "";
	int max=0;
	
	for (int i=0; i<words.length; i++) {
		if (words[i].length() > max) {
			max = words[i].length();
			longest = words[i];
		}
	}
	System.out.println("The longest word is: " +longest+ "\n length: " +max);
}
}
