package actualRelationalOperators;

public class actShoppingcart {
	
	public static void main(String[] args) {
		actOrder order = new actOrder();
		order.Order("Rick Wilson" , 80.00, "VA", actOrder.NONPROFIT);
		System.out.println("Discount is: "+ order.getDiscount());
		
	}

}
