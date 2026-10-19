package no.usn.forelesning9.backup;

public class StudentTest {

	public static void main(String[] args) {
		Student ola = new Student("Ola", 85);
		MasterStudent kari = new MasterStudent("Kari", 92, "Robotsyn");
		
		Student[] students = new Student[2];
		students[0] = ola;
		students[1] = kari;
		for (Student s : students) {
		    System.out.println(s.getName() + ": " + s.getLoanDays() + " dager");
		}
		
		Student s = new MasterStudent("Kari", 92, "Robotsyn");
		System.out.println(s.getLoanDays());
		if (s instanceof MasterStudent g) {
		     System.out.println(g.getThesisTitle());   // Robotsyn
		}


	}

}
