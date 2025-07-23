package com.techlabs.Student_Sorting_System;

import java.util.Comparator;

public class NameSortASC implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}

}
