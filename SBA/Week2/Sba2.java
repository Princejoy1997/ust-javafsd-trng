package sba2;

abstract class Employee{
	
	abstract void calculateSalary(double s);
	abstract void fetchDepartment(String d);
}

 class Engineer extends Employee{
	
public void calculateSalary(double s) {
		
		int bonus=3000;
		double total=s+bonus;
		System.out.println("Your Salary is: "+total);
	}
	
	public void fetchDepartment(String d) {
		
		System.out.println("Your Department is: "+d);
	}
	
}

  class Doctor extends Employee{
	

	
	public void calculateSalary(double s1) {
		
		int bonus=3000;
		double total=s1+bonus;
		System.out.println("Your Salary is: "+total);
	}

	
	public void fetchDepartment(String d) {
		
		System.out.println("Your Department is: "+d);
	}
	
}
public class Sba2 {

	public static void main(String[] args) {
		
		Engineer engg=new Engineer();
		engg.calculateSalary(28000);
		engg.fetchDepartment("Civil Engineering");
		
		Doctor doc=new Doctor();
		doc.calculateSalary(23000);
		doc.fetchDepartment("Computer Science");
		
	}
}
