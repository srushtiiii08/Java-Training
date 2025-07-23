package com.techlabs.Employee;

import java.time.LocalDate;

public class Employee {
	
	String name;
	char gender;
	int salary;
	LocalDate joiningDate;
		
	public Employee(String name, char gender, int salary, LocalDate joiningDate) {
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", gender=" + gender + ", salary=" + salary + ", DOJ=" + joiningDate;
	}
}
