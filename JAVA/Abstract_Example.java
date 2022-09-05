package com.ust_set2;

abstract class Abstract_Example {
	public void display() {
		System.out.println("This is Java Programming");
	}
}

class Main extends Abstract_Example{
	public static void main(String args[]) {
		Main obj=new Main();
		obj.display();
	}
}
