package com.techlabs.abstractt.model;

public abstract class Student {

	int rollno;
	String name;
	
	public Student(int rollno, String name) {
		this.rollno=rollno;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return rollno;
	}
	
	public abstract String calcGrade();
}
