package com.techlabs.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.techlabs.model.DemoComparator;
import com.techlabs.model.DemoIDComparator;
import com.techlabs.model.DemoNameComparator;
import com.techlabs.model.DemoNameComparatorDESC;
//import com.techlabs.model.DemoIDComparator;

public class DemoComparatorTest {

	public static void main(String[] args) {
		
		ArrayList<DemoComparator> list = new ArrayList<>();
		
		list.add(new DemoComparator(12, "srushti"));
		list.add(new DemoComparator(22, "adi"));
		list.add(new DemoComparator(45, "om"));
		list.add(new DemoComparator(33, "ara"));
		
		System.out.println(list);
		
		Collections.sort(list, new DemoIDComparator());
		System.out.println("\nSorting using id: " +list);
		
		Collections.sort(list, new DemoNameComparator());
		System.out.println("\nSorted using name in asc order: " +list);
		
		Collections.sort(list, new DemoNameComparatorDESC());
		System.out.println("\nSorted using name in decc order: " +list);
	}
}



	
