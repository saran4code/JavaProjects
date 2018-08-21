package relationalOperators;

public class ternerayOp {
	
	public static void main(String[] args) {
		
		int x = 9;
		int y = 3;
		
		// Fun stuff using the IF statement
		
		if (x/y < 3) {
			x+=y;
		}
		else {
			x*=y;
		}
		System.out.println(x);
		
		
		
		// Using ternary operation
		
		x = 9;
		y =3;
		
		x = ((x/y < 3 ? (x +=y) : (x*=y)));
		System.out.println(x);
		
		
	}

}
