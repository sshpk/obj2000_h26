package no.usn.forelesning9.backup;

public class Book extends LibraryItem{
	private String author;
	
	public Book(String title, String author) {
		super(title);
		this.author = author;
	}
	@Override
	public double getLateFee(int daysLate) {
		return 5.0*daysLate;
	}
	
	@Override
	public String toString() {
		return super.getTitle() + " av "+author;
	}
}
