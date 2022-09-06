package com.ust_set2;

class Animal{
	public void eat() {
		System.out.println("I can eat");
	}
}

class Dog_1 extends Animal{
	public void eat() {
		super.eat();
		System.out.println("I eat dog food");
	}
	
	public void bark() {
		System.out.println("I can bark");
	}
}
 class Super_Example {
	 public static void main(String args[]) {
		 Dog_1 labrador=new Dog_1();
		 
		 labrador.eat();
		 labrador.bark();
	 }
}
