package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeeTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Employee[] emp = new Employee[5];
	
	System.out.println("Enter details of 5 employees: ");
	for (int i=0; i<emp.length; i++) {
		System.out.println("Enter employee ID: ");
		int empid = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter employee name: ");
		String empname = sc.nextLine();
		
		System.out.println("Enter employee department: ");
		String empdept = sc.nextLine();
		
		System.out.println("Enter employee salary: ");
		double empsal = sc.nextDouble();
		
		emp[i] = new Employee(empid, empname, empdept, empsal);
		System.out.println();
	}
	System.out.println("Employee with lowest salary are: " + Employee.lowSalary(emp));
	
	sc.nextLine();
	System.out.println("Enter department to search employees: ");
	String findDept = sc.nextLine();
	Employee.dept(emp, findDept);
	
	System.out.println("Total salary expense of company: " + Employee.salExpense(emp));
}
}
