// - Rectangle Operations
// TestRectangle.java
import javax.swing.JOptionPane;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rec1, rec2;
		String in, out;
		
		in = JOptionPane.showInputDialog("Enter Length");
		double len = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter width");
		double wid = Double.parseDouble(in);
		rec1 = new Rectangle(len, wid);
		
		in = JOptionPane.showInputDialog("Enter Length");
		len = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter width");
		wid = Double.parseDouble(in);
		rec2 = new Rectangle(len,wid);
		
		// Using first object
		double area = rec1.findArea();
		double perim = rec1.findPerim();
		len = rec1.getLength();
		wid = rec1.getWidth();
		
		// Build the output for the first object
		out  = "First Rectangle\n";
		out += "Length: " + len + "\n";
		out += "Width: " + wid + "\n";
		out += "Area: " + area + "\n";
		out += "Perimeter: " + perim + "\n";
				
		// Using Second object
		area = rec2.findArea();
		perim = rec2.findPerim();
		len = rec2.getLength();
		wid = rec2.getWidth();
		
		// Build the output for the second object
		out += "\nSecond Rectangle\n";
		out += "Length: " + len + "\n";
		out += "Width: " + wid + "\n";
		out += "Area: " + area + "\n";
		out += "Perimeter: " + perim + "\n";
		
		// Display the output
		JOptionPane.showMessageDialog(null, out);
		
		}
}
// Rectangle.java
public class Rectangle {
	private double length, width;
	
	public Rectangle(double l, double w) {
		length = l; width = w;
	}
	
	public double findArea() {
		return length * width;
	}
	
	public double findPerim() {
		return 2*(length * width);
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	
}
