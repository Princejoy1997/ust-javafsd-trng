package foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEach_Example1 {

	public static void main(String[] args) { 
		 List<String> gamesList = new ArrayList<String>(); 
		 gamesList.add("Football"); 
		 gamesList.add("Cricket"); 
		 gamesList.add("Chess"); 
		 gamesList.add("Hocky"); 
		 System.out.println("------------Iterating by passingmethod reference---------------"); 
		 gamesList.forEach(System.out::println); 
		 }
}
