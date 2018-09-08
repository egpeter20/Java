/**********************************************************
 * Computes the sum of two numbers and average them 
**********************************************************/

package as2;

import javax.swing.JOptionPane;

public class Average {

	public static void main(String[] args) {
		String in, out;
		// Input two numbers!
		in=JOptionPane.showInputDialog
							("Enter a number: ");
		double n1 = Double.parseDouble(in);
		
		in=JOptionPane.showInputDialog
							("Enter a number: ");
		double n2 = Double.parseDouble(in);
		
		double sum = n1 + n2;
		double avg = sum/2;
		// Build the output.
		out = "The sum of " + n1 + " and " + n2 + " is " + sum +
				"\n";
		
		out = out + "The average of " + n1 + " and " + n2 + " is " + avg +
				"\n";
		// Display the output.
		JOptionPane.showMessageDialog(null, out);
	}
}
