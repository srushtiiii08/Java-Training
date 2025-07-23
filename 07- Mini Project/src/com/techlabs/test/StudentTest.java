package com.techlabs.test;

import com.techlabs.model.ArtsStudent;
import com.techlabs.model.ScienceStudent;
import com.techlabs.model.Student;
import com.techlabs.model.commerceStudent;

public class StudentTest {
public static void main(String[] args) {
	Student[] student = new Student[5];
	
	student[0] = new ScienceStudent(111, "Srushti", "science", 78, 88, 92);
	student[1] = new ScienceStudent(112, "Om", "science", 65, 77, 89);
	student[2] = new commerceStudent(113, "Aradhya", "commerce", 98, 54, 61);
	student[3] = new ArtsStudent(115, "Aditi", "arts", 66, 78, 98);
	student[4] = new ScienceStudent(117, "ruchira", "science", 91, 95, 99);
	
	System.out.println("------------Student Information------------\n");
	for (Student result: student) {
		result.displayInfo();
		result.displayPerformance(true);
		result.calculatePerformance();
		System.out.println("--------------------------------------------------------------------------------------");
	}
}
}
