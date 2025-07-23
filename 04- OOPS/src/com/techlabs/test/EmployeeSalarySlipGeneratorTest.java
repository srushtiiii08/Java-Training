package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.EmployeeSalarySlipGenerator;

public class EmployeeSalarySlipGeneratorTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter name of employee: ");
	String name = sc.nextLine();
	
	System.out.println("Enter ID of employee: ");
	int id = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("Enter basic salary of employee: ");
	double salary = sc.nextDouble();
	
	sc.nextLine();
	
	EmployeeSalarySlipGenerator emp = new EmployeeSalarySlipGenerator(name, id, salary);    //object
	
	System.out.println("the total salary of employee is: ");
	System.out.println(emp.GenerateSalarySlip());
}
}
