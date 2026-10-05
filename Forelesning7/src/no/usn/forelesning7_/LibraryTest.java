package no.usn.forelesning7_;

public class LibraryTest {

	public static void main(String[] args) {
		Library library = new Library();
		
		Book b = library.findBookByName("1984");
		if(b!=null) {
			System.out.println("Funnet boka");
			System.out.println("Den er skrevet av "+b.getAuthor());
		}
		else {
			System.out.println("Kunne ikke finne boka du leter etter.");
		}

		library.sortBooksByName();
		library.printBooks();
	}

}
