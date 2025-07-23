package com.techlabs.staticc.test;

import com.techlabs.staticc.model.Employee;

public class EmployeeTest {
public static void main(String[] args) {
	Employee emp1 = new Employee();
	Employee emp2 = new Employee();
	Employee emp3 = new Employee();
	Employee emp4 = new Employee();
	
	System.out.println("Total Employee count: " + Employee.count);
}
}
