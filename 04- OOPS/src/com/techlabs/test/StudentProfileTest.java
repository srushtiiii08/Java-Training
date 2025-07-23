package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.StudentProfile;

public class StudentProfileTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	StudentProfile[] student = new StudentProfile[3];
	
	for (int i=0; i<3; i++) {
		System.out.println("Enter student " + (i+1)+ " details: ");
		System.out.println("Name: ");
		String name=sc.nextLine();
		System.out.println("Roll no: ");
		int roll = sc.nextInt();
		sc.nextLine();
		System.out.println("Course: ");
		String course = sc.nextLine();
		
		student[i] = new StudentProfile(name, roll, course);
	}
	
	System.out.println("\n All student details: ");
	for (StudentProfile stud: student) {
		stud.displayDetails();
	}
}
}
