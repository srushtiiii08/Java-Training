package com.techlabs.Student_Sorting_System;

import java.util.Comparator;

public class IDSortASC implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id - o2.id;
	}

}
