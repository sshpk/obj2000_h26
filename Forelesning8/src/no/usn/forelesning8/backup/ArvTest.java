package no.usn.forelesning8.backup;

public class ArvTest {
	public static void main(String[] args) {
		MasterStudent g = new MasterStudent("Kari", 92, "Robotsyn");
		System.out.println(g.getName());    
		System.out.println(g.getScore());
		System.out.println(g.getThesisTitle());
	}
}
