package enCapsulation3;

public class Shirten2 {
	
	public static void main(String[] args) {
		
		colorEn3 object1 = new colorEn3();
		System.out.println("Color code: " + object1.getColorcode());
		
		
		object1.setColorcode('Z');
		System.out.println("Color code: " + object1.getColorcode());
		
		/* object1.setColorcode(' ');
		char newcode = object1.getColorcode();
		System.out.println("color code is: " + newcode); */
		
	}

}
