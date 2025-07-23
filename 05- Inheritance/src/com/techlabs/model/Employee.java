package com.techlabs.model;

public class Employee extends Person {
	
	public void showRole() {
		System.out.println("I am an employee");
	}
	
	
	@Override						//annotation
	public void displayDetails() {
		System.out.println("I am a corporate majdoor");
	}
	
}
