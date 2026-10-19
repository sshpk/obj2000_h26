package no.usn.forelesning9.backup;

public class MasterStudent extends Student{
	String thesisTitle;
	public MasterStudent(String name, double score, String thesisTitle) {
		super(name, score);
		this.thesisTitle = thesisTitle;
	}
	public String getThesisTitle() {
		return thesisTitle;
	}

	int getLoanDays() {
		return 30;
	}
}
