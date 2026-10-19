package no.usn.forelesning9;

//Definerer klassen Magazine som en type LibraryItem.
public class Magazine extends LibraryItem {
	// Lagrer nummeret på magasinutgaven.
	private int issue;

	// Konstruktør som tar imot magasintittel og utgavenummer.
	public Magazine(String title, int issue) {
		// Kaller konstruktøren i superklassen med magasintittelen.
		super(title);

		// Setter utgavenummeret til verdien som ble sendt inn.
		this.issue = issue;
	}

	// Angir at denne metoden implementerer metoden fra LibraryItem.
	@Override
	// Beregner gebyret for et forsinket magasin.
	public double getLateFee(int daysLate) {
		// Beregner gebyret som 2 kroner per forsinkelsesdag.
		return daysLate * 2.0;
	}

}
