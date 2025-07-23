package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.AgeException;

public class CustomException {
public static void main(String[] args) throws AgeException {
	Scanner sc = new Scanner(System.in);    //either use try catch to throw custom exception
//	try {									//or use 'throws <exception name>' to throw the custom exception, 
		System.out.println("Enter age");	//basically either throws or try catch is needed
		int age = sc.nextInt();
		
		if (age<18) {
			throw new AgeException("Since age is below 18, hence not allowed to vote");
		}
//	} catch (AgeException e) {
//		System.out.println(e);
//	}
	System.out.println("Eligible to vote");
}
}
