import java.util.Scanner; // This is a Java package

public class ComputeAverage {

	public static void main(String[] args) {
		// This is a Scanner object
		Scanner input = new Scanner(System.in);
		
		
		// Prompt the user to enter a three numbers
		System.out.println("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double average = (number1 + number2 + number3) / 3 ;
		
		// Display the result
		System.out.println("The average of " + number1 + ", " + number2 + "," + number3 + ", is " + average);
		
	}
}
