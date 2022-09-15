package com.ust_set2;

import java.util.HashMap;

public class Map1 {
	public static void main(String args[]) {
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		
		m.put(1, "Glory");
		m.put(null, null);
		m.put(2, "haridev");
		
		System.out.println(m.get(2));
	}
}
