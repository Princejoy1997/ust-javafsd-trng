package com.ust_set1;

 class Final_Example3 {
	 public final void display() {
		 System.out.println("This is a final method.");
	 }
 }
 
 class Main extends Final_Example3{
	 
	 public final void display() {
		 System.out.println("The final method is overridden.");
	 }
	 
	 public static void main(String args[]) {
		 Main obj=new Main();
		 obj.display();
	 }
}
