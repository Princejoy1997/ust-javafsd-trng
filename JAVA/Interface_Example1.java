package com.ust_set2;

interface A{
	void funcA();
}

interface B extends A{
	void funcB();
}
class C implements B{
	public void funcA() {
		System.out.println("This is funcA");
	}
	
	public void funcB() {
		System.out.println("This is funcB");
	}
}

 class Interface_Example1 {
	 public static void main(String args[]) {
		 C obj=new C();
		 obj.funcA();
		 obj.funcB();
	 }
}
