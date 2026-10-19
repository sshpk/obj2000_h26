package no.usn.forelesning9;

//Definerer klassen EBook som en type Book.
public class EBook extends Book {
	// Konstruktør som tar imot e-boktittel og forfatternavn.
	public EBook(String title, String author) {
		// Kaller konstruktøren i superklassen Book.
		super(title, author);
	}

	// Angir at denne metoden overstyrer metoden fra Book.
	@Override
	// Beregner gebyret for en forsinket e-bok.
	public double getLateFee(int daysLate) {
		// E-bøker har ikke forsinkelsesgebyr.
		return 0;
	}
}
