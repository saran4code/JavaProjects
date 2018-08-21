package Ex1;
import java.util.*;



public class Q2 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().charAt(0);
		int b = sc.nextInt();
		byte c = sc.nextByte();
		short d = sc.nextShort();
		double e = sc.nextDouble();
		String f = sc.next();
		String g = sc.next();
		float h = Float.parseFloat(g);
		
		
		/* This is a test code to see why sc.nextFloat() did not recognize 6.0000145f as a float literal. I had to circumvent the "InputMismatch exception" error
		 * by employing this method.
		 * 
		   Scanner x = new Scanner(System.in);
		   String y = x.next();
		   float z = Float.parseFloat(y);
		   System.out.println(z);
		   
		*/
		
		
		System.out.print(f + " " + h + " " +d + " "+ a + " " + b+ " " +e+ " " +c);
					
	}


}
