package com.ust;

public class String_example {
	public static void main(String args[]) {
		String str="        Ashiq       ";
		String str1=new String("Manju");
		//str=str+str1;
		System.out.println(str+str1);
		System.out.println(str.toUpperCase());
		if(str.trim().equals("Ashiq")) {
			System.out.println("Equals");
		}
		
		
		System.out.println(str1.startsWith("M"));
		System.out.println(str1.substring(3));
		
	}
}
