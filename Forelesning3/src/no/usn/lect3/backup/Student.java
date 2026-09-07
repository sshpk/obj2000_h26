package no.usn.lect3.backup;

public class Student {
	String name;
	double score;
	
	public Student(String newName, double newScore) {
		name = newName;
		score = newScore;
	}
	
	public char getGrade() {
		if(score>=90) 
			return 'A';
		else if (score>=80)
			return 'B';
		else if (score>=70)
			return 'C';
		else
			return 'F';
	}
}
