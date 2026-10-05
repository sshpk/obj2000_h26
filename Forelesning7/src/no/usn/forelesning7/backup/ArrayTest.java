package no.usn.forelesning7.backup;

public class ArrayTest {

	public static void main(String[] args) {
		//deklarere og opprette en array
		Student[] students = new Student[3];

		//fylle arrayen
		students[0] = new Student("Ola",85.0);
		students[1] = new Student("Kari", 88.5);
		students[2] = new Student("Per", 67.0);

		//behandle arrayen
		System.out.println(students[0].getName());
		System.out.println(students[1].getName());
		System.out.println(students[2].getName());

		double sum = 0;
		for(Student s:students) {
			sum += s.getScore();
		}
		double average = sum/students.length;
		System.out.println(average);

		Student best = students[0];
		for(Student s:students) {
			if(s.getScore()>best.getScore())
				best = s;
		}
		System.out.println("Den beste student er: "+best.getName());
	
//		Student[] a = students; 
//		a[0] = new Student("Mia", 99); 
//		
//		System.out.println(students[0].getName());
//		
//		String name = "Kari";
//		Student s = findStudent(students, name);
//		if(s!=null)
//			System.out.println(s.getScore());
//		else
//			System.out.println("Did not find a student with name: "+name);
	
		for (int i = 0; i < students.length - 1; i++) {
		    int minIndex = i;
		    for (int j = i + 1; j < students.length; j++) {
		        if (students[j].getScore() < students[minIndex].getScore()) {
		            minIndex = j;
		        }
		    }
		    Student temp = students[i];
		    students[i] = students[minIndex];
		    students[minIndex] = temp;
		}
		for(Student s:students) {
			System.out.println(s.getName());
		}
	}
	
	public static Student findStudent(Student[] arr, String name) {
		for (Student s: arr) {
			if(s.getName().equals(name))
				return s;
		}
		return null;
	}
}
