package Array;

public class factorial {
	
	static void factorial( int target) {
		long fact = 1;
		int save = target;
		
		do {
			
		/* The way factorial works  -
			 * 5 x 4 = 20
			 * 20 x 3 = 60
			 * 60 x 2 = 120
			 */
			
			fact *= target--;
		} while (target > 0);   // In a do-while loop, the while should end with a semi-colon. 
		System.out.println("Factorial for " + save + ": " + fact);
	}

}
