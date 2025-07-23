package com.techlabs.model;

public class Student {
	
	public int rollno;
	public String name;
	private double cgpa = 9.87;
	public static final int age = 20;

	public Student() {
		
	}
	
	public Student(int rollno, String name, double cgpa) {
		this.rollno = rollno;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	private void greet() {
		System.out.println("Hello");
	}
	
	public double result() {
		return cgpa;
	}

	@Override
	public String toString() {
		return rollno + " | " + name + " | " + cgpa;
	}
	

	
	
}
