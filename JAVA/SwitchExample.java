package com.ust;

public class SwitchExample {
	public static void main(String args[]) {
		String str="Green1";
		
		switch(str) {
		case "Red":
			System.out.println("I am in RED");
			System.out.println("*");
		default:
			System.out.println("Default");
			break;
		case "Green":
			System.out.println("I am in GREEN");
			System.out.println("*");
			break;
		case "Yellow":
			System.out.println("I am in YELLOW");
			System.out.println("*");
			break;
			
		}
	}
}
