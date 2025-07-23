package com.techlabs.test;

import java.util.Scanner;

public class tryCatch {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	try {
		System.out.println("Enter number 1:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter numner 2:");
		int num2 = sc.nextInt();
		
		int div = num1/num2;
		System.out.println(div);
	}catch (ArithmeticException e) {
		System.out.println("Arithmetic Exception");
	}catch (Exception e) {
		System.out.println(e);
	}
}
}
