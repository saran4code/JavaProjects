package enCapsulation4;

public class cusTomer {
	
	private String name;
	private String ssn = "xdfkdfdnf";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// To keep the SSN read-only
	
	public String getSSN() {		
		return ssn;
	}

}
