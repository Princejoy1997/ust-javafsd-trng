package com.ust_set5;

public class YieldThread_Example implements Runnable {

	Thread t;
	YieldThread_Example(String str){
		t=new Thread(this,str);
		t.start();
	}
	
	public void run() {
		
		for(int i=0;i<=5;i++) {
			
			if((i % 5)==0) {
				
				System.out.println(Thread.currentThread().getName() +"Yielding control...");
				Thread.yield();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+"has finished executing.");
	}
	
	public static void main(String[] args) {
		
		new YieldThread_Example("Thread 1");
		new YieldThread_Example("Thread 2");
		new YieldThread_Example("Thread 3");
	}
}
