package com.ust;
import java.util.Scanner;

class Scanner_Example {
	public static void main(String args[]) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter float: ");
		float myFloat=input.nextFloat();
		System.out.println("Float entered ="+myFloat);
		
		System.out.println("Enter double:");
		double myDouble=input.nextDouble();
		System.out.println("Double entered ="+myDouble);
		
		System.out.println("Enter text:");
		String myString=input.next();
		System.out.println("Text entered ="+myString);
	}
}
