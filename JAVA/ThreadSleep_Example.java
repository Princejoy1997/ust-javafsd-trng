 package com.ust_set5;

public class ThreadSleep_Example extends Thread {
	
	public static void main(String[] args) {
		
		String name="AMAL";
		ThreadSleep_Example r=new ThreadSleep_Example(name);
		r.run();
	
	}
	public ThreadSleep_Example(String name) {
		super(name);
	}
	

	public void run() {
		
		System.out.println("MyThread - START "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
			
			doDBProcessing();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MyThread - END "+Thread.currentThread().getName());
	}
	
	private void doDBProcessing() throws InterruptedException{
		Thread.sleep(5000);
	}

}
