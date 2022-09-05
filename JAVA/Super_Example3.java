package com.ust_set1;

 class Super_Example3 {
	protected String type="animal";
}
 
 class Dog1 extends Super_Example3{
	 public String type="mammal";
	 
	 public void printType() {
		 System.out.println("I am a "+type);
		 System.out.println("I am a "+super.type);
	 }
 }
 
 class Main8{
	 public static void main(String args[]) {
		 Dog1 dog1=new Dog1();
		 dog1.printType();
	 }
 }
