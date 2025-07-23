package com.swabhavtechlabs.forloop;

public class MethodWithParameters {
//	public static void add(int a, int b) {
//		int sum = a + b;
//		System.out.println("sum is: " + sum);      //no return, thus print statement in method
//	}
//	public static void main(String[] args) {
//		add(10,12);
//	}

	public static void greet(String name, int age, String dept) {
		System.out.println("My name is " + name + "\nMy age is " + age + "\nMy department is " + dept);
	}
	public static void main(String[] args) {
		greet("srushti", 21, "IT");
		
	}
}
