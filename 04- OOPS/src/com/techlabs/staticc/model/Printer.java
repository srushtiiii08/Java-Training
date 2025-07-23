package com.techlabs.staticc.model;

public class Printer {
	public static class Inner {
		public static void printMssg() {
			System.out.println("Nested class accessed!");
		}
	}
}
