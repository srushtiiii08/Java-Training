package com.techlabs.model;

public class Student {

	public String name;
	public int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return name + ": "+ marks;
	}
	
	
}
