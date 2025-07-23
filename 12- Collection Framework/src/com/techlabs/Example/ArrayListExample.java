package com.techlabs.Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
public static void main(String[] args) {
	
	ArrayList<Integer> marks = new ArrayList<>();
	
	ArrayList<Integer> marks2 = new ArrayList<>();
	
	marks.add(12);
	marks.add(23);
	marks.add(45);
	marks.add(44);
	marks.add(99);
	marks.add(76);
	marks.add(65);
	marks2.add(333);
	marks2.add(111);
	marks2.add(444);
	
	System.out.println("Second collecion: " +marks2);
	
	System.out.println("First collecion: "+marks);
	marks.add(23);
	System.out.println(marks);
	
//	marks.add(2, 100);
//	System.out.println("New number added: " +marks);
//	marks.size();
	//System.out.println("Size of marks: " + marks.size());
	
//	System.out.println(marks.containsAll(marks2));
//	System.out.println(marks2.contains(21));
	
//  System.out.println("Index of 333 is " +marks2.lastIndexOf(333));
	
//	System.out.println(marks.remove(Integer.valueOf(23)));
//	System.out.println(marks);   //23 removed- index[1]
//	
//	System.out.println(marks2.retainAll(marks2));
//	System.out.println(marks2);
	
	
	System.out.println(marks2.removeAll(marks2));
	System.out.println("Removed all elemnts: " +marks2);
	System.out.println("Check if the array is empty: " +marks2.isEmpty());
	
	Collections.sort(marks);
	System.out.println("Sorted array: " +marks);
	
	//System.out.println(marks);
}
}
