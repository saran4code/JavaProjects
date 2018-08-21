package superClass;

public class Shirt extends clothing {
	private char size;
	private char colorCode;
	private char fit = 'U';
	
	
	public Shirt(int itemID, String description, char colorCode, double price, char fit) {
		super (itemID, description, colorCode, price);
		
		this.fit = fit;
		
	}
	public char getFit() {
		return fit;
		
	}
	
	public void setFit(char fit) {
		this.fit = fit;
	}

}
