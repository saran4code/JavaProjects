package saranTry;

public class saranCaller {
	
	// Define the main method here
	
	public static void main(String[] args) {
		
		saranWorker worker1 = new saranWorker();
				
		if (worker1.setColor('B')) {
			
			System.out.println("worker1.color is definitely: " + worker1.color);
		}
		else {
			System.out.println("Invalid color");
		}
		
	}
	
	
	
	
	
}