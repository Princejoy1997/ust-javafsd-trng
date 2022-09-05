package com.ust_set2;

interface Language{
	void getName(String name);
}
class Interface_Example implements Language {
	public void getName(String name) {
		System.out.println("Programming Language: " +name);
	}
}

class Main_3{
	public static void main(String args[]) {
		Interface_Example language=new Interface_Example();
		language.getName("Java");
	}
}
