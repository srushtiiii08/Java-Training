package com.techlabs.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SoredtDemo {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(32, 65,7, 99, 231, 33, 89, 34, 22, 10, 40, 88);
	
	List<String> names = Arrays.asList("Avani"," ",  "Adi", "Aariya", "Srushti", "Om", "Aradhya");
	
	//asc
//	list.stream().sorted().forEach(System.out::println);
	//desc
//	list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
	//names in asc 
//	names.stream().sorted().forEach(System.out::println);
	
	//names in desc
//	names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
	//names sorted acc to length -- if sorted condition is passed then can't use reverseOrder, have to use reversed()!
//	names.stream().sorted(Comparator.comparing(String :: length)).forEach(System.out::println);
	
	//even number in asc
//	list.stream().filter(i -> i%2 == 0).sorted().forEach(System.out::println);
	
	//odd number in desc
//	list.stream().filter(i -> i%2 == 1).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
	//numbers greater than 50 in desc
//	list.stream().filter(i->i>50).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
	//numbers less than 50 in asc
//	list.stream().filter(i->i<50).sorted().forEach(System.out::println);
	
	
}
}
