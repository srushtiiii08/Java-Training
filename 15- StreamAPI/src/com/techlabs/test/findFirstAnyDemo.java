package com.techlabs.test;

import java.util.Arrays;
import java.util.List;

public class findFirstAnyDemo {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(32, 65,7, 22, 7, 33, 7, 10, 22, 10, 40, 88);
	List<String> names = Arrays.asList("Avani","Ava ",  "Adi", "Aariya", "Srushti", "Om", "Aradhya");
	
//	System.out.println(names.stream().filter(s->s.startsWith("A")).findFirst());
	
//	System.out.println(names.stream().filter(s->s.startsWith("O")).findAny());
	
	System.out.println(list.stream().filter(i->i%2==0).findFirst());
}
}
