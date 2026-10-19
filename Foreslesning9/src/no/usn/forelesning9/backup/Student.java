package no.usn.forelesning9.backup;

public class Student {
	String name;
	double score;
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
	int getLoanDays() {
		return 14;
	}
}
