package overLoading_1;

public class JobbingCart {
	
	public static void main(String[] args) {
		Vitem item1 = new Vitem();
	    item1.setItemfields("Belt", 1, 20.98);
	    item1.displayItem();
	    
	    
   
	     
	    Vitem item2 = new Vitem();
	    int retcode = item2.setItemfields("Socks", 1, 40.39, 'B');
	    if (retcode < 0) {
	    	System.out.println("Invalid color code. Item not added");
	    }
	    else {
	    	item2.displayItem();
	    }
	    
	   /* item2.setItemfields("Socks", 5, 45.68, ' ');
	  	    if ( item2.colorcode < 0) {
	    	System.out.println("Invalid color code. Item not added");
	    }
	    else {
	    	item2.displayItem();
	    } */
	
	}
	

}
