package com.techlabs.staticc.test;

import com.techlabs.staticc.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("Srushti");
		Student s2 = new Student("Ruchira");
		
		s1.display();
		s2.display();
	}
}
