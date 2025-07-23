package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Student;

public class StudentTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number of students: ");
	int numberOfStudents = scanner.nextInt();
	
	scanner.nextLine();
	
	Student[] students = new Student[numberOfStudents];         //Student[] calls students constructor and creates students of the const. data type
	
	System.out.println("Enter student details: ");
	for (int i=0; i<numberOfStudents; i++) {
		scanner.nextLine();
		System.out.println("Enter student name: ");
		String StudentName = scanner.nextLine();
		
		System.out.println("Enter student PRN: ");
		int PRN = scanner.nextInt();
		
		
		System.out.println("Enter student cgpa: ");
		double cgpa = scanner.nextDouble();
		
		students[i] = new Student(StudentName, PRN, cgpa);
	}
	for (Student result : students) {				//used array of object, Student as a data type for variable result
		result.display();
	}
	
}
}
