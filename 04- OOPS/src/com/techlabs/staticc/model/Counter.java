package com.techlabs.staticc.model;

public class Counter {
	static int value =0;
	
	public static void inc() {
		value++;
		System.out.println("Counter: " + value);
	}

}
