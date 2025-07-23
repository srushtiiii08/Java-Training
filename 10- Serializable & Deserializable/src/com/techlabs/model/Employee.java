package com.techlabs.model;

import java.io.Serializable;

public class Employee implements Serializable{  //Serializable is an interface that needs to be implemented
											//in order to prevent "NotSerializableException" where the java needs to know which file is to be serialized
	int id;
	String name;
	String department;
	
	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	public void display() {
		System.out.println("Name: " +name+ ", ID: "+id+ ", Domain: " +department);
	}
	
}
