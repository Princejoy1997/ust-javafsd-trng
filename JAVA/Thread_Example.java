package thread;

public class Thread_Example extends Thread {

	public static void main(String[] args) {
		
		Thread_Example t=new Thread_Example();
		t.start();
	}
	
	public void run() {
		System.out.println("In Thread.");
	}
}
