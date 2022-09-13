package com.ust_set4;

import java.io.File;

public class String_File_Example {

	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\ustjavafsdb206\\ABC.txt");
		
		//boolean value=file.
		String[] fileList=file.list();
		
		for(String str:fileList) {
			System.out.println(str);
		}
	}
}
