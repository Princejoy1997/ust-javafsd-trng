package com.ust_set3;

class Generic_String {
	public static void main(String[] args) {
		GenericClass<Integer> intObj=new GenericClass<>(5);
		
		System.out.println("Generic Class returns: "+intObj.getData());
		
		GenericClass<String>stringObj=new GenericClass<>("Java Programming");
		
		System.out.println("Generic Class returns: "+stringObj.getData());
	}
}

class GenericClass<T>{
	private T data;
	
	public GenericClass(T data) {
		this.data=data;
	}
	
	public T getData() {
		return this.data;
	}
}
