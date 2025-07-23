package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterDemo {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(2, 45,7,22,33,87,52,38,50,53, 90);
	System.out.println(list);
	
//	List<Integer> item = list.stream().filter(i -> i%2 == 1).collect(Collectors.toList());
//	System.out.println(item);
	
	//if using forEach, no need to give return type of variable to store the data
//	list.stream().filter(num -> num>30).collect(Collectors.toList()).forEach(System.out::print);
	
//	list.stream().filter(num -> num>30).collect(Collectors.toList()).forEach(num -> System.out.print(num + ", "));
	
	
	//Q1- to print even numbers
	list.stream().filter(i -> i%2 == 0).collect(Collectors.toList()).forEach(System.out::println);
	
	
	//Q2 - print words starting w A
	List<String> names = Arrays.asList("Avani"," ",  "Adi", "Aariya", "Srushti", "Om", "Aradhya");
//	names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);
	//or
//	names.stream().filter(n -> n.charAt(0) == 'A').collect(Collectors.toList()).forEach(System.out::println);
	
	
	//Q4 - filter out all empty or blank
//	names.stream().filter(i -> !i.isBlank()|| !i.isEmpty() || !i.contains(null)).collect(Collectors.toList()).forEach(System.out::println);

	
	
}
}
