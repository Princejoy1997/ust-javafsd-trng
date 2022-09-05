package com.ust_set1;

class Static_Example {
	Static_B obj;
	
	Static_Example(Static_B obj){
		this.obj=obj;
		
		obj.display();
	}
}

class Static_B{
	int x=10;
	
	Static_B(){
		Static_Example obj=new Static_Example(this);
	}
	
	void display() {
		System.out.println("B::x= "+x);
	}
}

class Main5{
	public static void main(String args[]) {
		Static_B obj=new Static_B();
	}
}