package com.techlabs.staticc.model;

public class Student {

	String name;
	static String college = "SIES GST college";
	
	public Student(String name) {
		this.name=name;
	}
	
	public void display() {
		System.out.println("Name: " +name+ ", College: " +college);
	}
	

}
