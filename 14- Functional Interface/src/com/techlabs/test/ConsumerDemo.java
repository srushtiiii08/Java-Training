package com.techlabs.test;

import java.util.function.Consumer;

import com.techlabs.model.Invoice;

import java.util.List;
import java.util.Arrays;

public class ConsumerDemo {
public static void main(String[] args) {
	
	//con is the obj of Consumer, String is the data type for the parameter, msg is the parameter passed,  toUpperCase fxn is used to convert
	//accept is a fxn that performs operation on argument in Consumer
	Consumer<String> con = msg -> System.out.println(msg.toUpperCase());   //ex1
	con.accept("abcdefg");
	
	//list is the obj created for List						//ex2
	Consumer<List<String>> conList = list -> list.forEach(System.out::println);
	conList.accept(Arrays.asList("sru", "sakshi", "sunny"));
	
	//length of string
	Consumer<String> consumer = msg -> System.out.println(msg.length());
	consumer.accept("Srushti");
	
	//ex3
	Consumer<Invoice> bill = inv -> System.out.println("Item: " +inv.itemName+ "| Quantity: "+inv.quantity+ "| Price: " +inv.price);
	bill.accept(new Invoice("Pen", 2, 10));
	bill.accept(new Invoice("Pencil", 1, 5));
	bill.accept(new Invoice("eraser", 1, 7));
}
}
 