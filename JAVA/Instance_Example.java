package com.ust;

class Fruit{}
class Vehicle{}
public class Instance_Example {
	public static void main(String args[]) {
		Fruit pineapple = new Fruit();
		Vehicle truck=new Vehicle();
		
		System.out.println("pineapple is a fruit:"+(pineapple instanceof Fruit));
		System.out.println("truck is a vehicle:"+(truck instanceof Vehicle));
	}
}
