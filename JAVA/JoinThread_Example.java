package com.ust_set5;

public class JoinThread_Example implements Runnable {

	public void run() {
		
		Thread t=Thread.currentThread();
		System.out.println("Current thread: "+t.getName());
		
		System.out.println("Is Alive? "+ t.isAlive());
	}
	
	public static void main(String[] args) throws Exception {
	
		Thread t=new Thread(new JoinThread_Example());
		t.start();
		t.join(1000);
		System.out.println("\nJoining after 1000 "+"milliseconds: \n");
		System.out.println("Current thread: "+t.getName());
		System.out.println("Is alive?"+t.isAlive());
	}
}
