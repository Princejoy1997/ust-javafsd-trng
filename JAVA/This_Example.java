package com.ust_set2;

 class This_Example {
	 int a;
	 int b;
	 
	 This_Example(){
		 a=10;
		 b=20;
	 }
	 
	 This_Example get() {
		 return this;
	 }
	 
	 void display() {
		 System.out.println("a="+a+" b="+b);
	 }
	 
	 public static void main(String args[]) {
		 
		 This_Example object= new This_Example();
		 object.get().display();
	 }
}
