package Skillsoft;

public class shoppingcart {
	public static void main(String[] args) {
		
		
		// Instantiate two item objects
		
		Item item1, item2;
		item1 = new Item();
		item2 = new Item();
		
				
		// Assign values to fields
		
		item1.desc = "Shirt";
		item1.itemID = 123456;
		item2.desc = "Pants";
		item2.itemID = 654321;
		
		
		// Display items
		
		System.out.println("Item1: " + item1.desc + " " + item1.itemID);
		System.out.println("Item2: " + item2.desc + " " + item2.itemID);
		
		
		//Assign one item to another and run it again
		
		item1 = item2;
		System.out.println("Item1: " + item1.desc + " " + item1.itemID);
		System.out.println("Item2: " + item2.desc + " " + item2.itemID);
		

		
	}
}
