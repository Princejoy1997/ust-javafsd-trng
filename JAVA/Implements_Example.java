package com.ust_set2;

interface Polygon{
	void getArea(int length,int breadth);
}

 class Implements_Example implements Polygon {
	 
	 public void getArea(int length,int breadth) {
		 System.out.println("The area of the rectangle is "+(length*breadth));
	 }
}
 
 class Main_2{
	 public static void main(String args[]) {
		 Implements_Example r1=new Implements_Example();
		 r1.getArea(5, 6);
	 }
 }
