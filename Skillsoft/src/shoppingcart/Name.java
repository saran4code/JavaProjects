package shoppingcart;

public class Name {
	
	public static void main(String[] args) {
		String custName = "Sally Smith";
		String lastName;
		
		//final//
		final int NUMBER_OF_MONTHS = 12;
		//NUMBER_OF_MONTHS = 14;
		System.out.println(NUMBER_OF_MONTHS);
		
		int a = 6;
		int b = 2;
		a %=b;
		System.out.println(a);
		System.out.println(b);
		
		 /*
		 * Increment and Decrement Operators
		 * int count = 15;
		 * int a, b, c, d;
		 * a = count++;
		 * b = count;
		 * c = ++count;
		 * d = count;
		 * system.out.println(a + " ", + b + " " + c + " " + d);
		 * 
		 * Output - 
		 * 15, 16, 17, 17
		 */
		
		
				
		
		// lastName = custName.substring(custName.indexOf("S"));
		// lastName = custName.substring(6));
		lastName = custName.substring(custName.indexOf(" ")+1);
		//+1, custName.length());
		
		String lc = ("GOOD" + " BYUE").toLowerCase();
		
		System.out.println(lc);
		System.out.println(lastName);
	}

}
