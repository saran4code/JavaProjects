package Array;

public class fun {
	public static void main(String[] args) {
		
		int currentFloor = 1;
		int targetFloor;
		
		/* goUp() and goDown() will increment the current floor until the condition is met.
		 *  
		 */		
				while (currentFloor != targetFloor) {  // while always evaluates to true. when this condition is false is when the body of the code stops executing. 
					if (currentFloor < targetFloor) {
						goUp();
					}else {
						goDown();
					}
			}
		}

	private static void goDown() {
		// TODO Auto-generated method stub
		
	}

	private static void goUp() {
		// TODO Auto-generated method stub
		
	}
		
	}

