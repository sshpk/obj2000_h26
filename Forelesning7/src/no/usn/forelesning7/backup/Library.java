package no.usn.forelesning7.backup;

public class Library {
    private Book [] books = new Book [3];

    public Library(){
		books[0] = new Book("Kaffehuset", "Ola Nordmenn");
		books[1] = new Book("1984", "George Orwell");
		books[2] = new Book("Farenheit 451", "Ray Bradbury");
    }
    public Book findByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                return b;
            }
        }
        return null;
    }
    public void sortByTitle() {
        for (int i = 0; i < books.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < books.length; j++) {
                if (books[j].getTitle().compareTo(books[minIndex].getTitle()) < 0) {
                    minIndex = j;
                }
            }
            Book temp = books[i];
            books[i] = books[minIndex];
            books[minIndex] = temp;
        }
    }
    public void printBooks() {
    	for(Book b: books) {
    		System.out.println(b.getTitle());
    	}
    }
} 

