package com.swabhavtechlabs.forloop;

public class CommandLineArgumentEx {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int sum = num1 + num2;
		System.out.println("Sum of numbers is " +sum);
		System.out.println("Hello, myself " + args[2]);
	}

}
