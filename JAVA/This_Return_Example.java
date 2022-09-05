package com.ust_set1;

 class This_Return_Example {
	 int val_a;
	 int val_b;
	 
	 This_Return_Example(){
		 val_a = 10;
		 val_b=20;
	 }
	 
	 This_Return_Example get() {
		 return this;
	 }
	 
	 void display() {
		 System.out.println("val_a= "+val_a+" val_b= "+val_b);
	 }
}
 
 class Main3{
	 public static void main(String args[]) {
		 This_Return_Example object=new This_Return_Example();
		 object.get().display();
	 }
 }
