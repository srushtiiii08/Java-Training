package com.techlabs.abstractt.model;

public abstract class Employee {

	String name;
	int id;
	
	
	public Employee() {
	}
	
	public Employee(String name, int id){
		this.name=name;
		this.id=id;
//		this.baseSal = baseSal;
	}
	
	public abstract double calcSalary();
}
