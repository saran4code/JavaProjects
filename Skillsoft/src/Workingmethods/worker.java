package Workingmethods;

public class worker {
	char color;
	
	
	// Declare and code the setColor method.
	
	public boolean setColor(char colorCode) {
		if (colorCode == ' ') {
			return false;
		}
		else {
			this.color = colorCode;
			return true;
			
		}
	}
	

}
