package com.techlabs.abstractt.test;

import com.techlabs.abstractt.model.Developer;
import com.techlabs.abstractt.model.Employee;
import com.techlabs.abstractt.model.Intern;

public class EmployeeTest {
public static void main(String[] args) {
//	Employee employee[] = new Employee[4];
//	
//	employee[0] = new Developer("Srushti", 121, 30000, 2000);
//	employee[1] = new Developer("Siddhi", 123, 30000, 2200);
//	employee[2] = new Intern("om", 001, 30000);
//	employee[3] = new Intern("aradhya", 002, 30000);
	
	Developer developer[] = new Developer[2];
	Intern intern[] = new Intern[2];
	
	developer[0] = new Developer("Srushti", 121, 30000, 2000);
	developer[1] = new Developer("Siddhi", 123, 30000, 2200);
	
	intern[0] = new Intern("om", 001, 30000);
	intern[1] = new Intern("aradhya", 002, 30000);
	
	for (int i=0; i<2; i++) {
		developer[i].display();
	}
	System.out.println("\n");
	for(int j=0; j<2; j++) {
		intern[j].display();
	}

}
}
