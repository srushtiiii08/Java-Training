package com.techlabs.test;

public class ExceptionChaining {
	
	public static void processPayment() {
		try {
			String data = null;
			System.out.println(data.length());  //causes null pointer exception
		} catch (NullPointerException n) {
			throw new RuntimeException("Runtime exception occured in method " +n);
		}
	}

	public static void main(String[] args) {
		try {
			processPayment();
		} catch(RuntimeException r) {
			System.out.println("Caught "+r);
		}
	}
}
