package com.techlabs.methodOverloading.test;

public class Attendance {
	
	public void markAttendance() {
		System.out.println("General attendance marked for all students!");
	}
	
	public void markAttendance(String name) {
		System.out.println("Attendance marked for " +name);
	}
	
	public void markAttendance(String[] names) {
		System.out.println("attendance marked for multiple students: " );
		for (String n: names) {
			System.out.println(n);
		}
	}
	
	
	public static void main(String[] args) {
		Attendance att = new Attendance();
		
		att.markAttendance();
		att.markAttendance("\nSrushti");
//		String[] arr = new String[3];
		String[] arr = {"Sru", "Om", "Aradhya"};
		att.markAttendance(arr);
	}

}
