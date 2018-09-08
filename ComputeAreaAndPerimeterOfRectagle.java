/**********************************************************************
 * Compute the area and perimeter of a rectangle
 * *******************************************************************/

package as3;

import javax.swing.JOptionPane;

public class RectangleProc {

	public static void main(String[] args) {
		String in, out;
		
		// Input the length 
		in = JOptionPane.showInputDialog("Enter length");
		double length = Double.parseDouble(in);
		
		// Input the width
		in = JOptionPane.showInputDialog("Enter Width");
		double Width = Double.parseDouble(in);
		double area = computeArea(length, Width);
		double perim = computePerim(length, Width);
		
		// Build output for the lebgth and width
		out = "Length: " + length + "\n";
		out = out + "Width: " + Width + "\n";
		JOptionPane.showMessageDialog(null, out);

		// Build output for the area and perimter
		out = "Area: " + area + "\n";
		out = out + "Perimter: " + perim + "\n";

		// Display output
		JOptionPane.showMessageDialog(null, out);
	}
	static double computeArea(double len, double wid) {
		double a;
		a = len * wid;
		return a;
	}
	
	static double computePerim(double len, double wid) {
		double p;
		p = 2*(len+wid);
		return p;
	}
}
