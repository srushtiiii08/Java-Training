package com.techlabs.hospitalStaff;

public abstract class HospitalStaff {

	int staffID;
	String name;
	String department;
	
	public HospitalStaff(int staffID, String name, String department) {
		this.name=name;
		this.staffID = staffID;
		this.department= department;
	}
	
	public abstract void work();
	
	public String toString() {
		return "ID: " +staffID+ ", Name: " +name+ ", Department: " +department;
	}
}
