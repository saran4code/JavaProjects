package Skillsoft;

public class Test_class {
	public static void main(String[] args) {
		String custName = "Saran";
		String itemDesc = "shirt";
		String message;
		
		int quantity = 3;
		double price = 29.99;
		double tax = 1.10;
		double total; 
		boolean stockStatus;
		
		
		
		message = custName + " wants to buy " +  quantity + " " + itemDesc + " at " + price;
		total = quantity * price * tax;
		
		if (quantity > 1 )
		{
			message = message + "a";
		}
		
		stockStatus = true;
		
		if (stockStatus) {
			System.out.println("In Stock");
		}
		else {
			System.out.println("out of stock");
		}
		System.out.println(message);
		System.out.println("Saran's total: " + total);
	}

}
