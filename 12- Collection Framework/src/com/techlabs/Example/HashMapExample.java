package com.techlabs.Example;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(null, "Anaya");
		map.put(1, "shanaya");
		map.put(2, "Manaya");
		map.put(4, "tanaya");
		map.putIfAbsent(5, "rinaya");
		map.put(2, "shira");
//		map.put(null, "rinki");
		
		System.out.println(map);
		
		System.out.println(map.get(4));
		
//		System.out.println(map.remove(null));
//		System.out.println(map);
		
//		System.out.println(map.remove(2, "shira"));
//		System.out.println(map);
		
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("shanaya"));
		
		System.out.println(map.size());
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.replace(2, "shira", "sheila"));
		System.out.println(map);
		
		System.out.println(map.replace(6, "disha"));		//prints null, since key is not present
		System.out.println(map);
		
	}
}
