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
