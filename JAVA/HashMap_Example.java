package com.ust_set3;

import java.util.HashMap;
import java.util.Map;

class HashMap_Example {
	public static void main(String args[]) {
		
		Map<String,Integer> numbers=new HashMap<>();
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		System.out.println("Map: "+numbers);
		
		System.out.println("Keys: "+numbers.keySet());
		
		System.out.println("Values: "+numbers.values());
		
		System.out.println("Entries: "+numbers.entrySet());
		
		int value=numbers.remove("Two");
		System.out.println("Removed Value: "+value);
	}
}
