package com.ust_set3;

class GenericClasss <T extends String>{
	public void display() {
		System.out.println("This is a bounded type generic class.");
	}
}
class GenericExtends_Example {
	public static void main(String[] args) {
		GenericClasss<String> obj=new GenericClasss<String>();
		obj.display();
	
	}
}
