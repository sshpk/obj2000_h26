package no.usn.forelesning5.backup;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Ola", 85);
		System.out.println(s1.getRoundedScore());
		
		Student s2 = new Student("oLA", 87);
		System.out.println(s1.hasSameName(s2));
	}
	
	  static void giBonus(Student x) {
	        x.setScore(x.getScore() + 10);
	  }
	  static void reset(Student x) {
		    x = new Student("Ny", 0);
	  }
	  
}
