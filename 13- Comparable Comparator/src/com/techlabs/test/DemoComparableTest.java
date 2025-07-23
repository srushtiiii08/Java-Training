package com.techlabs.test;

import java.util.ArrayList;
import java.util.Collections;

import com.techlabs.model.DemoComparable;

public class DemoComparableTest {
public static void main(String[] args) {
	
	ArrayList<DemoComparable> list = new ArrayList<>();
	
	list.add(new DemoComparable(12, "srushti"));
	list.add(new DemoComparable(22, "adi"));
	list.add(new DemoComparable(45, "om"));
	list.add(new DemoComparable(33, "ara"));
	
	System.out.println(list);
	
	Collections.sort(list);
	
	System.out.println("Sorted array: " +list);
}
}
