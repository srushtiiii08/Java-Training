package com.techlabs.Example;

import java.util.Hashtable;

public class HashTableExample {
public static void main(String[] args) {
	
	Hashtable<Integer, String> map = new Hashtable<>();
	
	map.put(0, "Anaya");
	map.put(1, "shanaya");
	map.put(2, "Manaya");
	map.put(4, "tanaya");
	map.putIfAbsent(5, "rinaya");
	map.put(2, "shira");
	
	System.out.println(map);
	
	System.out.println(map.get(0));
	System.out.println(map.clone());
	System.out.println(map.remove(2));	
	System.out.println(map.remove(2, "manaya"));
	System.out.println(map);
	
	System.out.println(map.contains(2));
	System.out.println(map.containsKey(4));
	System.out.println(map.containsValue("tanaya"));
	
	System.out.println(map.size());
	System.out.println(map.isEmpty());
	
	System.out.println(map.keys());
	System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map.entrySet());
	System.out.println(map.equals(map));
	System.out.println(map.hashCode());
}
}
