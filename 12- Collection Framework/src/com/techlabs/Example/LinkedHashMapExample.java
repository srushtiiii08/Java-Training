package com.techlabs.Example;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
public static void main(String[] args) {
	
	LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
	
	map.put(null, "om ");
	map.put(1, "ara");
	map.put(3, "sru");
	map.put(7, "rusha");
	map.put(11, "vaish");
	
	System.out.println(map);
}
}
