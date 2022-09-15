package com.ust;

interface Vehicle1{
	public abstract String getColor();
	public abstract String getEngineType();
	public static final int x=4;
}

abstract public class Interface_Example implements Vehicle1 {
	public String getColor() {
		return "Green";	
		}
	
	/**public String getEngineType() {
		return "Manual";
	}*/
}
