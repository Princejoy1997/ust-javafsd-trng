package com.ust;

class Fruitt{}
class Vehiclee{}
public class InstanceOf_Example {
	public static void main(String args[]) {
		Fruitt apple=new Fruitt();
		Vehiclee car=new Vehiclee();
		
		System.out.println("car is a fruit:" +(apple instanceof Fruitt));
	}
}
