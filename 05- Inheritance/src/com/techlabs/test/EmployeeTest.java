package com.techlabs.test;

import com.techlabs.model.Employee;
import com.techlabs.model.Person;

public class EmployeeTest {
public static void main(String[] args) {
	Employee emp = new Employee();
	
	emp.displayDetails();
	emp.showRole();
	
	Person person = new Person();
	person.displayDetails();
}
}
