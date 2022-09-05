package com.ust;

public class Array_1 {
	public static void main(String args[]) {
		String str[]=new String[5];
		//str= {"java","c","c++","python","sql"};
		str[0]="java";
		str[1]="c";
		str[2]="c++";
		System.out.println(str[2]);
		int[] arr=new int[3];
		char c[]= {'a','e','i','o','u'};		
		//System.out.println(c[5]); array index out of bound
	
		int arr1[][]= {{1,2},{3,4}};
		System.out.println(arr1[1][1]);
	}
}
