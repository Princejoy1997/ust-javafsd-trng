package com.ust_set4;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter_Example {

	public static void main(String[] args) {
		
		String data="This is the data in the output file";
		
		try {
			
			FileWriter file=new FileWriter("C:\\Users\\ustjavafsdb206\\output.txt");
			
			BufferedWriter output=new BufferedWriter(file);
			
			output.write(data);
			
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
