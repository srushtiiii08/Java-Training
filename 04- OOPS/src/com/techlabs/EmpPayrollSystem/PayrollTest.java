package com.techlabs.EmpPayrollSystem;
import com.techlabs.EmpPayrollSystem.*;

public class PayrollTest {
public static void main(String[] args) {
Payroll pr = new Payroll();
	
	pr.addEmp(new Employee(1111, "Srushti", 90000, JobRole.DEVELOPER));
	pr.addEmp(new Employee(1112, "Sreshtha", 70000, JobRole.DESIGNER));
	pr.addEmp(new Employee(1113, "Sri", 50000, JobRole.TESTER));
	pr.addEmp(new Employee(1114, "Siddhi", 80000, JobRole.DEVELOPER));
	pr.addEmp(new Employee(1115, "Riddhi", 90000, JobRole.MANAGER));

	pr.displayEmp();
	
	System.out.println("---------------------------------------------------");
	System.out.println("\nSearch: Developers");
	pr.searchRole(JobRole.DEVELOPER);
}	
}
