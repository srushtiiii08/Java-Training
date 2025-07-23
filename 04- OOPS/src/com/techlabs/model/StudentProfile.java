package com.techlabs.model;

public class StudentProfile {
	String name;
	int roll;
	String course;
	
	public StudentProfile(String name, int roll, String course) {
		this.name=name;
		this.roll=roll;
		this.course=course;
	}
	
	public void displayDetails() {
		System.out.println("--------------------------------");
		System.out.println("Name: " +name);
		System.out.println("Roll no: " +roll);
		System.out.println("Course: " +course);
		System.out.println("--------------------------------");
	}

}
