package com.techlabs.abstractt.test;

import com.techlabs.abstractt.model.CommerceStudent;
import com.techlabs.abstractt.model.SciStudent;
import com.techlabs.abstractt.model.Student;

public class StudentTest {
public static void main(String[] args) {
	SciStudent science[] = new SciStudent[2];
	CommerceStudent commerce[] = new CommerceStudent[2];
	
	science[0] = new SciStudent(1, "Srushti", 78, 90, 96);
	science[1] = new SciStudent(2, "Awadhut", 96, 98, 93);
	
	commerce[0] = new CommerceStudent(34, "ravi", 76, 89, 54);
	commerce[1] = new CommerceStudent(5, "pratibha", 69, 730, 53);
	
	for (SciStudent res1: science) {
		System.out.println("ID: " +res1.getRoll()+ ", Name: " +res1.getName()+ ", Physics Marks: " +res1.getPhyMarks()+ ", Chemistry Marks: " +res1.getChemMarks()+ ", Maths Marks: "+ res1.getMathMarks()+ ", Grade: " + res1.calcGrade());
		System.out.println("-------------------------------------------------------------------------------------------------");
	}
	
	System.out.println("\n");
	
	for (CommerceStudent res2: commerce) {
		System.out.println("ID: " +res2.getRoll()+ ", Name: " +res2.getName()+ ", Accounts Marks: " +res2.getAccMarks()+ ", Economics Marks: " +res2.getEcoMarks()+ ", Business Marks: "+ res2.getBusinessMarks()+ ", Grade: " + res2.calcGrade());
		System.out.println("-------------------------------------------------------------------------------------------------");
	}
}
}
