package com.techlabs.model;

import java.util.Comparator;

public class DemoIDComparator implements Comparator<DemoComparator>{

	
	@Override
	public int compare(DemoComparator o1, DemoComparator o2) {
		return o1.id - o2.id;		//o1 = this.id, 02=name.id (refer comparable if confused)
	}

	
}
