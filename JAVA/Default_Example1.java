package defaultStatic;

	
	interface Sayable{ 
		  
		 default void say(){ 
		 System.out.println("Hello, this is default method"); 
		 } 
		 
		 void sayMore(String msg); 
		} 
	public class Default_Example1 implements Sayable{ 
		 public void sayMore(String msg){  
		 System.out.println(msg); 
		 } 
		 public static void main(String[] args) { 
			 Default_Example1 dm= new Default_Example1(); 
		 dm.say();  
		 dm.sayMore("Work is worship");  
		 
		 } 
		}

