package no.usn.forelesning9;

//Definerer klassen som inneholder programmets testkode.
public class StudentTest {
	// Programmets startpunkt.
	public static void main(String[] args) {
		// Oppretter en vanlig student som heter Ola, med poengsummen 88,0.
		Student ola = new Student("Ola", 88.0);

		// Oppretter Kari som en MasterStudent, men linjen er kommentert ut.
		//MasterStudent kari = new MasterStudent("Kari", 90.0, "Robotsyn");

		// Oppretter en MasterStudent, men lagrer objektet i en Student-variabel.
		Student kari = new MasterStudent("Kari", 90.0, "Robotsyn");

		// Skriver ut Olas navn og antall lånedager, men linjen er kommentert ut.
		//System.out.println(ola.getName() + " kan ha boka i "+ola.getLoanDays()+" dager");

		// Skriver ut Karis navn og antall lånedager, men linjen er kommentert ut.
		//		System.out.println(kari.getName() + " kan ha boka i "+kari.getLoanDays()+" dager");

		// Skriver ut hash-koden til Kari, men linjen er kommentert ut.
		//		System.out.println(kari.hashCode());
		// Kommentert ut tom linje.
		//
		// Oppretter en PhDStudent og lagrer objektet i en Student-variabel.
		Student per = new PhDStudent("Per", 70.0);

		// Kaller printStudent med Kari som argument.
		printStudent(kari);
		// Kaller printStudent med Ola som argument.
		printStudent(ola);
		// Kaller printStudent med Per som argument.
		printStudent(per);

	}

	// Definerer en metode som skriver ut studentens navn og lånetid.
	public static void printStudent(Student s) {
		// Skriver studentens navn og hvor mange dager studenten kan låne boka.
		System.out.println(s.getName() + " kan ha boka i " + s.getLoanDays() + " dager");
	}

}
