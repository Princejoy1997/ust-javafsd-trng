package com.ust_set5;

enum Size2{
	
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	
	
	public String getSize() {
		
		switch(this) {
		
		case SMALL:
			return "small";
			
		case LARGE:
			return "large";
			
		case EXTRALARGE:
			return "extra large";
			
			default:
				return null;
		}
	}
}
public class EnumSwitch_Example1 {

	public static void main(String[] args) {
		
		System.out.println("The size of the pizza is "+Size2.SMALL.getSize());
	}
}
