package com.ust_set1;

 class Super_Default_constructor1 {
	 Super_Default_constructor1(){
		 System.out.println("I am an animal");
	 }
	 
	 Super_Default_constructor1(String type){
		 System.out.println("Type: "+type);
	 }
}
 
 class Dog3 extends Super_Default_constructor1{
	 Dog3(){
		 
		 super("Animal");
		 
		 System.out.println("I am a dog");
	 }
 }

 class Main_1{
	 public static void main(String args[]) {
		 Dog3 dog1=new Dog3();
	 }
 }