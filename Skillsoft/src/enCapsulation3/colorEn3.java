package enCapsulation3;

public class colorEn3 {
	
	
	private char colorCode = 'U';
	
	public char getColorcode() {
		return colorCode;
	}
	
	public void setColorcode (char c) {
		this.colorCode = c;
		
		if (c == 'B') {
			colorCode = c;
			return;
		}
		
		if ( c == 'G') {
			colorCode = c;
			return;
		}
		if (c == 'R') {
			colorCode = c;
			return;
		}
		System.out.println("Invalid color code. Use B, G, or R.");
	}
	


}
