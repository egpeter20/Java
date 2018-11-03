// This project demonstrate the use of inheritance
// TestSiblingExt Class
// Sibling class
// SiblingExt class

import javax.swing.JOptionPane;

public class TestSiblingExt {

	public static void main(String[] args) {
		String in, out, name;
		int age, weight, height;
		
		name = JOptionPane.showInputDialog("Enter Name: ");
		in = JOptionPane.showInputDialog("Enter Age: ");
		age= Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter Weight: ");
		weight = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter Height: ");
		height = Integer.parseInt(in);
		SiblingExt sibe1 = new SiblingExt(name, age, weight, height);
		
		name = JOptionPane.showInputDialog("Enter Name: ");
		in = JOptionPane.showInputDialog("Enter Age: ");
		age= Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter Weight: ");
		weight = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter Height: ");
		height = Integer.parseInt(in);
		SiblingExt sibe2 = new SiblingExt(name, age, weight, height);
		
		name = JOptionPane.showInputDialog("Enter Name: ");
		in = JOptionPane.showInputDialog("Enter Age: ");
		age= Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter Weight: ");
		weight = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter Height: ");
		height = Integer.parseInt(in);
		SiblingExt sibe3 = new SiblingExt(name, age, weight, height);
		
		// Find the youngest
		SiblingExt youngest = null;
		
		if(sibe1.getAge() <= sibe2.getAge() && 
			sibe1.getAge() <= sibe3.getAge()) {
			youngest = sibe1;
		}
		else if (sibe2.getAge() <= sibe1.getAge() && 
				sibe2.getAge() <= sibe3.getAge()) {
			youngest = sibe2;
		}
		else {
			youngest = sibe3;
		} // End of youngest sequence
		
		// Find the lightest
		SiblingExt lightest = null;
		
		if(sibe1.getWeigth() <= sibe2.getWeigth() && 
			sibe1.getWeigth() <= sibe3.getWeigth()) {
			lightest = sibe1;
		}
		else if (sibe2.getWeigth() <= sibe1.getWeigth() && 
				sibe2.getWeigth() <= sibe3.getWeigth()) {
				lightest = sibe2;
		}
		else {
			lightest = sibe3;
		} // End of lightest sequence
		
		// Find the tallest
		SiblingExt tallest = null;
		
		if(sibe1.getHeight() >= sibe2.getHeight() && 
			sibe1.getHeight() >= sibe3.getHeight()) {
			tallest = sibe1;
		}
		else if (sibe2.getHeight() >= sibe1.getHeight() && 
				sibe2.getHeight() >= sibe3.getHeight()) {
				tallest = sibe2;
		}
		else {
			tallest = sibe3;
		} // End of tallest sequence
		
		// The output
		// Building the lightest output
		out = "The lightest sibling " 
			+lightest.getName()+" "
			+lightest.getAge()+" "
			+lightest.getWeigth()+" "
			+lightest.getHeight()+"\n";
		
		// Building the youngest output
		out+= "The youngest sibling " 
			+youngest.getName()+" "
			+youngest.getAge()+" "
			+youngest.getWeigth()+" "
			+youngest.getHeight()+"\n";
		
		// Building the tallest output
		out+= "The tallest sibling "			
			+tallest.getName()+" "
			+tallest.getAge()+" "
			+tallest.getWeigth()+" "
			+tallest.getHeight()+"\n";
		
		// Display output
		JOptionPane.showMessageDialog(null, out);
	}
}

// Sibling class

public class Sibling {
	private String name;
	private int age;
	private int weigth;
	
	// Main Constructor!
	public Sibling(String name, int age, int weigth) {
		super();
		this.name = name;
		this.age = age;
		this.weigth = weigth;
	}
		
	public String getName() {
		return name;
	}
		
	public int getAge() {
		return age;
	}
		
	public int getWeigth() {
		return weigth;
	}
	
}

// SiblingExt
public class SiblingExt extends Sibling{
	private int height;
	
	public SiblingExt(String name, int age, int weigth, int height) {
		super(name, age, weigth);
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
}
