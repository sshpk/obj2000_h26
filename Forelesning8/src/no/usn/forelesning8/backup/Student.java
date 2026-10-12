package no.usn.forelesning8.backup;

public class Student {
	private String name;
	private double score;

	public Student() {
		//this("Ukjent", 0);
		System.out.println("1: Student()");
	}
	public Student(String name, double score) {
		this.name = name;
		this.score = score;
	}
	public String getName() { return name; }
	public double getScore() { return score; }
}
