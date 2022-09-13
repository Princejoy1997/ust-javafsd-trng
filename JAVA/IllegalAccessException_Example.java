package com.ust_set4;

public class IllegalAccessException_Example {

	static void fun() throws IllegalAccessException{
		
		System.out.println("Inside fun().");
		throw new IllegalAccessException("demo");
	}
	
	public static void main(String[] args) {
		
		try {
			fun();
		}
		catch(IllegalAccessException e) {
			System.out.println("Caught in main.");
		}
	}
}
