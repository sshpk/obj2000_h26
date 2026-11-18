package no.usn.forelesning13.cinestream;

import java.util.List;

// Forutsetning: FeatureFilmStream arver fra FeatureFilm, som arver fra
// FilmContent. Da utvider den FilmContent og får play() og displayDetails()
// med på kjøpet.
public class FeatureFilmStream extends FeatureFilm implements Streamable {

    public FeatureFilmStream(String title, int duration, String genre, double rating,
                             String director, List<String> cast) {
        super(title, duration, genre, rating, director, cast);
    }

    @Override
    public void streamContent() {
        System.out.println("Streaming film...");
    }

    @Override
    public void displayStreamingInfo() {
        System.out.println("Film stream info...");
    }
}
