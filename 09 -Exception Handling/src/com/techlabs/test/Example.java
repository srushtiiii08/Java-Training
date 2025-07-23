package com.techlabs.test;

import java.util.Scanner;

public class Example {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your age:");
	
	try {
		int age = sc.nextInt();
		System.out.println(age);
	} 
	catch(NullPointerException e) {
		System.out.println("Null Pointer Exception");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Index Out Of Bounds Exception");
	}
	catch (Exception e) {				//generalised block should be in the last. if its the first one then the rest of the block wont be executed after the generalized one
//		e.printStackTrace();
		System.out.println(e);
	}
	
	finally {
		System.out.println("Finally executed");
	}
}
}
