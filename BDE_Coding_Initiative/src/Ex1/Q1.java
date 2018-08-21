package Ex1;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		String a = sc.next();
		String b = sc.next();

		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		
		System.out.print(name+ (num1 + num2));
		
		
		
	}

}
