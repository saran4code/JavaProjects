package Skillsoft;

public class Loops {
	public static void main(String[] args) {
		String custName = "Saran";
		String message;
		
		String[] items  = {"shirts", "socks","scarf","belt"};
		
		
		message = custName + " wants to buy " + items.length + "items.";
		System.out.println(message);
		
		System.out.println("Items purchased: ");
		
		for (String item : items) {
			System.out.println(item + ",");
		}
		 
	}
	
}

		