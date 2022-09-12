package sba2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sba2_2 {

	public static void main(String arg[]) {
		List<Integer> e = new ArrayList<>();
		for(int i=1;i<=20;i++) {
			e.add(i);
		}
		System.out.println("Employee IDs: ");
		Iterator itr = e.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
	}
}
