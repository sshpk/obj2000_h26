package no.usn.forelesning8_;

public class ArvTest {

	public static void main(String[] args) {
		MasterStudent m = new MasterStudent("Kari", 88, "Robot syn");
		
		System.out.println(m.getName());
		System.out.println(m.getScore());
		
		System.out.println(m.getThesisTitle());
		
		Student s = new Student("Ola", 85);
		
		System.out.println(m.getLoanDays());
		System.out.println(s.getLoanDays());
		
		System.out.println(s.toString());
		System.out.println(m);
	}

}
