package com.techlabs.test;

import java.util.Arrays;
import java.util.List;

public class DistinctDemo {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(32, 65,7, 22, 7, 33, 7, 10, 22, 10, 40, 88);
	
//	list.stream().distinct().forEach(System.out::println);
	
	List<String> names = Arrays.asList("Avani","Avani",  "Adi","Adi", "Aariya", "Srushti", "Om", "Aradhya");
	
	names.stream().distinct().forEach(System.out::println);
	
}
}
