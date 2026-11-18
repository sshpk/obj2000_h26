package no.usn.forelesning13.cinestream;

import java.util.List;

public class FeatureFilm extends FilmContent {
    private String director;
    private List<String> cast;

    public FeatureFilm(String title, int duration, String genre, double rating,
                       String director, List<String> cast) {
        super(title, duration, genre, rating);
        this.director = director;
        this.cast = cast;
    }

    @Override
    public void play() {
        System.out.println("Spiller spillefilmen " + getTitle());
    }

    @Override
    public void displayDetails() {
        System.out.println(getTitle() + " (" + getDuration() + " min, " + getGenre()
                + ", vurdering " + getRating() + ")");
        System.out.println("  Regi: " + director + ", roller: " + cast);
    }
}
