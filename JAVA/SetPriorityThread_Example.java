package com.ust_set5;

public class SetPriorityThread_Example implements Runnable {

	public void run() {
		
	}
	
	public static void main(String[] args) {
		
		Thread thread1=new Thread();
		//Thread thread2=new Thread();
		
		//thread2.start();
		
		try {
			
			thread1.sleep(1000);
			//thread2.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		thread1.setPriority(1);
		//thread2.setPriority(2);
		int priority=thread1.getPriority();
		//int priority1=thread2.getPriority();
		System.out.println(priority);
		
		thread1.start();
		//System.out.println(priority1);
		System.out.println("Thread Running");
	}
}
