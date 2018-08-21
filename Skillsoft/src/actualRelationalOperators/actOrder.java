package actualRelationalOperators;

public class actOrder {
	
	static final char CORP = 'C';
	static final char PRIVATE = 'P';
	static final char NONPROFIT = 'N';
	String Name;
	double total;
	String stateCode;
	double discount;
	char custType;
	
	public void  Order(String name, double total, String state, char custType) {
		this.Name = name;
		this.total = total;
		this.stateCode = state;
		this.custType = custType;
		calcDiscount();
				
	}
	
	public String getDiscount() {
		return Double.toString(discount) + "%";
	}
	
	// Code the calcDiscount method.
	
	public void calcDiscount() {
		if(custType == NONPROFIT) {
			if(total > 900) {
				discount = 10.00;
			} else discount = 5.00;
			
		} else if (custType == PRIVATE) {
			if(total > 900) {
				discount = 7.00;
			}else  discount = 4.00;
				
		} else if (custType == CORP) {
			if(total<500) {
				discount = 8.00;
			} else discount = 5.00;
		}
	}

}
