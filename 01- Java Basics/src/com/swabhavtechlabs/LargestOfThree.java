package com.swabhavtechlabs;

public class LargestOfThree {
	public static void main(String[] args) {
		
		int number1 = 10;
		int number2 = 20;
		int number3 = 30;
		if (number1>number2 && number1>number3) {
			System.out.println("10 is the largest of 3 numbers");
		}
		else if (number2>number1 && number2>number3) {
			System.out.println("20 is the largest of 3 numbers");
		}
		else {
			System.out.println("30 is the largest of 3 numbers");
		}
	}
}
