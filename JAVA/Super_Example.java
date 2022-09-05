package com.ust_set1;

 class Super_Example {
	 public void display() {
		 System.out.println("I am an animal");
	 }
}
 
 class Dog extends Super_Example{
	 public void display() {
		 System.out.println("I am a dog");
	 }
	 
	 public void printMessage() {
		 display();
	 }
 }
 
 class Main6{
	 public static void main(String args[]) {
		 Dog dog1=new Dog();
		 dog1.printMessage();
	 }
 }
