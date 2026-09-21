package no.usn.forelesning6.backup;

public class Person {
	private Heart heart;
	private Brain brain;
	public Person() {
		heart = new Heart();
		brain = new Brain();
	}
	public Brain getBrain() {
		return brain;
	}
	public Heart getHeart() {
		return heart;
	}
}
