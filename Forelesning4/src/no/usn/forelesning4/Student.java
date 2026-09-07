package no.usn.forelesning4;

public class Student {
	private String name;
	private double score;
	private static int numberOfStudents = 0;
	
	public Student(String name, double score){
		this.name = name;
		this.score = score;
		numberOfStudents++;
	}
	
	public Student() {
		System.out.println("hi");
		this("ukjent",0.0);
	}
	public static int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getName() {
		return name;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
	//	if(newScore > 0)
			this.score = score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
