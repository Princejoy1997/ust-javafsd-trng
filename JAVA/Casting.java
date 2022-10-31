package com.ust;

/**
 * The type Casting.
 */
public class Casting {
	/**
	 * Main.
	 *
	 * @param args the args
	 */
	public static void main(String args[]) {
		int x=5;
		float f=5.5f;
		long l=10;
		double d=7.5;
		
		
		l=x; //upcasting-implicitly done
		x=(int)l; //downcasting
		f=(float)d;
		d=f;
		
	}
}
