package com.ust_set4;

import java.io.FileReader;

public class File_Reader_Example {
	
	public static void main(String[] args) {
		
		char[] array=new char[100];
		
		try {
			
			FileReader input=new FileReader("C:\\Users\\ustjavafsdb206\\ABC.txt");
			
			input.read(array);
			System.out.println("Data in the file: ");
			System.out.println(array);
			
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
