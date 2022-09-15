package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Example {
	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\ustjavafsdb206\\ABC.txt");
		
		
		try {
			
			FileOutputStream fstm=new FileOutputStream(f);
			byte[] b="This i am writing to file".getBytes();
			if(f.createNewFile()) {
				System.out.println("New File Created");
				
			}
			
			else {
				System.out.println("File Exist.");
				fstm.write(b);
			}
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
