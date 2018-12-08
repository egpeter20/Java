// Main.java
// This program take the sales amounts from five regions of a company 
// and displays a pie chart as a percentage of sales.

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String in;
		double north, south, east, west, midWest;
		
		in = JOptionPane.showInputDialog("Enter north sales");
		north = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter south sales");
		south = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter east sales");
		east = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter west sales");
		west = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter midWest sales");
		midWest = Double.parseDouble(in);
		
		JFrameExt f = new JFrameExt(north, south, east, west, midWest);
		f.setSize(700, 700);
		f.setVisible(true);
	}
}

//JFrameExt.java

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class JFrameExt extends JFrame {
		private double north;
		private double south;
		private double east;
		private double west;
		private double midWest;
		
public JFrameExt(double north, double south, double east, double west, double midWest){
		super();
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
		this.midWest = midWest;
	}

@Override
	public void paint(Graphics g) {
		double all = north+south+east+west+midWest;
		
		super.paint(g);
//		g.drawString("Hi", 100, 50);
//		g.drawRect(100, 50, 400, 400);
//		g.drawOval(100, 50, 400, 400);
//		g.setColor(Color.yellow);
//		g.fillArc(100, 50, 400, 400, 0, 60);
//		g.setColor(Color.blue);
//		g.fillArc(100, 50, 400, 400, 60, 60);
		
		// Slice One
		int startAngle = 0;
		int arcAngle = (int)(north/all*360);
		g.setColor(Color.RED);
		g.fillArc(50, 50, 400, 400, startAngle, arcAngle);
		
		// Slice Two
		startAngle = startAngle+arcAngle;
		arcAngle = (int)(south/all*360);
		g.setColor(Color.GREEN);
		g.fillArc(50, 50, 400, 400, startAngle, arcAngle);
		
		// Slice Three
		startAngle = startAngle+arcAngle;
		arcAngle = (int)(east/all*360);
		g.setColor(Color.BLUE);
		g.fillArc(50, 50, 400, 400, startAngle, arcAngle);

		// Slice Four
		startAngle = startAngle+arcAngle;
		arcAngle = (int)(west/all*360);
		g.setColor(Color.PINK);
		g.fillArc(50, 50, 400, 400, startAngle, arcAngle);

		// Slice Five
		startAngle = startAngle+arcAngle;
		arcAngle = (int)(midWest/all*360);
		g.setColor(Color.MAGENTA);
		g.fillArc(50, 50, 400, 400, startAngle, arcAngle);
		
		
	 // Main square for the legend for north region
	 int xRect=100;
	 int rectWidth=50;
	 int horSpacing=10;
	 int vertSpacing= 5;
	 
		// Arc-North 
	 int yRect=550;
	 int rectHeight=10;
	 g.setColor(Color.red);
	 g.fillRect (xRect,yRect,rectWidth,rectHeight);
	 
	 int xString=xRect+rectWidth+horSpacing;
	 int yString=yRect+rectHeight;
	 String theString="North: - 25";
	 g.drawString (theString,xString,yString);
	 
	 // Arc-south
	 yRect=575;
	 rectHeight=10;
	 g.setColor(Color.green);
	 g.fillRect (xRect,yRect,rectWidth,rectHeight);
	 
	 xString=xRect+rectWidth+horSpacing;
	 yString=yRect+rectHeight;
	 theString="South: - 20";
	 g.drawString (theString,xString,yString);
	 
	 // Arc-East
	 yRect=600;
	 rectHeight=10;
	 g.setColor(Color.blue);
	 g.fillRect (xRect,yRect,rectWidth,rectHeight);
	 
	 xString=xRect+rectWidth+horSpacing;
	 yString=yRect+rectHeight;
	 theString="East: - 15";
	 g.drawString (theString,xString,yString);
	 
	 // Arc-West
	 yRect=625;
	 rectHeight=10;
	 g.setColor(Color.pink);
	 g.fillRect (xRect,yRect,rectWidth,rectHeight);
	 
	 xString=xRect+rectWidth+horSpacing;
	 yString=yRect+rectHeight;
	 theString="West: - 30";
	 g.drawString (theString,xString,yString);
	 
	 // Arc-midWest
	 yRect=650;
	 rectHeight=10;
	 g.setColor(Color.magenta);
	 g.fillRect (xRect,yRect,rectWidth,rectHeight);
	 
	 xString=xRect+rectWidth+horSpacing;
	 yString=yRect+rectHeight;
	 theString="midWest: - 10";
	     g.drawString (theString,xString,yString);
		}
	}
