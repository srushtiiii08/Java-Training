package com.techlabs.model;

public class Student {
	String name;                //declare
	int PRN;
	double cgpa;
	
	public Student(String name, int PRN, double cgpa)        //contructor created w parameters
	{
		this.name = name;               //initializing  
		this.PRN = PRN;					//lhs is declared var(current var) & lhs is from parameter
		this.cgpa = cgpa; 
	}
	
	public void display() {
		System.out.println("name: " +name+ ", PRN: " +PRN+ ", cgpa: " +cgpa);
		System.out.println("-----------------------------------------------");
	}
	

}
