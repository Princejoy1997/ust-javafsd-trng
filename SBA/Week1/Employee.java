package com.ust;

class Employee {
	int empID;
	String employeeName="Prince Joy";
	int age=30;
	double salary=22849.00;
	String Designation="Developer";
	
	void display() {
		System.out.println("Name: "+employeeName);
		System.out.println("Salary: "+salary);
	}
	
	void display(double a) {
		if(salary>25000) {
			System.out.println("Deduct 15% tax from your Salary");
		}
		else {
			System.out.println("No deduction of tax from salary");
		}
	}
	
	
}

class Engineer extends Employee{
	
	void display() {
		
		super.display();
	}
	
public static void main(String args[]) {
		
	Engineer e=new Engineer();
	e.display();
	Employee s=new Employee();
	e.display(s.salary);
	//s.display();	
	}
}
