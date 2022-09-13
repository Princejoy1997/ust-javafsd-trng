package com.ust_set4;

 class ArrayIndexOut_Example {
	 public static void main(String[] args) {
		
	try {
		
		int array[]=new int[10];
		array[10]=30/0;
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	catch(ArrayIndexOutOfBoundsException a) {
		System.out.println(a.getMessage());
	}
}
}