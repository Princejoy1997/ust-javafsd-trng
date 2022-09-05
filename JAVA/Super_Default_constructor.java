package com.ust_set1;

 class Super_Default_constructor {
	 Super_Default_constructor(){
		 System.out.println("I am an animal");
	 }
}
 
 class Dog2 extends Super_Default_constructor{
	 Dog2(){
		 
		 super();
		 
		 System.out.println("I am a dog");
	 }
 }

 class Main9{
	 public static void main(String args[]) {
		 Dog2 dog1=new Dog2();
	 }
 }