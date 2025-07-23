package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeeTest {
	
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	Scanner sc = new Scanner(System.in);
	
	Employee emp = new Employee(1221, "Srushti" ,"Banking");
	
	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"));
	out.writeObject(emp);
	out.close();
	System.out.println("Object created successfully");
	
	
	ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"));  //when i run this, it does not create another employee.ser
	Employee emp2 = (Employee)in.readObject();		//typecasting									//it overrides the already existing one
	in.close();
	System.out.println("Employee Object restored");
	emp2.display();
}
}
