package com.techlabs.methodOverloading.test;

import java.util.Scanner;

public class Printer {
	public void print() {
		System.out.println("Default message");
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
	public void print(int num) {
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		Printer p = new Printer();
		p.print("Number by method overloading: " + num1);
		
		System.out.println("enter a message: ");
		String msg = sc.nextLine();
		p.print("Message using method: " + msg);
		
		p.print();
	}

}
