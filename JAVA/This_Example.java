package com.ust_set1;

 class This_Example {
	 int val1;
	 int val2;
	 
	 This_Example(int val1,int val2){
		 this.val1 = val1 + val1;
		 this.val2 = val2 + val2;
	 }
	 
	 void display() {
		 System.out.println("Value val1= "+val1+" Value val2= "+val2);
	 }
}
 
 class Main{
	 public static void main(String args[]) {
		 This_Example object=new This_Example(5,10);
		 object.display();
	 }
 }
