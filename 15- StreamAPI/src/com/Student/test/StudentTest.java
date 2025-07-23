package com.Student.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.Student.model.Student;

public class StudentTest {
public static void main(String[] args) {
	
	List<Student> studentList = Arrays.asList(new Student(1, "Srushti", 9.7), new Student(2, "siddhi", 4.5), new Student(12, "Om", 9.3), new Student(34, "Aradhya", 7.9), new Student(74, "Ruchira", 9.7));
	
//	studentList.stream().sorted((s1,s2) -> Double.compare(s1.cgpa, s2.cgpa)).forEach(System.out::println);
//	studentList.stream().sorted(Comparator.comparingDouble(s -> s.cgpa)).forEach(System.out::println);   //using fxn
	
//	studentList.stream().sorted((s1,s2) -> s1.name.compareTo(s2.name)).forEach(System.out::println);
	
//	studentList.stream().sorted((s1,s2) -> Integer.compare(s1.roll, s2.roll)).forEach(System.out::println);
	
	studentList.stream().sorted(Comparator.comparingDouble((Student p) -> p.cgpa).thenComparingInt(p -> p.roll)).forEach(System.out::println);
	System.out.println();
	studentList.stream().sorted(Comparator.comparingDouble((Student p) -> p.cgpa).thenComparing(p -> p.name)).forEach(System.out::println);
	
	
	
}
}
