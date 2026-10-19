package no.usn.forelesning9;

//Definerer MasterStudent som en underklasse av Student.
public class MasterStudent extends Student {
	// Lagrer tittelen på masteroppgaven.
	private String thesisTitle;

	// Konstruktør som tar imot navn, poengsum og tittel på masteroppgaven.
	public MasterStudent(String name, double score, String thesisTitle) {
		// Kaller konstruktøren i superklassen Student med navn og poengsum.
		super(name, score);

		// Setter tittelen på masteroppgaven.
		this.thesisTitle = thesisTitle;
	}

	// Returnerer tittelen på masteroppgaven.
	public String getThesisTitle() {
		// Sender oppgavetittelen tilbake til den som kalte metoden.
		return thesisTitle;
	}

	// Angir at denne metoden overstyrer metoden fra superklassen.
	@Override
	// Returnerer hvor mange dager en masterstudent kan låne en bok.
	public int getLoanDays() {
		// Masterstudenter kan låne en bok i 30 dager.
		return 30;
	}
}