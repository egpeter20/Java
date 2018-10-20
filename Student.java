// Fills for the whole project
// Student.java
// TestStudent.java
// StudentExt.java
// TestStudentExt.java
// in.txt

// This program computes and display the final grades for a list of students.

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
