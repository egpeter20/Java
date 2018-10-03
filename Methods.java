/*
 * learning about loop, functions, functions overloading and Switch statement
 * */
 
import java.util.Scanner;

public class Methods {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sum form 1 to 10 is " + sum(1,10));
		
		
		int result = sum(5,5,5);
		System.out.print("The value of my numbers: " + result);
		
		// Prompt the user to enter month
		System.out.print("Enter month as a number between 1 and 12: ");
		int month = input.nextInt();
		
		System.out.println("Your month is " + getMonthName(month));
	}
	
	public static int sum(int i1, int i2) {
		int result = 0;
			for(int i =0; i <= i2; i++)
				result +=i;
		return result;
	}
	
	// Overloading the function with different parameters 
	public static int sum(int i1, int i2, int i3) {
		int result = 5 + (i1+i2+i3);
		return result;
	}
	
	// Switch Statement
	public static String getMonthName(int month) {
		 String monthName = "";
		 
		 switch(month) {
			 case 1: 
				 monthName = "January";
				 break;
			 case 2: 
				 monthName = "February";
				 break;
			 case 3: 
				 monthName = "March";
			 	break;
			 case 4: 
				 monthName = "April";
			 	break;
			 case 5: 
				 monthName = "May";
			 	break;
			 case 6: 
				 monthName = "June";
			 	break;
			 case 7: 
				 monthName = "July";
			 	break;
			 case 8: 
				 monthName = "August";
			 	break;
			 case 9: 
				 monthName = "September";
			 	break;
			 case 10: 
				 monthName = "October";
			 	break;
			 case 11: 
				 monthName = "November";
			 	break;
			 case 12: 
				 monthName = "December";
		 }
		 
		 return monthName;
		 }
}
