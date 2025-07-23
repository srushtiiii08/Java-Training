package com.techlabs.hospitalStaff;

public class HospitalTest {
public static void main(String[] args) {
	HospitalStaff[] staff = new HospitalStaff[4];
	
	staff[0] = new Doctor(121, "Dr. Srushti", "Dentist", "Endodontics", new String[] {"Astha", "Avani"});
	staff[1] = new Doctor(122, "Dr. Ruchira", "Emergency", "Heart surgeon", new String[] {"Ram", "Bharat", "Ravan"});
	staff[2] = new Nurse(221, "Pratibha", "ENT", "morning");
	staff[3] = new Nurse(224, "Aditi", "Emergency", "afternoon");
	
	//display
	System.out.println("--------Hospital Staff Details-------");
	for (HospitalStaff result: staff) {
		System.out.println(result.toString());
	}
	
	//polymorphism
	System.out.println("\n--------Staff Roles--------");
	for (HospitalStaff res: staff) {
		res.work();
	}
}
}
