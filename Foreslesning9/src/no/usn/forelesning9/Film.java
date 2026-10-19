package no.usn.forelesning9;

//Definerer klassen Film som en type LibraryItem.
public class Film extends LibraryItem {

	// Lagrer filmens lengde i minutter.
	private int minutes;

	// Konstruktør som tar imot filmtittel og lengde i minutter.
	public Film(String title, int minutes) {
		// Kaller konstruktøren i superklassen med filmtittelen.
		super(title);
		// Setter filmens lengde til verdien som ble sendt inn.
		this.minutes = minutes;
	}

	// Angir at denne metoden implementerer metoden fra LibraryItem.
	@Override
	// Beregner gebyret for en forsinket film.
	public double getLateFee(int daysLate) {
		// Beregner gebyret som 20 kroner per forsinkelsesdag.
		return daysLate * 20.0;
	}
}
