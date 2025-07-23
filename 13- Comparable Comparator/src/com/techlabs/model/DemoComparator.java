package com.techlabs.model;

import java.util.Comparator;

public class DemoComparator implements Comparator<DemoComparator> {
	int id;
	String name;

	public DemoComparator(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compare(DemoComparator o1, DemoComparator o2) {
		// TODO Auto-generated method stub
		return 0;
	}



}
