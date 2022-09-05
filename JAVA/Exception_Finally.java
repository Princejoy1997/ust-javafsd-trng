package com.ust_set1;

 class Exception_Finally {
	 public static void main(String args[]) {
		 
		 try {
			 int divideByZero=5/0;
		 }
		 
		 catch(ArithmeticException e) {
			 System.out.println("ArithmeticException =>"+e.getMessage());
		 }
		 
		 finally {
			 System.out.println("This is the finally block");
		 }
	 }
}
