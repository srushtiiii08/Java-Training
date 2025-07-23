package com.techlabs.model;

import java.util.Comparator;

public class DemoNameComparator implements Comparator<DemoComparator>{

	@Override
	public int compare(DemoComparator o1, DemoComparator o2) {
		return o1.name.compareTo(o2.name);
	}
	

}
