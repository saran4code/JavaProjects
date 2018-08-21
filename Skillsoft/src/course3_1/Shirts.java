package course3_1;

public class Shirts {
	
	public String description;
	public char colorCode;
	public double price;
	
/*	public void setFields(String desc, char color, double price) {
		this.description = desc;
		this.colorcode = color;
		this.price = price;
	}
*/
	
	public Shirts(String desc, String color, double price) {
		setFields(desc, price);
		setColor(color);
	}
	
	private void setFields(String desc, double price) {
	// TODO Auto-generated method stub
	
}

	public void setColor (String theColor) {
		if (theColor.length() > 0 ) {
			colorCode = theColor.charAt(0);
			
		}
	}
}
