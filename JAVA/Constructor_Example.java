package com.ust_set2;

 class Constructor_Example {
	 int a;
	 int b;
	 
	 Constructor_Example(){
		 
		 this(10,20);
		 System.out.println("Inside default constructor \n");
	 }
	 
	 Constructor_Example(int a, int b){
		 this.a=a;
		 this.b=b;
		 System.out.println("Inside parameterized constructor");
	 }
	 
	 public static void main(String args[]) {
		 
		 Constructor_Example object=new Constructor_Example();
	 }
}
