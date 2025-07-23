package com.techlabs.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
public static void main(String[] args) {
	
	//ex1
	//Supplier is a type of FI, supplier is its obj, double is the data type for output (return)
	Supplier<Double> supplier = () -> Math.random();
	System.out.println(supplier.get());
	
	
	Supplier<LocalDate> currentDate = () -> LocalDate.now();
	System.out.println(currentDate.get());
	
	
	Supplier<LocalTime> currentTime = () -> LocalTime.now();
	System.out.println(currentTime.get());
	
	//ex2
	Supplier<String> city = () -> "Pune";
	System.out.println(city.get());
	
	//ex3
	Supplier<List<String>> product = () -> Arrays.asList("pen", "laptop", "computer", "pencil", "erase");
	for (String res: product.get()) {
		System.out.println(res);
	}
}
}
