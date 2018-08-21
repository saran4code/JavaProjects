package enCapsulation2;

public class enShirt2 {
	
	public static void main(String[] args) {
		
		
		enColor2 object = new enColor2();
		enColor2 object2 = new enColor2();
		char colorCode, colorCode2;	
		
		
		object.setcolorcode('B');
		colorCode = object.getcolorcode();
		System.out.println("Color code: "+ colorCode);
		
		
		object2.setcolorcode('Z');
		colorCode2 = object.getcolorcode();		
		
	}
	
	

}
