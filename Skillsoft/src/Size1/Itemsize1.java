package Size1;

public class Itemsize1 {
	
	static final String mSmall = "Men's Small";
	static final String mMed = "Men's Med";  
	
	public static void main(String[] args) {
		
		Item1 saran = new Item1();
		saran.setSize(mMed);
		System.out.println(saran.size);
		
	}

}
