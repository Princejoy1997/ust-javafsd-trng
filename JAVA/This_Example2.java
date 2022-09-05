package com.ust_set1;

 class This_Example2 {
	 void print() {
		 this.show();
		 
		 System.out.println("This_Example2::print");
	 }
	 
	 void show() {
		 System.out.println("This_Example2::show");
	 }
}
 
 class Main2{
	 public static void main(String args[]) {
		 This_Example2 t1=new This_Example2();
		 t1.print();
	 }
 }
