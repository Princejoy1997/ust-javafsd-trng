package methodReference;

public class MethodReference_Example3 {

	public void printnMsg(){ 
		 System.out.println("Hello, this is instance method"); 
		 } 
		 public static void main(String[] args) { 
		 Thread t2=new Thread(new MethodReference_Example3()::printnMsg); 
		 t2.start(); 
		 }
}
