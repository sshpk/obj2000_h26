package no.usn.forelesning5.backup;

public class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
        this("Ukjent", 0);
    }

    public String getName() {
        return name;
    }
    public void setScore(double score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        }
    }
 	public double getScore() {
		return score;
	}
 	public long getRoundedScore() {
 		return Math.round(score);
 	}
 	public boolean hasSameName(Student other) {
 		return name.equalsIgnoreCase(other.getName());
 	}
}
