package com.techlabs.methodOverloading.test;

import java.util.Scanner;

public class Greeter {
	
	public void greet() {
		System.out.println("hello!");
	}
	
	public void greet(String name) {
		System.out.println("hello " +name + "!");
	}
	
	public static void main(String[] args) {
		Greeter g = new Greeter();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		g.greet();
		g.greet(name);
	}

}
