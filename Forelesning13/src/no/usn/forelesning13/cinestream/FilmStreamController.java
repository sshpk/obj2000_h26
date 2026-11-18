package no.usn.forelesning13.cinestream;

import java.util.ArrayList;

public class FilmStreamController {
    private ArrayList<Streamable> streamableFilms = new ArrayList<>();

    public void addFilm(Streamable stream) {
        streamableFilms.add(stream);
    }

    public Streamable findFilm(String title) {
        for (Streamable s : streamableFilms) {
            // Streamable har ingen getTitle(), derfor cast:
            FilmContent f = (FilmContent) s;
            if (f.getTitle().equalsIgnoreCase(title)) {
                return s;
            }
        }
        return null;
    }

    public boolean removeFilm(String title) {
        Streamable s = findFilm(title);
        if (s == null) {
            return false;
        }
        streamableFilms.remove(s);
        return true;
    }

    public void listAllFilms() {
        for (Streamable s : streamableFilms) {
            FilmContent f = (FilmContent) s;
            f.displayDetails();
        }
    }

    public boolean streamFilm(String title) {
        Streamable s = findFilm(title);
        if (s == null) {
            return false;
        }
        s.streamContent();
        return true;
    }

    // Ekstra (ikke i oppgaven): tell og summer
    public int countDocumentaries() {
        int count = 0;
        for (Streamable s : streamableFilms) {
            if (s instanceof Documentary) {
                count++;
            }
        }
        return count;
    }

    public int totalDuration() {
        int sum = 0;
        for (Streamable s : streamableFilms) {
            FilmContent f = (FilmContent) s;
            sum += f.getDuration();
        }
        return sum;
    }
}
