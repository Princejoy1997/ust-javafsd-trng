package com.ust;

public class ForEach_Loop_Example {
	public static void main(String args[]) {
		int[] numbers= {3,4,5,-5,0,12};
		int sum=0;
		
		for(int number:numbers) {
			sum+=number;
		}
		System.out.println("Sum="+sum);
	}
}
