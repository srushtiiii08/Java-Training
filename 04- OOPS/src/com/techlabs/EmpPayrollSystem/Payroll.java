package com.techlabs.EmpPayrollSystem;

public class Payroll {

	private Employee[] emparr = new Employee[5];
	private int count = 0;
	
	public void addEmp(Employee emp) {
		if(count <emparr.length) {
			emparr[count] = emp;
			count++;
		} else {
			System.out.println("Cannot add more employees!");
		}
	}
	
	public void displayEmp() {
		System.out.println("Details of all employees are: ");
		for (int i =0; i<count; i++) {
			emparr[i].display();
		}
	}
	
	public void searchRole(JobRole role) {
//		System.out.println("roles of employees: ");
		for (int i =0; i<count; i++) {
			if (emparr[i].getRole()==role) {
				emparr[i].display();
			}
		}
	}
}
 