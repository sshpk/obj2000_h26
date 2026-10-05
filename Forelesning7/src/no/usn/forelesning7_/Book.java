package no.usn.forelesning7_;

public class Book {
	private String name;
	private String author;
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
}
