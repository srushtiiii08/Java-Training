package com.techlabs.methodOverloading.test;

public class SafeCalc {

	public int divide(int a, int b) {
		if (b==0) {
			System.out.println("Invalid input! \nDivision by zero");
			return -1;
		}
		return a/b;
	}
	
	public double divide(double a, double b) {
		if (b==0.0) {
			System.out.println("Invalid input! \\nDivision by zero");
			return -1;
		}
		return a/b;
	}
	
	public static void main(String[] args) {
		SafeCalc calc = new SafeCalc();
		
		System.out.println(calc.divide(12, 0));
		System.out.println(calc.divide(2.2, 8.8));
	}
}
