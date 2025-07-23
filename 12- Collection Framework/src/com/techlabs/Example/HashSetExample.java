package com.techlabs.Example;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Guava");
		set.add("Dragon fruit");
		set.add("mulberry");
		System.out.println("Hashset of fruits: " +set);
		System.out.println("Contains apple: " +set.contains("apple"));
		System.out.println("Is the set empty: " +set.isEmpty());
		System.out.println("Size of hashset: " +set.size());
		
		for (String item: set) {
			System.out.println(item);
		}
		
		
		
	}
}
