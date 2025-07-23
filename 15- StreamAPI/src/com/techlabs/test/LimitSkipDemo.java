package com.techlabs.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LimitSkipDemo {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(32, 65,7, 22, 7, 33, 7, 10, 22, 10, 40, 88);
		
	List<String> names = Arrays.asList("Avani","Avani",  "Adi","Adi", "Aariya", "Srushti", "Om", "Aradhya");
	
	//limit(): sirf uthe hi start ke elemts retunr karta hai
	//skip(): utna elements skip and baaki ka print karta hai
	//basically skip is ulta of limit
	
//	names.stream().skip(3).forEach(System.out::println);
	
	//Q: Given a list of salaries, sort in descending order and skip the top 2 values.
	List<Integer> sal = Arrays.asList(200, 20000, 789, 8900, 65000, 500, 33500);
//	sal.stream().sorted(Comparator.reverseOrder()).skip(2).forEach(System.out::println);
	
	//Q4: From a list of words, sort by descending length and display only the first 3 longest words
//	names.stream().sorted(Comparator.comparing(String :: length).reversed()).limit(3).forEach(System.out::println);
	
	//Q5: Given a list of Product objects, filter products with price > 500, and limit the result to only 2 products.
//	sal.stream().filter(i->i>500).sorted().limit(2).forEach(System.out::println);
	
	//3rd largest number
	list.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).skip(2).forEach(System.out::println);
	
	//in above Q: 1st sagle distinct values returned, then sorted in desc order, and out of 3 only 3rd value was printed using limit and skip respectfully
}
}
