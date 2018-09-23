package home;

import java.util.Scanner;

public class home{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit: ");
	    double fahernheit = input.nextDouble();
	    
	    // Convert Fahernheit to Celsius
	    double celsius = (5.0/9) * (fahernheit - 32);
	    System.out.println("Fahrenheit " + fahernheit + " is " + celsius + " in Celsius");
	}
}
