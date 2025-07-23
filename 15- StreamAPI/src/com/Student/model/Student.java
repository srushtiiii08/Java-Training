package com.Student.model;

public class Student {

	public int roll;
	public String name;
	public double cgpa;
	
	public Student(int roll, String name, double cgpa) {
		this.roll = roll;
		this.name = name;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Roll=" + roll + ", name=" + name + ", cgpa=" + cgpa;
	}
		
	
}
