package com.ust_set1;

 class Exception_IllegalAcess {
	 static void fun() throws IllegalAccessException{
		 System.out.println("Inside fun().");
		 throw new IllegalAccessException("demo");
	 }
	 
	 public static void main(String args[]) {
		 
		 try {
			 
			 fun();
		 }
		 
		 catch(IllegalAccessException e) {
			 System.out.println("caught in main.");
		 }
	 }
}
