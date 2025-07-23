package com.techlabs.test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysStream {
public static void main(String[] args) {
	
	Integer[] marks = {21, 22, 43,23};
	Arrays.stream(marks).filter(i -> i>40).collect(Collectors.toList()).forEach(System.out::println);
	
	Stream input = Stream.of(1, 2, 3, 4, "Ami", "heheheh", 33.3);
	
}
}
