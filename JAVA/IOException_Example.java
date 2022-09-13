package com.ust_set4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOException_Example {
	
	public static void findFile() throws IOException{
		
		File newFile=new File("C:\\Users\\ustjavafsdb206\\text.txt");
		FileInputStream stream=new FileInputStream(newFile);
	}

	public static void main(String[] args) {
		
		try {
			findFile();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
