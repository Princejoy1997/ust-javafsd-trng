package com.ust_set1;

 class Super_Example2 {
	 public void display() {
		 System.out.println("I am an animal");
	 }
}
 
 class Dogg extends Super_Example2{
	 public void display() {
		 System.out.println("I am a dog");
	 }
	 
	 public void printMessage() {
		 super.display();
		 
		 display();
	 }
 }
 
 class Main7{
	 public static void main(String args[]) {
		 Dogg dog1=new Dogg();
		 dog1.printMessage();
	 }
 }
