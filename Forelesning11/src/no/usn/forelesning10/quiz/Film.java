package no.usn.forelesning10.quiz;

public class Film {
	String name;
	FilmGenre genre;
	int minutes;
	public Film(String name, FilmGenre genre, int minutes) {
		this.name = name;
		this.genre = genre;
		this.minutes = minutes;
	}
	public String getName() {
		return name;
	}
	public FilmGenre getGenre() {
		return genre;
	}
	public int getMinutes() {
		return minutes;
	}

}
