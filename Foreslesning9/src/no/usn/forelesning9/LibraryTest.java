// Angir hvilken pakke klassen LibraryTest tilhører.
package no.usn.forelesning9;

// Definerer klassen som tester bibliotekselementene.
public class LibraryTest {

	// Programmets startpunkt.
	public static void main(String[] args) {
		// Oppretter en Book og lagrer objektet i en LibraryItem-variabel.
		LibraryItem book = new Book("Stormen", "Edvard Munch");

		// Denne linjen er kommentert ut fordi LibraryItem er abstrakt og ikke kan opprettes direkte.
		//ikke lov: LibraryItem item = new LibraryItem("Ukjent");

		// Oppretter en Film og lagrer objektet i en LibraryItem-variabel.
		LibraryItem film = new Film("Interstellar", 280);

		// Skriver ut informasjon om boka og gebyret for fem forsinkelsesdager.
		printLibraryItem(book);
		// Skriver ut informasjon om filmen og gebyret for fem forsinkelsesdager.
		printLibraryItem(film);

		// Oppretter en array som kan inneholde fire LibraryItem-variabeler.
		LibraryItem[] items = new LibraryItem[4];
		// Legger boka inn på første plass i tabellen.
		items[0] = book;
		// Legger filmen inn på andre plass i tabellen.
		items[1] = film;
		// Oppretter en e-bok og legger den inn på tredje plass.
		items[2] = new EBook("Kaffehuset", "Ola Nordmen");
		// Oppretter et magasin og legger det inn på fjerde plass.
		items[3] = new Magazine("Universitetsavisa", 1);

		// Beregner det samlede gebyret for alle elementene ved fem forsinkelsesdager.
		double lateFee = totalFee(items, 5);

		// Skriver ut det samlede gebyret.
		System.out.println(lateFee);
	}

	// Skriver ut tittelen og gebyret for et bibliotekselement etter fem forsinkelsesdager.
	public static void printLibraryItem(LibraryItem item) {
		// Skriver ut tittelen, forsinkelsen og gebyret.
		System.out.println(item.getTitle() + " is late 5 days, Late fee = "
				+ item.getLateFee(5) + " kr.");
	}

	// Beregner det samlede forsinkelsesgebyret for en tabell med bibliotekselementer.
	public static double totalFee(LibraryItem[] items, int lateDays) {
		// Starter summen på null.
		double sum = 0.0;
		// Går gjennom hvert element i tabellen.
		for (LibraryItem item : items) {
			// Legger elementets forsinkelsesgebyr til totalsummen.
			sum = sum + item.getLateFee(lateDays);
		}
		// Returnerer det samlede gebyret.
		return sum;
	}
}