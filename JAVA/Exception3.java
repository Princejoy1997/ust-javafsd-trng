package Exceptions;

public class Exception3 {
	
	public double calculator(int a,int b)throws Exception {
		
		//throw new Exception("abc");
		return(a+b);
	}
	
	void display(int x)throws Exception {
		if(x==5)throw new Exception();
		else
			System.out.println("n");
	}
	
	public static void main(String[] args) {
		
		Exception3 e=new Exception3();
		
		try {
			
			e.calculator(2, 5);
			e.display(5);
		} 
		catch (Exception e1) {
			
			e1.printStackTrace();
		}
	}
}
