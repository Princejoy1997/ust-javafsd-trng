package com.ust_set4;

import java.io.File;

public class File_Exception_Example {

	
	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\ustjavafsdb206\\newFile.txt");
		
		try {
			
			boolean value=file.createNewFile();
			if(value) {
				System.out.println("The new file is created.");
			}
			else {
				System.out.println("The file already exist.");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
