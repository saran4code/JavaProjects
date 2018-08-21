package Size;
	
public class ItemSizes {
	
	static final String mSmall = "Men's Small";
	static final String mMed = "Men's Med";
	
	
	public static void main (String[] args) {
		Item item1 = new Item();
		item1.setSize(ItemSizes.mMed);
		
	/* item1 = object of class Item
	 * setSize = Is a method in the class item;
	 * .mMed = is a static variable set in class ItemSizes. Called by ItemSizes.mMed
	 * 
	 * CONCLUSION - 
	 * You can pass a static variable as an argument to the object's method. Provided the argument and the static variable are of same data type  
	 * */
	 
		System.out.println("Item1's size = " + item1.size);
		
	}		
	
}
