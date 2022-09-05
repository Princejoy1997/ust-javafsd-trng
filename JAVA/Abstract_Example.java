package com.ust;

abstract class Abstract1{
	int age;
	 String name; String address;
	 void display() {
		 System.out.println(age+""+address+""+name);
	 }
	 
	 int show() {
		 return 0;
	 }
	 
	 abstract float calculate();
	 abstract void check();
}

public class Abstract_Example extends Abstract1 {
	 float calculate() {
		 return 0f;
	 }
	 
	 void check() {
		 
	 }
}
