package methodReference;

	interface Sayable{ 
		 void say(); 
		} 
	public class MethodReference_Example2 { 
		 public static void saySomething(){ 
		 System.out.println("Hello, this is static method."); 
		 } 
		 public static void main(String[] args) { 
		  
		 Sayable sayable = MethodReference_Example2::saySomething; 
		
		 sayable.say(); 
		 } 
		}
