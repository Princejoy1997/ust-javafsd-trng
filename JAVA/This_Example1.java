package com.ust_set1;

 class This_Example1 {
	 int val1;
	  int val2;
	  
	  This_Example1(){
		  val1=10;
		  val2=20;
		  
	  }
	  
	  void printVal(This_Example1 this_Example1) {
		  System.out.println("val1= "+this_Example1.val1+" val2= "+this_Example1.val2);
	  }
	  
	  void get() {
		  printVal(this);
	  }
}
 
 class Main1{
	 public static void main(String args[]) {
		 This_Example1 object=new This_Example1();
		 object.get();
	 }
 }

 