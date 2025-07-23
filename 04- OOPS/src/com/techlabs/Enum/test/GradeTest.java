package com.techlabs.Enum.test;

import java.util.Scanner;

import com.techlabs.Enum.model.Grade;
import com.techlabs.Enum.model.GradeMethod;

public class GradeTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter grade (A, B, C, D, E, F)");
	String grd = sc.next().toUpperCase();
	
	if (grd.equals("A") || grd.equals("B") || grd.equals("C") || grd.equals("D") || grd.equals("E") || grd.equals("F")) {
		Grade grade = Grade.valueOf(grd);
		String desc = GradeMethod.description(grade);
		System.out.println("Grade: " + grade);
		System.out.println("Description: " +desc);
	}
	else {
		System.out.println("Invalid input");
	}
}
}
