package com.ust_set1;
import java.io.*;

 class Exception_File {
	 public static void findfile() throws IOException{
		 File newFile=new File("test.txt");
		 FileInputStream stream=new FileInputStream(newFile);
	 }
	 
	 public static void main(String args[]) {
		 try {
			 findfile();
		 }
		 catch(IOException e) {
			 System.out.println(e);
		 }
	 }
}
