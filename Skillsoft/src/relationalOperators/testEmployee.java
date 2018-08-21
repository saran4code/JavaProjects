package relationalOperators;

public class testEmployee {
	
	
	
	public static void main(String[] args) {
		
		Employees saran = new Employees();
	    saran.setname1("Doggy");
		saran.setname2("Doggy");
		
		saran.areNamesEqual();
		
		String s = saran.getname1() == saran.getname2() ? "Same dude" : "Not same mate" ;
		System.out.println("Here's what andrew has to say about the results: " + s);
		
		
		int goals = 5;
		
		System.out.println("The number of " + (goals == 1 ? "goal scored is": "goals scored are" ) + " " + goals); // only if you have two results. more than two, then if/else
		
		
				
		
		
	}

}
