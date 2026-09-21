package no.usn.forelesning6_;

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
	public void checkout() {
		if(available==true)
			available = false;
	}
	
	public void returnBook() {
		available = true;
	}
}
