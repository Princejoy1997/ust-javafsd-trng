package com.ust;

public class Constructors {
	int x;
	int y;
	Constructors(){
		System.out.println("Zero arg");
	}
	
	
	Constructors(int x){
		this.x=x;
		
		//this(x,5);
		System.out.println(x);
	}
	
	
	
	Constructors(int x, int y){
		this.x=x;
		this.y=y;
		System.out.println(x+" "+y);
		
	}
	
	Constructors check(Constructors c) {
		System.out.println("In check Method");
		return this;
	}
	
	
	void test() {
		check(this);
	}
	
	
	public static void main(String args[]) {
		Constructors c=new Constructors();
		Constructors c1=new Constructors(2);
		Constructors c2=new Constructors(2,3);
		c.test();
	}
}
