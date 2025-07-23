package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class ScannerEx {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter your age");
	int age = scanner.nextInt();
	
	scanner.nextLine();
	
	System.out.println("enter your name:");
	String username = scanner.nextLine();
	
	System.out.println("enter your domain: ");
	char domain = scanner.next().charAt(0);
	
	System.out.println("hello " +username +", you're " +age + " years old. your domain is " + domain);
}
}
