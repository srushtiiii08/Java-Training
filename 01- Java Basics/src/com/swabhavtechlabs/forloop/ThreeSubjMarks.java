package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class ThreeSubjMarks {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String[] subject = new String[3];
	int[] marks = new int[3];
	
	System.out.println("Enter the 3 subjects and its marks: ");
	for (int i=0;i<marks.length; i++) {
		
		System.out.println("Enter subject " + (i+1));
		subject[i] = scanner.nextLine();
		
		System.out.println("Enter marks for " + subject[i] + ": ");
		marks[i] = scanner.nextInt();
		scanner.nextLine();
	}
	
	System.out.println("Students Marks: ");
	for (int i =0; i<3; i++) {
		System.out.println(subject[i] + ": " + marks[i]);
	}
}
}
