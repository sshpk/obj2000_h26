package no.usn.forelesning10.quiz;


public class Book implements Comparable<Book>{
	private String title;
	private int pages;
	private Genre genre;

	public Book(String title, Genre genre, int pages) {
		if (pages <= 0) {
			throw new IllegalArgumentException("Ugyldig " + pages);
		}

		this.title = title;
		this.genre = genre;
		this.pages = pages;
	}
	public String getTitle() {
		return title;
	}
	public int getPages() {
		return pages;
	}
	@Override
	public String toString() {
		return title+"("+genre+", "+pages+" s.)";
	}
	@Override
	public int compareTo(Book other) {
		return pages - other.getPages();
	}
}
