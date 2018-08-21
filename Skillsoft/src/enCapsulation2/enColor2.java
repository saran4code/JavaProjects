package enCapsulation2;

public class enColor2 {
	
	private char colorCode = 'U';
	
	
	public char getcolorcode () {
		return colorCode;
	}
	
	public void setcolorcode (char newcode) {
		if (newcode == 'B') {
		   colorCode = newcode;
		   return;
		}
		if (newcode == 'R') {
			colorCode = newcode;
			return;
		}
		if (newcode == 'G') {
			colorCode = newcode;
			return;
		}
		else {
		System.out.println("Invalid color code. Use R, G, or B");
		}
	}

}
