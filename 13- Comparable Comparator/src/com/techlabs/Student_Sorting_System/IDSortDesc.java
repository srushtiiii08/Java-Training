package com.techlabs.Student_Sorting_System;

import java.util.Comparator;

public class IDSortDesc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o2.id - o1.id;
	}

}
