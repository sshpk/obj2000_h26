package no.usn.forelesning6.backup;

public class Book {
	private String title;
	private String author;
	private boolean available;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		available = true;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}

	public void checkOut() {
		if(available)
			available = false;
	}
	
	public void returnBook() {
		available = true;
	}
}
