package com.ust_set3;

import java.util.ArrayList;

class ListString_Example {
	public static void main(String args[]) {
		ArrayList<String> languages=new ArrayList<>();
		
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("C++");
		System.out.println("Modified ArrayList: "+languages);
		
		languages.set(2, "JavaScript");
		System.out.println("Modifeid ArrayList: "+languages);
	}
}
