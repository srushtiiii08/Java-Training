package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.ThreeSubjMarks;

public class ThreeSubjMarksTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ThreeSubjMarks[] students = new ThreeSubjMarks[3];
	
	System.out.println("Enter student details: ");
	for (int i=0; i<students.length; i++) {
		System.out.println("Enter student name: ");
		String studentName = sc.nextLine();
		
		System.out.println("Enter student roll no: ");
		int rollno = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter student's maths marks: ");
		int marks1 = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter student's english marks: ");
		int marks2 = sc.nextInt();
		
		sc.nextLine();
		System.out.println("enter student's science marks: ");
		int marks3 = sc.nextInt();
		
		sc.nextLine();
		students[i] = new ThreeSubjMarks(studentName, rollno, marks1, marks2, marks3);
		System.out.println();
	}
	
	for (ThreeSubjMarks result : students) {
		result.display();
	}
}
}
