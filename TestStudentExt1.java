// This program computes and display the final grades for a list of students.

// TestStudentExt.java
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class TestStudentExt {
	public static void main(String[] args) {
		String in, out, name;
		int id;
		
		in = JOptionPane.showInputDialog("Enter student count: ");
		int stCount = Integer.parseInt(in);
		// Create an array of Student references
		StudentExt[] stAr = new StudentExt [stCount]; // Creating an array of the student object
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
			String gradeType = stk.nextToken().trim();
			// Create one student object.
			stAr[i] = new StudentExt(id, name, examScores, gradeType);
		}
		
		// Get grade from the student object
		String outA = "", outB = "", outC = "", outD = "", outF = "",outCr ="", outNcr ="", outAll;
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
			else if (grade.equalsIgnoreCase("Cr")) {
				outCr += stAr[i].getId()+" ";
				outCr += stAr[i].getName()+" ";
				outCr += "(" + grade + ")\n";				
			}
			else if (grade.equalsIgnoreCase("Ncr")) {
				outNcr += stAr[i].getId()+" ";
				outNcr += stAr[i].getName()+" ";
				outNcr += "(" + grade + ")\n";				
			}
		}
		
		outAll=outA+outB+outC+outF+outF+outCr+outNcr;
		JOptionPane.showMessageDialog(null, outAll);
	}
}

// Student.java
public class Student {
	private int id;
	private String name;
	private int[] scores;
	
	public Student(int id, String name, int[] scores) {
		super();
		this.id = id;
		this.name = name;
		this.scores = scores.clone();
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String findGrade() {
		double sum = 0, avg;
		String grade = null;
		for(int i = 0; i< scores.length; i++) {
			sum = sum + scores[i];
		}
		avg = sum/scores.length;
		if(avg > 90) {
			grade="A";
		}
		else if(avg >= 80) {
			grade="B";
		}
		else if(avg >= 70) {
			grade="C";
		}
		else if(avg >= 60) {
			grade="D";
		}
		else{
			grade="F";
		}
		return grade;
	}
}

// TestStudent.java
public class StudentExt extends Student{
	private String gradeType;
	
	public StudentExt(int id, String name, int[] scores, String gradeType) {
		super(id, name, scores);
		this.gradeType = gradeType;
	}
	
	public String findGrade(){
		String grade = findGrade();
		if(gradeType.equalsIgnoreCase("Credit")) {
			if (grade.equalsIgnoreCase("A") || grade.equalsIgnoreCase("B") || grade.equalsIgnoreCase("C") )
			{
				grade = "CR";
			}
			else
			{
				grade = "NCR";
			}
		}
		return grade;
	}
}

// Reading from a file
// TestStudentExtFio.java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TestStudentExtFio {

	public static void main(String[] args) throws IOException {
	//throw Exception{
	String in, out, name;
	int id;
	//FileReader fr = new FileReader("in.txt");
	//BufferedReader br = new BeffereReader(fr);
	
	BufferedReader br = new BufferedReader(new FileReader("in.txt"));
	in = br.readLine();
	int stCount = Integer.parseInt(in);
	// Create an array of Student references
	StudentExt[] stAr = new StudentExt [stCount]; // Creating an array of the student object
	// Populate student array references 
	for (int i = 0; i < stCount; i++) {
		// Input one student data
		in = br.readLine();
		
		StringTokenizer stk = new StringTokenizer(in,",");
		String token = stk.nextToken().trim();
		id = Integer.parseInt(token);
		name = stk.nextToken().trim();
		token = stk.nextToken();
		
		// Create exam array 
		int examCount=Integer.parseInt(token);
		int [] examScores = new int[examCount];
		
		// Populate exam array
		for (int j = 0; j < examCount; j++) {
			token = stk.nextToken();
			examScores[j] = Integer.parseInt(token);
		}
		String gradeType = stk.nextToken();
		// Create one student object.
		stAr[i] = new StudentExt(id, name, examScores, gradeType);
	}
	
	// Get grade from the student object
	String outA = "", outB = "", outC = "", outD = "", outF = "",outCr ="", outNcr ="", outAll;
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
		else if (grade.equalsIgnoreCase("Cr")) {
			outCr += stAr[i].getId()+" ";
			outCr += stAr[i].getName()+" ";
			outCr += "(" + grade + ")\n";				
		}
		else if (grade.equalsIgnoreCase("Ncr")) {
			outNcr += stAr[i].getId()+" ";
			outNcr += stAr[i].getName()+" ";
			outNcr += "(" + grade + ")\n";				
		}
	}
	
	outAll=outA+outB+outC+outF+outF+outCr+outNcr;
	// JOptionPane.showMessageDialog(null, outAll);
	PrintWriter pw = new PrintWriter(new FileWriter("out.txt"));
	
	pw.println(outAll);
	pw.flush();
	pw.close();
	br.close();
}
}
// in.txt
// Data in a file 
15
1, John Adam,3,93,91,100
2, Raymond Woo,3,65,68,63
3, Rick Smith,3,50,58,53
4, Ray Bartlett,3,62,64,69
5, Mary Russell,3,93,90,98
6, Andy Wong,3,89,88,84
7, Jay Russell,3,71,73,78
8, Jimmie Wong,3,70,77,72
9, Jackie Chan,3,85,89,84
10, Susan Wu,3,80,88,84
