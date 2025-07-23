package com.techlabs.CollegeSystem;

public class Student extends Person{
	
	int sid;
	static int studentCount =0;
	String[] courses = new String[5];
	int courseCount  = 0;
	
//	public Student() {
//	}
	
	public Student(String name, int sid, Departments dept) {
		super(name, dept);
		this.sid=sid;
		studentCount++;
	}
	
	public void enrollCourse(String courseName) {
		if (courseCount < courses.length) {
			courses[courseCount] = courseName;
			courseCount++;
		} else {
			System.out.println("Cannot enroll in more than 5 courses.");
		}
	}
		
	@Override
	public void getDetails() {
		String courseList = "";
		for (int i=0; i<courseCount; i++) {
			courseList += courses[i];
			if (i != courseCount - 1) {
				courseList += ", ";
			}
		}
		System.out.println("Name: " + name+ ", Student ID: " + sid + ", Department: " + dept+ ", Courses: " +courseList);
	}
}
