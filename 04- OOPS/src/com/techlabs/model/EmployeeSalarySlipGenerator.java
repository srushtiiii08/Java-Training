package com.techlabs.model;

public class EmployeeSalarySlipGenerator {

	String name;
	int id;
	double salary;
	
	public EmployeeSalarySlipGenerator(String name, int id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	double HRA=0, DA=0, totalSal=0;
	public double GenerateSalarySlip() {
		HRA = 0.2*salary;
		DA = 0.1*salary;
		totalSal = salary + HRA + DA;
		return totalSal;
	}
}
