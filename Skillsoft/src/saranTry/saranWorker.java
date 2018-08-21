package saranTry;

public class saranWorker {
	
	char color;
	
	public boolean setColor(char colorcode) {
		if (colorcode == ' ') {
				return false;
		}
		else {
			this.color = colorcode;
			return true;
						
		}
	}
	
	
}