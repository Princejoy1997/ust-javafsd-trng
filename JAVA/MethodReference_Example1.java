package methodReference;

public class MethodReference_Example1 {

	public static void ThreadStatus(){ 
		 System.out.println("Thread is running..."); 
		 } 
		 public static void main(String[] args) { 
		 Thread t2=new Thread(MethodReference_Example1::ThreadStatus); 
		 t2.start(); 
		 
		 }
}
