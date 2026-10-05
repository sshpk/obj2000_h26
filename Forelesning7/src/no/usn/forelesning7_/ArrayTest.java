package no.usn.forelesning7_;

public class ArrayTest {

	public static void main(String[] args) {
		//deklarere og opprette
		Student[] students = new Student[3];
		
		//fylle
		students[0] = new Student("Ola", 85.5);
		students[1] = new Student("Kari", 76.4);
		students[2] = new Student("Per", 90.0);
		
		//behandle
//		System.out.println(students[0].getName());
//		System.out.println(students[1].getName());
//		System.out.println(students[2].getName());
//		
//		//System.out.println(students.length);
//		for(int i = 0; i< students.length; i++) {
//			System.out.println(students[i].getName());
//		}

//		for(Student s:students) {
//			System.out.println(s.getName());
//		}
		
//		double sum = 0.0;
//		for(Student s:students) {
//			sum = sum + s.getScore();
//		}
//		
//		double average = sum/students.length;
//		System.out.println("Gjennomsnitlig poengsum = "+average);
		
		
//		Student best = students[0];
//		for(Student s:students) {
//			if(s.getScore()>best.getScore()) {
//				best = s;
//			}
//		}	
//		System.out.println("Best er "+best.getName());
//		System.out.println("Høyest poengsum = "+best.getScore());
		
//		Student s = findStudent(students, "Kari");
//		if(s!=null) {
//			System.out.println("Funnet");
//			System.out.println(s.getScore());
//		}
//		else {
//			System.out.println("Ikke funnet");
//		}
		
		for(int i =0; i<students.length-1; i++) {
			int minIndex = i;
			for(int j = i; j < students.length; j++) {
				if(students[j].getScore() < students[minIndex].getScore()) {
					minIndex = j;
				}
			}
			Student temp = students[i];
			students [i] = students[minIndex];
			students[minIndex] = temp;
		}
		
		for(Student s:students) {
			System.out.print(s.getName());
			System.out.print(s.getScore());
			System.out.println();
		}
			
	}
	
	public static Student findStudent(Student[] arr, String name) {
		for(Student s:arr) {
			if(s.getName().equals(name))
				return s;
		}
		return null;
	}
	

}
