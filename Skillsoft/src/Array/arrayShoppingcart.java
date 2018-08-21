package Array;

import Size.Item;

public class arrayShoppingcart {
	
	Item[] items = {new Item("Shirt", 25.60), new Item("WristBand", 1.00),
					new Item("Pants", 35.99)};
	
	public static void main (String[] args) {
		arrayShoppingcart cart = new arrayShoppingcart();
		cart.displayTotal();
					
	}
	
	public void displayTotal() {
		double total=0;
		for(int idx=0; idx< items.length; idx++) {
			if(items[idx).isBackOrdered()) {
				continue;
			total+=items[idx].getPrice();
		}
		System.out.println("Shoppint Cart Total: " + total);
		

		}
	}

}
