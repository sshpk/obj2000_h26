package no.usn.forelesning9;

//Definerer en offentlig klasse kalt PhDStudent som arver fra Student.
public class PhDStudent extends Student {

	// Konstruktør som tar imot studentens navn og poengsum.
	public PhDStudent(String name, double score) {
		// Kaller konstruktøren i superklassen Student med navn og poengsum.
		super(name, score);
	}

	// Angir at denne metoden overstyrer metoden fra superklassen.
	@Override
	// Returnerer hvor mange dager en PhD-student kan låne en bok.
	public int getLoanDays() {
		// PhD-studenter kan låne en bok i 60 dager.
		return 60;
	}
}
