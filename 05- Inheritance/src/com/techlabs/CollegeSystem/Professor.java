package com.techlabs.CollegeSystem;

public class Professor extends Person{
	int pid;
	String[] subjects = new String[5]; 
	int subjectCount = 0;
	
//	public Professor() {
//	}
	
	public Professor(String name, int pid, Departments dept) {
		super(name, dept);
		this.pid=pid;
	}
	
	public void assignSubject(String subjectName) {
		if (subjectCount < subjects.length) {
			subjects[subjectCount] = subjectName;
			subjectCount++;
		} else {
			System.out.println("Cannot assign more than 5 subjects.");
		}
	}
	
	@Override
	public void getDetails() {
		String subjectList = "";
		for (int i=0; i<subjectCount; i++) {
			subjectList += subjects[i];
			if (i!=subjectCount - 1) {
				subjectList += ", ";
			}
		}
		System.out.println("Name: " + name+ ", Prof ID: " + pid + ", Department: " + dept+ ", Subjects: " +subjectList);
	}


}
