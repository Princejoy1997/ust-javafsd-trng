package functional_Interface;



	@FunctionalInterface 
	interface sayable{ 
	 void say(String msg); 
	  
	 int hashCode(); 
	 String toString(); 
	 boolean equals(Object obj); 
	} 
	public class Functional_Example { 
	 public void say(String msg){ 
	 System.out.println(msg); 
	 } 
	 public static void main(String[] args) { 
		 Functional_Example fie = new Functional_Example(); 
	 fie.say("Hello there"); 
	 } 
	}
