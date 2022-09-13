package com.ust_set4;

public class ArithmeticException_Example {

	public static void main(String[] args) {
		
		try {
			
			int divideByZero=5/0;
			System.out.println("Rest of code in try block");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException =>"+e.getMessage());
		}
		
		finally {
			
			System.out.println("This is the finally block");
		}
	}
}
