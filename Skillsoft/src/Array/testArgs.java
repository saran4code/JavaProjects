package Array;

public class testArgs {
	public static void main(String[] args) {
		String name;
		int age;
		
		// Print the name and age if the number of arguments is greater than 2
		// Print an error message if the argument count is less than 2
		
		if (args.length < 2) {
			System.out.println("Invalid number of arguments. Cannot be compiled");
		}else {
			name = args[0];
			age = Integer.parseInt(args[1]);
			System.out.println("Name: " + name + " and age: " + age);
		}
		
	}

}
