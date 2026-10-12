package no.usn.forelesning8_;

public class Student {
	private String name;
	private double score;
	
	public Student() {
//		name = "Ukjent";
//		score = 0.0;
		this("Ukjent", 0.0);
	}
	
	public Student(String name, double score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public double getScore() {
		return score;
	}
	
	public int getLoanDays() {
		return 14;
	}
	
	@Override
	public String toString() {
		return name + " (" + score+")";
	}
}
