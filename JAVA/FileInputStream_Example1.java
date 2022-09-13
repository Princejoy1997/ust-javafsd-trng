package com.ust_set4;

import java.io.FileInputStream;

public class FileInputStream_Example1 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream input=new FileInputStream("C:\\Users\\ustjavafsdb206\\input.txt");
			
			System.out.println("Data in the file: ");
			
			int i=input.read();
			
			while(i != -1) {
				System.out.println((char)i);
				
				i=input.read();
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
