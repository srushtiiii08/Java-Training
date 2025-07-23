package com.techlabs.student_record_mgmt;

public class Student {

	int roll;
	String name;
	int marks;

	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public void display() {
		System.out.println("Roll: " + roll + ", Name: " + name + ", Marks: " + marks);
	}

	public String toFileString() {
		return roll + "," + name + "," + marks;
	}	
}
