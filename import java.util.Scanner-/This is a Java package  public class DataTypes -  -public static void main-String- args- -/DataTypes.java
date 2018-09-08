import java.util.Scanner; // This is a Java package

public class DataTypes {

	public static void main(String[] args) {
		// Declare a constant
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a byte value: ");
		byte byteValue = input.nextByte();
		
		System.out.print("Enter a short value: ");
		short shortValue = input.nextShort();
		
		System.out.print("Enter an int value: ");
		int intValue = input.nextInt();
		
		System.out.print("Enter a long value: ");
		long longValue = input.nextLong();
		
		System.out.print("Enter a float value: ");
		float floatValue = input.nextFloat();
		System.exit(0);
	}
}
