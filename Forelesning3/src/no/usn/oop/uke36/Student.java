package no.usn.oop.uke36;

public class Student {
	String name;
	double score;
	
	Student(){
		name = "Ukjent";
		score = 0.0;
	}
	
	Student(String newName, double newScore){
		name = newName;
		score = newScore;
	}
	char getGrade() {
		if(score >= 90)
			return 'A';
		else if (score >= 80)
			return 'B';
		else if (score >= 70)
			return 'C';
		else 
			return 'F';
	}
	void printGrade() {
	
	}
}
