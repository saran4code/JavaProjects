package shoppingcart;

public class Datatypes {
	
	public static void main(String[] args) {
		
		// Create an integer variable
		int int1;
		
		// Declare and initialize variables of type long, float, and char
		long long1 = 99_000_000_000L;
		float flt1 = 37.9F;
		char ch1 = 'U';
		
		// Print the long variable
		System.out.println("Long1: " + long1);
		
		// Assign the long to the int and print the int variable
		
		int1 = (int) (long1);
		System.out.println("Long assigned to int variable: " + int1);
		
	}

}
