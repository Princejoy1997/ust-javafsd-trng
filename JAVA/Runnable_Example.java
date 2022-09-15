package com.ust_set5;

import thread.Thread_Example1;

public class Runnable_Example implements Runnable {
	
	public static void main(String[] args) {
		Runnable r=new Runnable_Example();
		r.run();
	}

	public void run() {
		System.out.println("Doing heavy processing - START "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
			
			doDBProcessing();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Doing heavy processing - END "+Thread.currentThread().getName());
	}
	
	private void doDBProcessing()throws InterruptedException{
		Thread.sleep(5000);
	}
}
