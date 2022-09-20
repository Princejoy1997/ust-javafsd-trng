package functional_Interface;

public class Functional_Example1 {

	public static void main(String args[])
	{
	
	new Thread(() -> {
	System.out.println("New thread created");
	}).start();
	}

}
