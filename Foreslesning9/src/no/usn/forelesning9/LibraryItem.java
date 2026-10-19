package no.usn.forelesning9;

//Definerer en abstrakt klasse for elementer som kan finnes i et bibliotek.
public abstract class LibraryItem {
	// Lagrer tittelen på bibliotekselementet.
	private String title;
	// Angir om elementet er tilgjengelig; nye elementer er tilgjengelige som standard.
	private boolean available = true;

	// Konstruktør som tar imot tittelen på elementet.
	public LibraryItem(String title) {
		// Setter tittelen til verdien som ble sendt inn.
		this.title = title;
	}

	// Returnerer tittelen på elementet.
	public String getTitle() {
		// Sender tittelen tilbake.
		return title;
	}

	// Registrerer at elementet blir lånt ut.
	public void checkOut() {
		// Setter tilgjengeligheten til false fordi elementet ikke lenger er tilgjengelig.
		available = false;
	}

	// Registrerer at elementet blir levert tilbake.
	public void returnItem() {
		// Setter tilgjengeligheten til true fordi elementet er tilgjengelig igjen.
		available = true;
	}

	// Sjekker om elementet er tilgjengelig.
	public boolean isAvailable() {
		// Sender tilbake verdien som angir om elementet er tilgjengelig.
		return available;
	}

	// Deklarerer en abstrakt metode som underklassene må implementere.
	public abstract double getLateFee(int daysLate);
}
