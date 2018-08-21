package Ex1;


import java.util.*;

public class Q3 {
	
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String value = sc.next();
		
		
		switch(value) {
		
		case ("apple"): {
			System.out.println("Fruit " + value);
			}
			break;
		
		case ("tomato"): {
			System.out.println("Fruit/Vegetable " + value);
		}
		break;
		
		case ("mango"): {
			System.out.println("Fruit "+ value);
		}
		break;
		
		case("potato"): {
			System.out.println("Vegetable " + value);
		}
		
		}
}
			
		
		
	/*	String value = sc.nextLine();
		if ("apple".equals(value)) {
			System.out.println("Fruit " + value);
		}
		else if ("tomato".equals(value)) {
			System.out.println("Fruit/Vegetable" + value);
		}
		else if ("mango".equals(value)) {
			System.out.println("Fruit" + value);
		}
		else if ("potato".equals(value)) {
			System.out.println("Vegetable " + value);
		}
		
	}*/

}
