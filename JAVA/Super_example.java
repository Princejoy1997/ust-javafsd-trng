package com.ust;

public class Super_example extends Super_most {
	String color="White";
	
	Super_example(){
		super();
		System.out.println("In Sub Constructor");
		
	}
	void display() {
		System.out.println(color);
		System.out.println(super.color);
		super.display();
	}
	public static void main(String args[]) {
		Super_example s=new Super_example();
		//Super_most m=new Super_most();
		s.display();
	}
	
}



class Super_most{
	String color="Black";
	void display() {
		System.out.println("In Super");
	}
	Super_most(){
		System.out.println("In super constructor");
	}
	
}
