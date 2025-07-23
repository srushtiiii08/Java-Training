package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Student;

public class StudentTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number of students: ");
	int size = sc.nextInt();
	sc.nextLine();
	
	Student[] student = new Student[size];
	
	for (int i=0; i<size; i++) {
		System.out.println("Enter name of student " + (i+1));
		String name=sc.nextLine();
		
		System.out.println("Enter roll number of student " + (i+1));
		int roll=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter marks of student " + i+1);
		int marks=sc.nextInt();
		
		sc.nextLine();
		
		student[i] = new Student();
		student[i].setName(name);
		student[i].setRollno(roll);
		student[i].setMarks(marks);
	}
	for (Student stud: student) {
		System.out.println("\n________________________________________");
//		System.out.println("Name of students: " + stud.getName());
//		System.out.println("Roll no of students: " + stud.getRollno());
//		System.out.println("marks of students: " + stud.getMarks());
		System.out.println(stud.toString());
		System.out.println("\n_________________________________________");
	}
	
}
}
