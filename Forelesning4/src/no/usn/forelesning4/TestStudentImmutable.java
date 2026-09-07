package no.usn.forelesning4;

import java.util.Date;

public class TestStudentImmutable {

	public static void main(String[] args) {
		StudentImmutable s1 = new StudentImmutable("Ola", 85.0);
		Date d = s1.getDateCreated();
		d.setTime(100000);
		
		Date d2 = s1.getDateCreated();
		
		System.out.println(d2.getTime());
		
	}

}
