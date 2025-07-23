package com.techlabs.model;

public abstract class Student {
	
	int rollNumber;
	String name;
	String stream;
	
	public Student(int rollNumber, String name, String stream) {
		this.rollNumber=rollNumber;
		this.name=name;
		this.stream=stream;
	}
	
	public abstract void calculatePerformance();		//asked in Q
	public abstract void showMarks();
	public abstract float getAverage();
	public abstract String getGrade();
	
	public void displayInfo() {
		System.out.println("Name: " +name);
		System.out.println("Roll Number: "+rollNumber+ "       Stream: "+stream);
	}
	
	//method overloading - default print
	public void displayPerformance() {
		calculatePerformance();
	}
	
	//method overloading - subject wise marks
	public void displayPerformance(boolean detailed) {
		if (detailed) {
			showMarks();
		}
	}
	
	//method overloading - show as percentage or grade
	public void displayPerformance(String format) {
		if (format.equalsIgnoreCase("Grade")) {
			System.out.println("Grade: " +getGrade());
		}
		else if(format.equalsIgnoreCase("Percentage")) {
			System.out.println("Percentage(in avg):" +getAverage()+ "%");
		}
		else {
			System.out.println("Invalid input!");
		}
	}
}
