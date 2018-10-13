// SiblingExt class
package as9;

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
