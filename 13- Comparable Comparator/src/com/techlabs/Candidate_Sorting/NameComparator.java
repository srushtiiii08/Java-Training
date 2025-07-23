package com.techlabs.Candidate_Sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Candidate>{

	@Override
	public int compare(Candidate o1, Candidate o2) {
		int nameSort = o1.name.compareTo(o2.name);
		
		if (nameSort == 0) {
			return o1.age-o2.age;
		} else {
			return nameSort;
		}
	}

}
