package defaultStatic;

	interface Sayable1{ 
		  
		 default void say(){ 
		 System.out.println("Hello,this is default method"); 
		 } 
		  
		 void sayMore(String  msg); 
		  
		 static void sayLouder(String msg){ 
		 System.out.println(msg); 
		 } 
		} 
	public class Default_Example2 implements Sayable1{ 
		 public void sayMore(String msg){ 
		 System.out.println(msg); 
		 } 
		 public static void main(String[] args) { 
			 Default_Example2 dm= new Default_Example2(); 
		 dm.say();  
		 dm.sayMore("Work is worship");  
		 Sayable1.sayLouder("Helloooo...");  
		 }
	}
