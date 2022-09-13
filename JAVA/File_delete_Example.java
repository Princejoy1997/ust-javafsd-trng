package com.ust_set4;

import java.io.File;

public class File_delete_Example {

	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\ustjavafsdb206\\file.txt");
		
		boolean value=file.delete();
		
		if(value) {
			System.out.println("The file is deleted.");
		}
		else {
			System.out.println("The file is not deleted."); 
		}
	}
}
