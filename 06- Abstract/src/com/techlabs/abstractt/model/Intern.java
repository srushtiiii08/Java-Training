package com.techlabs.abstractt.model;
import com.techlabs.abstractt.model.Employee;

public class Intern extends Employee{
	double stipend;
	
	public Intern(String name, int id, double stipend) {
		super(name, id);
		this.stipend=stipend;
	}
	
	public double calcSalary() {
		return stipend;
	}
	
	public void display() {
		System.out.println("Name: " +name+ ", ID: " +id+ ", Stipend: " +calcSalary());
	}

}
