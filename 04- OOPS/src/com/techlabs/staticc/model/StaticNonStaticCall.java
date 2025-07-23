package com.techlabs.staticc.model;

public class StaticNonStaticCall {

	public static void showStatic() {
		System.out.println("Static method called");
	}
	
	public void showNonStatic() {
		System.out.println("Non Static method called");
	}
}
