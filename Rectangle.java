/**********************************************************
 * The main Rectangle class 
**********************************************************/

package as4;

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
