package com.ust_set5;

public class RunnableThreads_Example implements Runnable {

	public static void main(String[] args) {
		
		Thread Thread1=new Thread("Guru1");
		Thread Thread2=new Thread("Guru2");
		Thread1.start();
		Thread2.start();
		
		System.out.println("Thread names are following: ");
		System.out.println(Thread1.getName());
		System.out.println(Thread2.getName());
	}
	
	public void run() {
		
	}
}
