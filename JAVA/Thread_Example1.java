package thread;

public class Thread_Example1 implements Runnable {

	public static void main(String[] args) {
		Runnable r=new Thread_Example1();
		r.run();
	}
	
	public void run() {
		System.out.println("In run method");
	}
}
