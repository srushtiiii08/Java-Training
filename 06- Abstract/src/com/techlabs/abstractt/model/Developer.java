package com.techlabs.abstractt.model;

import com.techlabs.abstractt.model.Employee;

public class Developer extends Employee{
	double baseSal;
	double bonus;
	
	public Developer(String name, int id, double baseSal, double bonus) {
		super(name, id);
		this.bonus=bonus;
		this.baseSal=baseSal;
	}
	
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return baseSal+bonus;
	}
	
	public void display() {
		System.out.println("Name: " +name+ ", ID: " +id+ "Base salary: " +baseSal+ ", Total salary: " +calcSalary());
	}

}
