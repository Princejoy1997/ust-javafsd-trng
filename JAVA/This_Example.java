package com.ust;

public class This_Example {
	static int x=1;
	private int y=3;
	public void method1(int x) {
		This_Example t=new This_Example();
		this.x=2;
		y=4;
		
		System.out.print("Test.x:" +This_Example.x);
		System.out.println("t.x:"+t.x);
		System.out.println("t.y:"+t.y);
		System.out.println("y:"+y);
		
	}
	
	public static void main(String args[]) {
		This_Example t=new This_Example();
		t.method1(5);
	}
}
