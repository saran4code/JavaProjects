package Array;

public class arrayItem {
	
	private int id;
	private String desc;
	private double price;
	private  boolean isBackOrdered;
	private static int nextId = 1;
	
	
	public void Item(String desc, double price) {
		setId();
		this.desc = desc;
		this.price = price;
		checkStock();
	}
	
	private void checkStock() { // Typically we would query from a database
		
		// Negative random numbers will result in isBackordered = true
		double num = Math.random() * 1000;
		if ((num % 2) == 1) {
			this.isBackOrdered = true;
			System.out.println(getDesc() + " is back ordered.");
		}
		else this.isBackOrdered();
		
	}

}
