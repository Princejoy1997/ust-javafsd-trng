package com.ust_set1;
import java.io.*;

 class Exception_UsingBuffer {
	 public static void main(String args[]) {
		 String line;
		 try(BufferedReader br=new BufferedReader(new FileReader("test.txt"))){
			 while((line=br.readLine())!=null) {
				 System.out.println("Line =>"+line);
			 }
		 }
		 
		 catch(IOException e) {
			 System.out.println("IOException in try block =>"+e.getMessage());
		 }
	 }
}
