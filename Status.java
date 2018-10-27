// TestStatus.java
/*Description
 * "Applying Polymorphism and Dynamic Method Binding".
 * This program will create an array of type Status and of size 6.
 * It will store references of three Rectangle objects,
 * two Sibling objects and one Student object in Status array.
 * By applying the implementation of Status interface.
*/

import javax.swing.JOptionPane;

public class TestStatus {

	public static void main(String[] args) {
		String in, out;
		Status[] stat = new Status[6];
		int stati = 0;
		for(int i=0; i<3; i++) {
			in = JOptionPane.showInputDialog("Enter length");
			double length = Double.parseDouble(in);
			in = JOptionPane.showInputDialog("Enter width");
			double width = Double.parseDouble(in);
			stat[stati]= new Rectangle(length, width);
			stati++;
		}
		for(int i=0; i<2; i++) {
			String name = JOptionPane.showInputDialog("Enter name");
			in = JOptionPane.showInputDialog("Enter age");
			int age = Integer.parseInt(in);
			in = JOptionPane.showInputDialog("Enter weight");
			int weight = Integer.parseInt(in);

			stat[stati]= new Sibling(name,age,weight);
			stati++;
		}
		for(int i=0; i<1; i++) {
			in = JOptionPane.showInputDialog("Enter id");
			int id = Integer.parseInt(in);
			
			String name = JOptionPane.showInputDialog("Enter name");
			
			in = JOptionPane.showInputDialog("Enter examCount");
			int examCount = Integer.parseInt(in);
			double[]scores = new double[examCount];
			for(int j=0; j<examCount;j++) {
				in = JOptionPane.showInputDialog("Enter exam score");
				scores[j] = Double.parseDouble(in);
			}
			stat[stati]= new Student(id,name, scores);
			stati++;
		}
		// Call display status in a polymorphic loop
		for (int i =0; i < stat.length; i++) {
			stat[i].displayStatus();
		}
		out = " ";
		// get status in a polymorphic loop
		for (int i =0; i < stat.length; i++) {
			out = out + stat[i].getStatus();
		}
		JOptionPane.showMessageDialog(null, out);
	}
}
// Status.java
public interface Status {
	public void displayStatus();
	public String getStatus();
}
// Student.java
import javax.swing.JOptionPane;

public class Student implements Status{
	private int id;
	private String name;
	private double [] scores;
	public Student(int id, String name, double[] scores) {
		super();
		this.id = id;
		this.name = name;
		this.scores = scores;
	}
	
	public void displayStatus(){
		String Status = getStatus();
		JOptionPane.showMessageDialog(null, Status);
	}
	
	public String getStatus(){
		String Status = "Student\n";
		Status+= "name= " +name+ "id= "+ id + "scores=";
		for(int i=0; i < scores.length; i++) {
			Status+=scores[i]+ ", ";
		}
		Status+="\n";
		return Status;
	}	
}
// Sibling.java
import javax.swing.JOptionPane;

public class Sibling implements Status{
	private String name;
	private int age;
	private int weight;
	
	public Sibling(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public void displayStatus(){
		String Status = getStatus();
		JOptionPane.showMessageDialog(null, Status);
	}
	
	public String getStatus(){
		String Status = "Sibling\n";
		Status+= "name= " +name+ "age= "+ age + "weight= "+ weight +"\n";
		return Status;
	}
	
}
//Rectangle.java
import javax.swing.JOptionPane;

public class Rectangle implements Status{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
		
	public void displayStatus(){
		String Status = getStatus();
		JOptionPane.showMessageDialog(null, Status);
	}
	
	public String getStatus(){
		String Status = "Rectangle\n";
		Status+= "length= " +length+ "width= "+ width +"\n";
		return Status;
	}
}
