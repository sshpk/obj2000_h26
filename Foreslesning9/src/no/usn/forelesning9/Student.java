package no.usn.forelesning9;

//Definerer en offentlig klasse som heter Student.
public class Student {
	// Lagrer studentens navn.
	String name;
	// Lagrer studentens poengsum.
	double score;

	// Konstruktør som tar imot navn og poengsum når et Student-objekt opprettes.
	public Student(String name, double score) {
		// Setter studentens navn til verdien som ble sendt inn.
		this.name = name;
		// Setter studentens poengsum til verdien som ble sendt inn.
		this.score = score;
	}

	// Returnerer studentens navn.
	public String getName() {
		// Sender navnet tilbake til den som kalte metoden.
		return name;
	}

	// Returnerer studentens poengsum.
	public double getScore() {
		// Sender poengsummen tilbake til den som kalte metoden.
		return score;
	}

	// Returnerer hvor mange dager studenten kan låne en bok.
	int getLoanDays() {
		// Vanlige studenter kan låne en bok i 14 dager.
		return 14;
	}
}

