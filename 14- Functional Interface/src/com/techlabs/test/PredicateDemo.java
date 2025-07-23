
package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.techlabs.model.Student;

public class PredicateDemo {
public static void main(String[] args) {
	
	Predicate<Integer> even = num -> num%2 ==0;
	System.out.println(even.test(12));
	
	
	//ex2
	Predicate<String> isNull = s -> !s.isEmpty();   //not isEmpty
	System.out.println(isNull.test(""));  //empty string
	
	//ex1
	Predicate<Integer> isOdd = num -> num%2 !=0;
	for (int i=1; i<=10; i++) {
		if (isOdd.test(i))
			System.out.println(i);
	}
	
	//ex3
//	Predicate<List<String>> passed = list -> list.forEach(System.out::println);
//	passed.test(Arrays.asList(("sru", 42), new Student("ramu", 23), new Student("shamu", 67), new Student("dholu", 89), new Student("bholu", 55)));
	
	Predicate<Student> pass = s -> s.marks>=40;
	Student[] list = {new Student("sru", 42), new Student("ramu", 23), new Student("shamu", 17), new Student("dholu", 89), new Student("bholu", 55)};
	for (Student s: list) {
		if(pass.test(s))
			System.out.println(s.name+ " passed");
	}
}
}
