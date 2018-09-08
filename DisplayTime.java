import java.util.Scanner; // This is a Java package

public class DisplayTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.print("Enter an intger for a second: ");
		int second = input.nextInt();
		
		int minutes = second / 60; // The minutes in seconds mood
		int remainingSeconds = second % 60; // Seconds remaining
		System.out.println(second + " seconds is " + minutes +
				" minutes and " + remainingSeconds + " Seconds");
	}
}
