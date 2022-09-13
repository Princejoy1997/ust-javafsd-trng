package com.ust_set4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderException_Example {

	public static void main(String[] args) {
		
		String line;
		
		try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ustjavafsdb206\\test.txt"))){
			
			while((line=br.readLine()) != null) {
				System.out.println("Line =>"+line);
			}
		}
		catch(IOException e) {
			System.out.println("IOException in try block =>"+e.getMessage());
		}
	}
}
