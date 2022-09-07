package com.ust_set3;

class GenericsType<T>{
	T obj;
	
	public T get() {
		return this.obj;
	}
	
	public void set(T obj) {
		this.obj=obj;
	}
}

public class GenericMethod_Example1 {
	
	public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
		
		return g1.get().equals(g2.get());
	}
	
	public static void main(String[] args) {
		GenericsType<String>g1=new GenericsType<>();
		
		g1.set("Pankaj");
		
		GenericsType<String>g2=new GenericsType<>();
		
		g2.set("Pankaj");
		
		boolean isEqual; //=GenericMethod_Example1.<String>isEqual(g1,g2);
		
		isEqual=GenericMethod_Example1.isEqual(g1,g2);
		System.out.println(isEqual);
	}
}
