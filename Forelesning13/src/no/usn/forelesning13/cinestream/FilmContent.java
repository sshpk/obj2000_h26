package no.usn.forelesning13.cinestream;

public abstract class FilmContent {
    private String title;
    private int duration;      // minutter
    private String genre;
    private double rating;

    public FilmContent(String title, int duration, String genre, double rating) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public abstract void play();

    public abstract void displayDetails();
}
