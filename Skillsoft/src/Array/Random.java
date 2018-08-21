package Array;

public class Random {
	
	public static void main (String[] args) {
		
		String name = "Lenny";
		String guess = "";
		int attempts = 0;
		
			
		/* The nested loop tries to guess a name by building a string of the same length completely at random.
		 * The outer loop begins on line four. The inner loop which starts on line six initializes char asciiChar to a lower case letter randomly.
		 * These chars are then added to string "guess" until that string is as long as a string that it's being matched against. 
		 * The outer loop tests to see whether guess is the same as a lower case version of the original name. 
		 * If it's not, guess is reset to an empty string and the inner loop runs again. Usually millions of times for a five letter name
		 * 
		 */
		
		while (!guess.equalsIgnoreCase(name)) {
			guess = "";
			while (guess.length() < name.length()) {
				char asciiChar = (char) (Math.random() *26 +97);
				guess += asciiChar;
			}
			attempts++;
		}
		System.out.println(name + " found after " + attempts + " tries!");
		System.out.println(name.length());
	}
	
}
	
	

