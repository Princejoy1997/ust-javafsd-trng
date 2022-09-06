package com.ust_set2;

abstract class Animal_3{
	abstract void makeSound();
	
	public void eat() {
		System.out.println("I can eat");
	}
}

class Dog_4 extends Animal_3{
	
	public void makeSound() {
		System.out.println("Bark bark");
	}
}
 class Abstract_Example1 {
	 public static void main(String args[]) {
		 Dog_4 d1=new Dog_4();
		 
		 d1.makeSound();
		 d1.eat();
	 }
}
