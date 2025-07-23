package com.techlabs.Example;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> car = new LinkedList<>();
		
		car.add("BMW");
		car.add("Honda");
		car.add("Hyundai");
		car.add("jaguar");
		
		System.out.println(car);
		
		car.add(2, "Suzuki");
		System.out.println("After changes: " +car);
		
		
		//remove
		car.remove("Hyundai");
		car.remove(1);
		System.out.println("After removing: " +car);
		
//		Iterator<String> ite = car.iterator();   //alternative of for each loop
//		while(ite.hasNext()) {					//tho not recommended
//			System.out.println(ite.next());
//		}
		
		car.add("Lambo");
		car.add("tata");
		car.add("Toyota");
		System.out.println(car);
		car.add("Ford");
		
		car.removeFirstOccurrence(car);
		car.removeFirst();
		car.removeLast();
		System.out.println(car);
		
		car.retainAll(car);
		
		car.size();
		
		car.getFirst();
		car.getLast();
		
		car.clear();
		System.out.println(car);
	}
	
	
}
