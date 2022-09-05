package com.ust_set2;

abstract class Abstract_Method1 {
	abstract void brake();
}

class SportsBike extends Abstract_Method1{
	public void brake() {
		System.out.println("SportsBike Brake");
	}
}

class MountainBike extends Abstract_Method1{
	
	public void brake() {
		System.out.println("MountainBike Brake");
	}
}

class Main_1{
	public static void main(String args[]) {
		MountainBike m1=new MountainBike();
		m1.brake();
		SportsBike s1=new SportsBike();
		s1.brake();
	}
}
