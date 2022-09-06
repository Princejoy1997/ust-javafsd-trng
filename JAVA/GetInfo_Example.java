package com.ust_set2;

class Animal_1{
	protected String name;
	
	protected void display() {
		System.out.println("I am an animal.");
	}
}

class Dog_2 extends Animal_1{
	public void getInfo() {
		System.out.println("My name is "+name);
	}
}
public class GetInfo_Example {
	
	public static void main(String args[]) {
		
		Dog_2 labrador=new Dog_2();
		
		labrador.name="Rocky";
		labrador.display();
		
		labrador.getInfo();
	}
}
