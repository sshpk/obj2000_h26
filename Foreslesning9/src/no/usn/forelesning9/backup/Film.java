package no.usn.forelesning9.backup;

public class Film extends LibraryItem{
	private int minutes;
	public Film(String title, int minutes) {
		super(title);
		this.minutes = minutes;
	}
	
	@Override
	public double getLateFee(int daysLate) {
		return 20.0*daysLate;
	}
}
