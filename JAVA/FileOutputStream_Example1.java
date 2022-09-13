package com.ust_set4;

import java.io.FileOutputStream;

public class FileOutputStream_Example1 {

	public static void main(String[] args) {
		
		String data="This is a line of text inside the file.";
		
		try {
			
			FileOutputStream output=new FileOutputStream("C:\\Users\\ustjavafsdb206\\output.txt");
			
			byte[] array=data.getBytes();
			
			output.write(array);
			
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
