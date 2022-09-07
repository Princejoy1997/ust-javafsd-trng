package com.ust_set3;

import java.util.HashSet;

class HashSet_Example {
	public static void main(String args[]) {
		HashSet<Integer> evenNumbers=new HashSet<>();
		
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		System.out.println("HashSet: "+evenNumbers);
		
		HashSet<Integer> numbers=new HashSet<>();
		
		numbers.addAll(evenNumbers);
		numbers.add(5);
		System.out.println("New HashSet: "+numbers);
	}
}
