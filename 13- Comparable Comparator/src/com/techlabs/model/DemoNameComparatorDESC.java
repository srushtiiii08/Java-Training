package com.techlabs.model;

import java.util.Comparator;

public class DemoNameComparatorDESC implements Comparator<DemoComparator>{

	@Override
	public int compare(DemoComparator o1, DemoComparator o2) {
		return o2.name.compareTo(o1.name);
	}

}
