package no.usn.forelesning5_;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Ola", 85.0);
		
		Student s2 = new Student ("oLA", 99.0);
		
		
		//System.out.println(s1.hasSameName(s2));
		
//		s1.print();
//		s2.print();
		
		//Scanner input = new Scanner(System.in);
		//s1.setScore(input);
		//s1.setScore2(input);
		//s1.print();
		
		//s1.printReport(3);
		
		Student s3 = new Student("Arthur");
		Student s4 = new Student();
		Student s5 = new Student (s3);
		s3.print();
		s4.print();
		s5.print();

	}

}
