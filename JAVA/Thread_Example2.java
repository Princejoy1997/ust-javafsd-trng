package thread;

public class Thread_Example2 extends Thread {

	public static void main(String[] args) {
		
		Thread_Example2 t3=new Thread_Example2();
		try {
		System.out.println("Hey");	
		t3.sleep(5000);
		System.out.println("Slept");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
