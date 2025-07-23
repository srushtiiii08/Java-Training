package com.techlabs.Student_Sorting_System;

import java.util.Comparator;

public class Student implements Comparator<Student>{

	int id;
	String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
		@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
