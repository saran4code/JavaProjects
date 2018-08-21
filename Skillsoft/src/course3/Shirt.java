package course3;

public class Shirt {
	//Fields
	public String description;
	public char colorcode;
	public double price;
	
	// constructor
	
	public Shirt() {
		description = "---description required---";
		colorcode = 'U';
		price = 0.00;
		
		
		display();								// called normally
		this.display();							// called using the 'this' keyword
		
	}
	
	public void display() {
		System.out.println("Shirt description: " + description);
		System.out.println("Shirt description: " + colorcode);
		System.out.println("Shirt description: " + price);
		
	}

	
	
}
