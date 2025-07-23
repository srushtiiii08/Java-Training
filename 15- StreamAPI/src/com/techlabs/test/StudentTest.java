package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.techlabs.model.Student;

public class StudentTest {
public static void main(String[] args) {
	
	List<Student> marks = Arrays.asList(new Student("Srushti", 64), new Student("aradhya", 59), new Student("Om", 79));
	
	marks.stream().filter(m -> m.marks>60).collect(Collectors.toList()).forEach(System.out::println);
}
}
