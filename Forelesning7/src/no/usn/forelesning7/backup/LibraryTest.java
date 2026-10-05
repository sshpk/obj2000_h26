package no.usn.forelesning7.backup;

public class LibraryTest {

	public static void main(String[] args) {
		Library lib = new Library();
		Book b = lib.findByTitle("1984");
		if(b!=null)
			System.out.println("funnet!");
		lib.sortByTitle();
		lib.printBooks();
	}

}
