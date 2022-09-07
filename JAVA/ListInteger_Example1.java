package com.ust_set3;


import java.util.List;
import java.util.ArrayList;

class ListInteger_Example1 {
	public static void main(String args[]) {
		List<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("List: "+numbers);
		
		int number=numbers.get(2);
		System.out.println("Accessed Element: "+number);
		
		int removedNumber=numbers.remove(1);
		System.out.println("Removed Element: "+removedNumber);
	}
}
