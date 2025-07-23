package com.techlabs.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
public static void main(String[] args) {
	
	List<Employee> empList = Arrays.asList(new Employee("Srushti", 'F', 33500, LocalDate.of(2017, 9, 9)), 
			new Employee("Nidhi", 'F', 45000, LocalDate.of(2024, 10, 1)), 
			new Employee("Ruchira", 'F', 50000, LocalDate.of(2025, 7, 18)), 
			new Employee("Sanath", 'M', 45000, LocalDate.of(2020, 01, 20)), 
			new Employee("sujay", 'M', 10000, LocalDate.of(2014, 8, 30)) );
	
	
	//1. Max salary
//	System.out.println("Employee with max salary:");
//	empList.stream().sorted(Comparator.comparingInt((Employee e) -> e.salary).reversed()).limit(1).forEach(System.out::println);		
//	System.out.println("Employee with max salary: " +empList.stream().max(Comparator.comparingInt(s->s.salary)));
	
	
	//2: 2nd highest salary
//	System.out.println("\nEmployee with 2nd max salary:");
	empList.stream().distinct().sorted(Comparator.comparingInt((Employee e) -> e.salary).reversed()).limit(2).skip(1).forEach(System.out::println);
	
	
	//3:  Find the employee who is most senior based on joining date
	System.out.println("Most senior employee: ");
	empList.stream().sorted(Comparator.comparing((Employee e)-> e.joiningDate)).limit(1).forEach(System.out::println);
	
	
	//4.  count the employee based on gender.
//	System.out.println("Female employee count: " +empList.stream().filter(e->e.gender == 'F').count());
//	System.out.println("Male employee count: " +empList.stream().filter(e->e.gender == 'M').count());
//	System.out.println("Total employee count: " +empList.stream().count());
	
	//OR
	
	Map<Object, Long> genderCount = empList.stream().collect(Collectors.groupingBy(e -> e.gender, Collectors.counting()));
	
	System.out.println("Employee count based on gender: ");
	genderCount.forEach((gender, count) -> System.out.println(gender + ": " + count));
}
}
