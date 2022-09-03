package com.ust;

class Car{
	String model;
	String color;
	int wheels;
	float price;
		
	void display() {
		
		System.out.println("IN CAR CLASS");
	}
	
	
}

class Ciaz extends Car{
	
	void display() {
		
		System.out.print("IN CIAZ CLASS");
	}
	
	void show() {
		
		System.out.println("IN SHOW METHOD");
	}
}

public class Ertiga extends Car{
	
	void display() {
		
		System.out.print("IN ERTIGA CLASS");
		super.display();
	}
	
	public static void main(String args[]) {
		Ciaz c=new Ciaz();
		
		c.display();
		c.show();
		
		Ertiga e=new Ertiga();
		e.display();System.out.println(e.color);
		
	}
}
