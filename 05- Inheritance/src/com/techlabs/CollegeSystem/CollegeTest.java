package com.techlabs.CollegeSystem;

import java.util.Scanner;

public class CollegeTest {
	
	public static boolean isValidDepartment(String dept) {
		return dept.equalsIgnoreCase("CE") || dept.equalsIgnoreCase("MECH")
				|| dept.equalsIgnoreCase("EXTC") || dept.equalsIgnoreCase("IT");
	}

	public static Departments getDepartment(String dept) {
		return Departments.valueOf(dept.toUpperCase());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number of students: ");
		int studentCount = sc.nextInt();
		sc.nextLine();
	
		System.out.println("Enter the number of professors: ");
		int profCount = sc.nextInt();
		sc.nextLine();
	
		Student[] students = new Student[studentCount];
		Professor[] professors = new Professor[profCount];
	
		System.out.println("Enter student details: ");
		for (int i=0; i< studentCount; i++) {
			System.out.println("Enter " + (i+1)+ " Student name: ");
			String name = sc.nextLine();
		
			System.out.println("Enter " +(i+1)+ " student roll no: ");
			int sid = sc.nextInt();
			sc.nextLine();
		
			String deptInput;
			while(true) {
				System.out.println("Department (IT, CE, MECH, EXTC): ");
				deptInput = sc.nextLine();
				if (isValidDepartment(deptInput)) {
					break;
				}
				System.out.println("Inavlid department.");
			}
		
			Departments depts = getDepartment(deptInput);
			Student s = new Student(name, sid, depts);
		
			System.out.println("How many courses you want to enroll? (max 5): ");
			int courseCount = sc.nextInt();
			sc.nextLine();
		
			if (courseCount> 5) 
				courseCount = 5;
				for (int j=0; j<courseCount; j++) {
					System.out.println("Course " +(j+1)+ ": ");
					String course = sc.nextLine();
					s.enrollCourse(course);
				}
				students[i] = s;
		}
	
	
		System.out.println("---------------------------------------");
		System.out.println("Enter professor details: ");
		for (int i = 0; i < profCount; i++) {
			System.out.print("Enter " +(i+1)+ " Professor Name: ");
			String name = sc.nextLine();

			System.out.print("ID: ");
			int pid = sc.nextInt();
			sc.nextLine();

			String deptInput;
			while (true) {
				System.out.print("Department (CE, MECH,IT, EXTC): ");
				deptInput = sc.nextLine();
				if (isValidDepartment(deptInput)) {
					break;
				}
				System.out.println("Invalid department. Try again.");
			}
			Departments dept = getDepartment(deptInput);
			Professor p = new Professor(name, pid, dept);
		
			System.out.println("how many subjects to assign (max 5)? ");
			int subjectCount = sc.nextInt();
			sc.nextLine();
		
			if (subjectCount>5)
				subjectCount = 5;
			
				for (int j = 0; j < subjectCount; j++) {
					System.out.println("Subject " +(j+1)+ ": ");
					String subject = sc.nextLine();
					p.assignSubject(subject);
				}
			
				professors[i] = p;
		}	
		
			System.out.println("------------------------------------");
			System.out.println("  Professor details: ");
			for (Professor pr: professors) {
				pr.getDetails();
			}
	
			System.out.println("---------------------------------------");
			System.out.println("   Student details: ");
			for (Student s: students) {
				s.getDetails();
			}
	
	
			System.out.println("total students: " + Student.studentCount);
	
}
}
 