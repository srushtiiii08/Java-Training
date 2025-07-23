package com.techlabs.test;

import java.util.Arrays;
import java.util.List;

public class CountDemo {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(32, 65, 34, 22, 10, 40, 88);
	
	//Q1 - count of students who passed
	long studentPass = list.stream().filter(i->i>32).count();
	System.out.println("count of passed students: " +studentPass);
	
	//Q2 - Count of even & odd numbers
	System.out.println("Count of Even numbers: " + list.stream().filter(i->i%2 == 0).count());
	System.out.println("Count of Odd numbers: " + list.stream().filter(i->i%2 == 1).count());
	
	
}
}
