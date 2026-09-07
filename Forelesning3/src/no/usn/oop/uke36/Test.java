package no.usn.oop.uke36;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student("Ola", 85.0);
		
		Student s2 = new Student("Kari", 93.0);
		
		System.out.println("name: "+s1.name+", grade: "+s1.getGrade());
		
		System.out.println("name: "+s2.name+", garde: "+s2.getGrade());
		
		Student s3 = new Student();
		System.out.println(s3.name);

	}

}
