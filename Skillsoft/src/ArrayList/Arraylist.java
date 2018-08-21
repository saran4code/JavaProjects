package ArrayList;

import java.util.*;

public class Arraylist {
	
	
	public static void main(String[] args) {
		ArrayList<String> names;
		names = new ArrayList();
		
		names.add("Jamie");
		names.add("Gustav");
		names.add("Alisa");
		names.add("Jose");
		names.add(2, "Prashant");
		
		//names.remove(names.size() -1);
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
			
		}
		
		System.out.println(names);
		
		names.remove(names.size() -1);
		System.out.println(names);
		
		
	}

}
