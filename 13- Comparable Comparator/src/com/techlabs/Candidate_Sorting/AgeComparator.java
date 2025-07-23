package com.techlabs.Candidate_Sorting;

import java.util.Comparator;

public class AgeComparator implements Comparator<Candidate>{

	@Override
	public int compare(Candidate o1, Candidate o2) {
		return o1.age - o2.age;
	}

}
