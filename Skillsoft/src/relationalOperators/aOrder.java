package relationalOperators;

public class aOrder {
	
	static final char IBM = 'I';
	static final char CTS = 'C';
	static final char TCS ='T';
	double price;
	String name;
	String state;
	double discount;
	char custName;
	String N;
	
		
	
	public void Order (String name, double price, String state, char custName) {
		
		this.name = name;
		this.price = price;
		this.state = state;
		this.custName = custName;
		calDiscount();
		
	}
	
	public String getDiscount() {
		return Double.toString(discount) + "%";
		
	}
	
	
	
/*
	public void calDiscount () {
		if (custName == IBM) {
			if (price > 900) {
				discount = 10.00;
			} else discount = 8.00;
		}else if (custName == TCS) {
			if (price > 900) {
				discount = 4.00;
			}else discount = 6.00;
		}
		else if (custName == CTS) {
			if (price > 900) {
				discount = 3.00;
			}else discount = 2.00;
		}
	} */
	
	public void calDiscount () {
		switch(custName) {
		
		case IBM:
			discount = (price > 900)?10.00:8.00;
			break;
		case TCS:
			discount = (price > 900) ? 6.00 : 4.00;
			break;
		case CTS:
			discount = (price > 900) ? 3.00 : 2.00;
			break;
		default:
			System.out.println("Invalid company bro");

		}
	}
	

		
}
	
	
