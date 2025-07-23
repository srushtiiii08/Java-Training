package com.techlabs.methodOverloading.test;

public class Addition {
	public int add(int a, int b) {
		return a*b;
	}
	
	public double add(double a, double b) {
		return a*b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Addition a = new Addition();
		
		System.out.println(a.add(2, 4));
		System.out.println(a.add(2.1, 2.2));
		System.out.println(a.add(2, 6, 4));
		
	}

}
