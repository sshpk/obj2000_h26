package no.usn.forelesning4;
import java.util.Date;

public class StudentImmutable {
	private String name;
	private double score;
	private Date dateCreated;
	
	public StudentImmutable(String name, double score) {
		this.name = name;
		this.score = score;
		dateCreated = new Date();
	}
	
	public Date getDateCreated() {
		Date returnDate = new Date(dateCreated.getTime());
		return returnDate;
	}
	
}
