package Workingmethods;

public class Caller {
	
	public static void main(String[] args) {
		worker worker1 = new worker();
		
		
		/* Call the setColor method on worker1. Print an appropriate message,
		 * depending upon the return value. */
		
		if (worker1.setColor('B')) {
			System.out.println("worker1.color = " + worker1.color);
		} else System.out.println("Invalid color");
	}

}
