package com.techlabs.Example;

import java.util.TreeMap;

public class TreeMapExample {
public static void main(String[] args) {
	
	TreeMap<Integer, String> map = new TreeMap<>();
	
	map.put(2, "om ");
	map.put(1, "ara");
	map.put(3, "sru");
	map.put(7, "rusha");
	map.put(11, "vaish");
	
	System.out.println(map);
	
//	System.out.println(map.get(2));
//	System.out.println(map.remove(2));
//	System.out.println(map);
	
	System.out.println(map.containsKey(3));
	System.out.println(map.containsValue("rusha"));
	System.out.println(map.firstKey());
	System.out.println(map.lastKey());
	
	System.out.println(map.higherKey(7));
	System.out.println(map.lowerKey(7));
	
	System.out.println(map.ceilingKey(2));
	System.out.println(map.floorKey(7));
	
	System.out.println(map.size());
	System.out.println(map.isEmpty());
	
	System.out.println(map.keySet());
	System.out.println(map.values());
	
	System.out.println(map.entrySet());
	System.out.println(map.descendingMap());
	System.out.println(map.subMap(2, 7));
	
	System.out.println(map.headMap(3));
	System.out.println(map.tailMap(3));
	
}
}
