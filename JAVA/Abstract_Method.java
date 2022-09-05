package com.ust_set2;

abstract class Abstract_Method {
	abstract void makeSound();
	
	public void eat() {
		System.out.println("I can eat.");
	}
}

class Dog extends Abstract_Method{
	public void makeSound() {
		System.out.println("Bark bark");
	}
}

class Mainn{
	public static void main(String args[]) {
		Dog d1=new Dog();
		d1.eat();
	}
}
