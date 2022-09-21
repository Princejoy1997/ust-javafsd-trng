package defaultStatic;


	interface TestInterface
	{
	
	public void square(int a);
	
	default void show()
	{
	System.out.println("Default Method Executed");
	}
	}
	 class Default_Example implements TestInterface
	{
	
	public void square(int a)
	{
	System.out.println(a*a);
	}
	public static void main(String args[])
	{
		Default_Example d = new Default_Example();
	d.square(4);
	
	d.show();
	}
	}
