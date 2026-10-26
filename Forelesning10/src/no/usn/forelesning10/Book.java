package no.usn.forelesning10;

public class Book implements Comparable<Book>{
	private String title;
	private int pages;
	private Genre genre;
	
	public Book(String title, Genre genre, int pages) {
		if(pages<=0) {
			throw new IllegalArgumentException("Sider må være over 0, fikk:"+pages);
		}	
		this.title = title;
		this.genre = genre;
		this.pages = pages;
	}
	
	public Genre getGenre() {
		return genre;
	}
	public String getTitle() {
		return title;
	}
	
	public int getPages() {
		return pages;
	}
	
	@Override
	public String toString() {
		return title+"("+pages+"s., "+genre+")";
	}
	
	public int compareTo(Book other) {
		int result;
		result = title.compareTo(other.getTitle());
		return result;
	}
}
