package no.usn.forelesning8_;

public class MasterStudent extends Student{
	private String thesisTitle;
	
	public MasterStudent(String name, double score, String thesisTitle) {
		super(name, score);
		this.thesisTitle = thesisTitle;
	}
	
	public String getThesisTitle() {
		return thesisTitle;
	}
	
	@Override
	public int getLoanDays() {
		return 30;
	}
	
	@Override
	public String toString() {
		String x = super.toString();
		x = x +" masteroppgave: "+thesisTitle;
		
		return x;
	}
}