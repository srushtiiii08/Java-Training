package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(2, 45,7,22,33,87,52,38,50,53, 90);
	
	List<String> names = Arrays.asList("Avani"," ",  "Adi", "Aariya", "Srushti", "Om", "Aradhya");
	
	
	
//	list.stream().filter(i -> i%2 == 1).map(i->i*2).collect(Collectors.toList()).forEach(System.out::println);
	
	
//	names.stream().filter(str -> str.length() >4).map(str -> str.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
	//OR
//	names.stream().filter(str -> str.length() >4).map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

	List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 8);
	
	//Q1- sq of numbers
//	num.stream().map(i -> i*i).collect(Collectors.toList()).forEach(System.out::println);
	
	//Q2 - multiply all by 10
//	num.stream().map(i -> i*10).collect(Collectors.toList()).forEach(System.out::println);
	
	
	//Q3- 10% discount
	List<Integer> productPrice = Arrays.asList(100, 229, 31, 49, 500, 89);
	productPrice.stream().map(i -> i-(i*0.1)).collect(Collectors.toList()).forEach(System.out::println);
	
	
	//Q4- Add mr or mrs prefix to names
	names.stream().map(n -> ("Mr/Mrs " +n)).collect(Collectors.toList()).forEach(System.out::println);
	
}
}
