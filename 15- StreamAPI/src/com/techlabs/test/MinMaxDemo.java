package com.techlabs.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxDemo {
public static void main(String[] args) {

	List<Integer> list = Arrays.asList(32, 65,7, 99, 231, 33, 89, 34, 22, 10, 40, 88);
	
	List<String> names = Arrays.asList("Avani"," ",  "Adi", "Aariya", "Srushti", "Om", "Aradhya");
	
	System.out.println(list.stream().min(Comparator.naturalOrder()));
	System.out.println(list.stream().min(Comparator.comparing(Integer::intValue)));
	
	System.out.println("name w max length: " +names.stream().max(Comparator.naturalOrder()));
	
	System.out.println("name w min length: " +names.stream().min(Comparator.naturalOrder()));
	
	System.out.println("Largest Even Number: " +list.stream().filter(i-> i%2==0).max(Comparator.naturalOrder()));
	
	
}
}
