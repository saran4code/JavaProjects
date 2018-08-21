package shoppingcart;
import java.lang.StringBuilder; // ctrl + shift + o to invoke package import. 

public class Shoppingcart {
	
	public static void main(String[] args) {
		String custName = "Sally Smith";
		String firstName;
		int spaceIndex;
		StringBuilder sb;
				
		
		// Get the index of the space character " "
		spaceIndex = custName.indexOf(" ");
		
		// Use the substring method to locate the first name
		firstName = custName.substring(0, spaceIndex);
		System.out.println(firstName);
		
		
		StringBuilder mySB = new StringBuilder("Hello");
		mySB.append(" World");
		System.out.println(mySB);
		
		
		// Instantiate and initialize sb to firstname
		sb = new StringBuilder(firstName);
		System.out.println(sb);
		
		sb.append(" Smith");
		System.out.println(sb);
	}

}
