import java.util.Scanner; //Package for Scanner object

public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		// This is a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a radius
		System.out.println("Enter a number for a radius: ");
		double radius = input.nextDouble();
		
		// Compute area
		double area = radius * radius * 3.14159;
		
		// Display results
		System.out.println("The area for the circle of radius " + 
			radius + " is "	+ area);
		
	} // end of main
} // end of CAWCI (ComputeAreaWithConsoleInput) class
