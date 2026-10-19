package no.usn.forelesning9;

//Definerer klassen Book som en type LibraryItem.
public class Book extends LibraryItem {

	// Lagrer navnet på forfatteren.
	private String author;

	// Konstruktør som tar imot boktittel og forfatternavn.
	public Book(String title, String author) {
		// Kaller konstruktøren i superklassen med boktittelen.
		super(title);
		// Setter forfatteren til verdien som ble sendt inn.
		this.author = author;
	}

	// Angir at denne metoden implementerer metoden fra LibraryItem.
	@Override
	// Beregner gebyret for en forsinket bok.
	public double getLateFee(int daysLate) {
		// Beregner gebyret som 5 kroner per forsinkelsesdag.
		return daysLate * 5.0;
	}

}
