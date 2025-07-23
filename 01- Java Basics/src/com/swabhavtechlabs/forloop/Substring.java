package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class Substring {
	public static boolean isSubstring(String string, String substr) {
		return string.contains(substr);
	}
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the string: ");
	String string = scanner.nextLine();
	
	System.out.println("Enter the substring to find: ");
	String substr = scanner.nextLine();
	
	if (isSubstring(string, substr)) {
		System.out.println("Provided substring is the part of main substring");
	}
	else {
		System.out.println("Substring not found");
	}
}
}
