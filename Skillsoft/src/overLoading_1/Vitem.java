package overLoading_1;

public class Vitem {
	
	String description;
    int quantity;
	double price;
	char colorcode = 'U';
	
	
	
	
	public void displayItem() {
		System.out.println("Items are: " + description + ", " + quantity + ", " + price + ", " + colorcode);
		
	}
	
	
	// Declare a method that can hold 3 parameters and returns void
	
	public void setItemfields(String desc, int qty, double prc) {
		this.description = desc;
		this.quantity = qty;
		this.price = prc;
			
	}
	
	
	// Declare a method that can hold 4 parameters and returns int
	
	public int setItemfields(String desc, int qty, double prc, char c) {
				if ( c != ' ') {
					colorcode = c;
					this.setItemfields(desc, qty, prc);
					return 1;
				}
				else {
					return -1;
				}
			
			}

}
