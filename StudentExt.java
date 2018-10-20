// StudentExt.java

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class TestStudent {

	public static void main(String[] args) {
		String in, out, name;
		int id;
		
		in = JOptionPane.showInputDialog("Enter student count: ");
		int stCount = Integer.parseInt(in);
		// Create an array of Student references
		Student[] stAr = new Student [stCount]; // Creating an array of the student object
		// Populate student array references 
		for (int i = 0; i < stCount; i++) {
			// Input one student data
			in = JOptionPane.showInputDialog("Enter one student data: ");
			StringTokenizer stk = new StringTokenizer(in,",");
			String token = stk.nextToken().trim();
			id = Integer.parseInt(token);
			name = stk.nextToken().trim();
			token = stk.nextToken().trim();
			
			// Create exam array 
			int examCount=Integer.parseInt(token);
			int [] examScores = new int[examCount];
			
			// Populate exam array
			for (int j = 0; j < examCount; j++) {
				token = stk.nextToken().trim();
				examScores[j] = Integer.parseInt(token);
			}
			
			// Create one student object.
			stAr[i] = new Student(id, name, examScores);
		}
		
		// Get grade from the student object
		String outA = "", outB = "", outC = "", outD = "", outF = "", outAll;
		for (int i = 0; i < stAr.length; i++) {
			String grade = stAr[i].findGrade();
			if(grade.equalsIgnoreCase("A")) {
				outA += stAr[i].getId()+" ";
				outA += stAr[i].getName()+" ";
				outA += "(" + grade + ")\n";				
			}
			else if(grade.equalsIgnoreCase("B")) {
				outB += stAr[i].getId()+" ";
				outB += stAr[i].getName()+" ";
				outB += "(" + grade + ")\n";				
			}
			else if(grade.equalsIgnoreCase("C")) {
				outC += stAr[i].getId()+" ";
				outC += stAr[i].getName()+" ";
				outC += "(" + grade + ")\n";				
			}
			else if(grade.equalsIgnoreCase("D")) {
				outD += stAr[i].getId()+" ";
				outD += stAr[i].getName()+" ";
				outD += "(" + grade + ")\n";				
			}
			else if (grade.equalsIgnoreCase("F")) {
				outF += stAr[i].getId()+" ";
				outF += stAr[i].getName()+" ";
				outF += "(" + grade + ")\n";				
			}
		}
		
		outAll=outA+outB+outC+outF+outF;
		JOptionPane.showMessageDialog(null, outAll);
	}
}
