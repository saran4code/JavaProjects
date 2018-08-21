package maTh;

public class fixPhone {
	
	private int phone;	
	
	public int getPhoneNumber() {
		return phone;
	}

	public void setPhonNumber(String s_num) {
		// parse out the dashes and parentheses from the 
		// string filter
		this.phone= Integer.parseInt(s_num);
				
	}

}
