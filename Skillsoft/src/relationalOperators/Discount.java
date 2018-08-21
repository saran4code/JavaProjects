package relationalOperators;



import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.chrono.*;



public class Discount {
	
	public static void main (String[] args) {
		
		aOrder customer = new aOrder();
		customer.Order("Saran", 900.10, "VA", aOrder.CTS);		
		System.out.println("Discount for this customer is: " + customer.getDiscount());
		
		/* there is a method to calc -  calDiscount() and there is a method to retrieve the discount value after computing based on the conditions set.
		 * getDiscount() is the method that retrieves the details for us, which we can use to extend the object reference we have called here
		 */
		
		
		/* The package java.time.LocalDate is imported for the Date to work
		 * Is crazy super. What'd ya think ?
		 */
		LocalDateTime myDate = LocalDateTime.now();
		String sdate = myDate.format(DateTimeFormatter.ISO_DATE_TIME);    // Format the date in standard ISO format
		String fdate = myDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));   // Localized date time in Medium format. 
		LocalTime myTime = LocalTime.now();
		JapaneseDate jDate = JapaneseDate.from(myDate);
		
		System.out.println("Today's date: " + myDate);		
		System.out.println("Time now is: " +myTime); 
		System.out.println(sdate);
		System.out.println("Japanese date: " + jDate);
		System.out.println(fdate);
		
		

		
	}

}
