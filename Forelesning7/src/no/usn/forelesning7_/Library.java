package no.usn.forelesning7_;


public class Library {
	private Book[] books = new Book [3];
	
	public Library() {
		books[0] = new Book("Kaffehuset", "Ola Nordmenn");
		books[1] = new Book("1984", "George Orwell");
		books[2] = new Book("Farenheit 451", "Ray Bradbury");
	}
	
	public Book findBookByName(String name) {
	    for (Book b : books) {
	        if (b.getName().equals(name)) {
	            return b;
	        }
	    }
	    return null;
	}

	
	public void sortBooksByName() {
	    for (int i = 0; i < books.length - 1; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j < books.length; j++) {
	            if (books[j].getName().compareTo(books[minIndex].getName()) < 0) {
	                minIndex = j;
	            }
	        }
	        Book temp = books[i];
	        books[i] = books[minIndex];
	        books[minIndex] = temp;
	    }
	}
	
	public void printBooks() {
		for(Book b:books) {
			System.out.print(b.getName());
			System.out.print(" ");
			System.out.print(b.getAuthor());
			System.out.println();
		}
	}
}
