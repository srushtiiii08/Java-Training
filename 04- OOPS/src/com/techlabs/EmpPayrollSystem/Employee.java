package com.techlabs.EmpPayrollSystem;

public class Employee {
	
	private int empid;
	private String name;
	private double sal;
	private JobRole role;

	public Employee(int empid, String name, double sal, JobRole role) {
		this.empid= empid;
		this.name=name;
		this.sal=sal;
		this.role= role;
	}
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public JobRole getRole() {
		return role;
	}

	public void setRole(JobRole role) {
		this.role = role;
	}

	public double calcBonus() {
		switch(role) {
		case MANAGER:
			return sal*0.2;
		case DEVELOPER:
			return sal*1.5;
		case DESIGNER:
			return sal*1.5;
		default:
			return sal*0.1;
		}
	}
	
	public void display() {
		System.out.println("Employee ID: " + empid + ", name: " +name+ ", Role: " +role+ ", salary: " +sal+ ", Bonus: " + calcBonus());
	}
}
