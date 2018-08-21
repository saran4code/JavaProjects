package shoppingcart;

public class Test {
	

	public static void main(String[] args) {
		
		short a, b, c;
		
		a = 1;  // Automatic promotion to integers. Java does this
		b = 2;
		
		c = (short) (a + b) ; // Type cast (a + b) with (short) to yield the output.
		
		System.out.println(c);
		
		
		int num1 = 53;
		int num2 = 47;
		byte num3;
		byte num4;
		
		num3 = (byte) (num1 + num2);
		System.out.println(num3);
		
		int myInt;
		long myLong = 1234589789966568674L;
		myInt = (int) (myLong);  // long can hold more numbers than int
		
		System.out.println(myInt);
	}
	//System.out.println(c);
	
}	
	
	