package com.swabhavtechlabs.forloop;

public class PrePostIncrement {
	public static void main(String[] args) {
		int a = 10;
		int b = --a;
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		
		
		int x = 10;
		System.out.println(++x + x++);
		
		int a1 = 5;
		System.out.println(a1++ + ++a1);
	}
}
