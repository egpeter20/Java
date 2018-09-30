import javax.swing.JOptionPane;

public class TestSibling {

	public static void main(String[] args) {
		
		Sibling data;
		String in, out;
		
		for(int i = 0; i < 3; i++) {
			in = JOptionPane.showInputDialog("Name person number " + (i+1) + ":");
			in = JOptionPane.showInputDialog("Age person number " + (i+1) + ":");
			in = JOptionPane.showInputDialog("Weight person number " + (i+1) + ":");
		}
		
	}

}
// Assignment link: https://dvc.instructure.com/courses/33496/files/2108335
// Git refrence: https://github.com/peterbotros/Java/blob/master/Statistics.java
// Git refrence: https://github.com/peterbotros/Java/blob/master/TestStatistics.java
// 1. In the main method, input the name, age and weight of each sibling
// 2. Display the lightest followed by the youngest of the siblings.


// Sibling.java
public class Sibling {
	// Private data types
	private String names;
	private int ages;
	private double weights;
	
	// Default constructor
	public Sibling(String n, int a, double w) {
		this.names = n;
		this.ages = a;
		this.weights = w;
	};
	
	// The accessor methods
	public String getNames() {
		return names;
	}
	
	public int getAges() {
		return ages;
	}
	
	public double getWeights() {
		return weights;
	}
	
};
