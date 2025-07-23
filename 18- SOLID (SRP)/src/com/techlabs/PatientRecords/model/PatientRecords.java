package com.techlabs.PatientRecords.model;

public class PatientRecords {

	private String name;
	private int age;
	private String email;
	private String assignedDr;
	
	public PatientRecords() {
	}
	
	public PatientRecords(String name, int age, String email, String assignedDr) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.assignedDr = assignedDr;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAssignedDr() {
		return assignedDr;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAssignedDr(String assignedDr) {
		this.assignedDr = assignedDr;
	}

	
}