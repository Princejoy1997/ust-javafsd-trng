class Eg2{

public static void main(String args[]){

	String a="12345";
	String b="0987654321";
	String c="09";

	long var1=new Long(a);
	long var2=Long.parseLong(b);
	long var3=Long.valueOf(a);

	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var3);

}

}