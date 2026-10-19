package no.usn.forelesning9.backup;

public abstract class LibraryItem implements Borrowable, Comparable<LibraryItem> {
	private String title;
	private boolean available = true;
	
	public LibraryItem(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public void checkOut() {
		available = false;
	}
	
	public void returnItem() {
		available = true;
	}
	
	@Override
	public int compareTo(LibraryItem other) {
	    return getTitle().compareTo(other.getTitle());
	}
	public abstract double getLateFee(int daysLate);
}
