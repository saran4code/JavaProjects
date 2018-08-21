package relationalOperators;

public class Employees {
	
	private String name1;
	private String name2;  // This is because both new name1 and name2 are different objects pointing to different reference
													   // and it won't match the same despite the characters are the same.  
	
	
	
	public String getname1() {
		return name1 ;
				
	}
	
	public void setname1(String name1) {
		this.name1 = name1;
		
	}
	
	public String getname2() {
		return name2;
	}
	
	public void setname2(String name2) {
		this.name2 = name2;
		
	} 
	
	public void areNamesEqual() {
		//if (name1.equalsIgnoreCase(name2)) {
		if (name1 == name2) {
			System.out.println("Names are equal");
		}
		else {
			System.out.println("Names don't match");
		}
		
			
	}
	

}
