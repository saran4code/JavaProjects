package Array;

public class insertComment {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		while (i < 2 ) {
			System.out.println("ol");
			i++;
		}
		
		for (i = 0 ; i < 2 ; i++) {
			System.out.println("lo");
		}
		
		String [] Saran = {"saran", "sarana", "sara", "sar", "unavailable"};
		
		
		/* Enhanced for loop that can be used only on Strings
		 * 
		 */
		for (String name : Saran) {    
			System.out.println(name);
		}
		
		/* Standard for loop that can be used for many purposes
		 * 
		 */
		
		for (int idx =0 ; idx < (Saran.length)/*boolean expression using the String.length */;idx++) {
			if (Saran[idx].equalsIgnoreCase("unavailable")) {
				continue;
			}
				System.out.println(Saran[idx]);  /* counter used as the index of the array */
			}
	
		}
		
		
		
	}
