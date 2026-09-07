package no.usn.forelesning4;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Ola", 85.0);
		Student s2 = new Student("Kari", 93.0);
		
//		System.out.println(s1.getName()+s1.getScore());
//		System.out.println(s1.getNumberOfStudents());
//		
//		System.out.println(s2.getName()+s2.getScore());
//		System.out.println(s2.getNumberOfStudents());
//		
//		System.out.println(Student.getNumberOfStudents());
//		
//		s1.setScore(90);
//		System.out.println(s1.getScore());
//		
//		Student s3 = new Student();
//		System.out.println(s3.getName());
		
		swap2(s1,s2);
		System.out.println(s1.getName());

	}
	
	public static void swap(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}
	
	public static void swap2(Student x, Student y) {
		String tempName = x.getName();
		double tempScore = x.getScore();
		
		x.setScore(y.getScore());
		x.setName(y.getName());
		
		y.setScore(tempScore);
		y.setName(tempName);
	}

}
