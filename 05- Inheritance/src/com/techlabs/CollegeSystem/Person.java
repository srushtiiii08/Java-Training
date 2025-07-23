package com.techlabs.CollegeSystem;

public class Person {
	
	String name;
	Departments dept;
	
	public Person() {
	}
	
	public Person(String name, Departments dept) {
		this.name=name;
		this.dept=dept;
	}
	
	public void getDetails() {
		System.out.println("Name: " + name+ "Department: " + dept);
	}
}
