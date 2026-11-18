package no.usn.forelesning13.cinestream;

import java.util.ArrayList;

public class CineStreamApp {
    public static void main(String[] args) {
        ArrayList<String> cast = new ArrayList<>();
        cast.add("Ola Berg");
        cast.add("Sara Nilsen");

        FilmStreamController c = new FilmStreamController();
        c.addFilm(new FeatureFilmStream("Fjellsprekken", 105, "Action", 4.2, "Ingrid Lund", cast));
        c.addFilm(new DocumentaryStream("Havets hemmeligheter", 52, "Natur", 4.6, "Havet", 2023));

        c.listAllFilms();
        System.out.println("Dokumentarer: " + c.countDocumentaries());
        System.out.println("Total lengde: " + c.totalDuration() + " min");
        System.out.println(c.streamFilm("Fjellsprekken"));
        System.out.println(c.streamFilm("Finnes ikke"));
        System.out.println(c.removeFilm("Fjellsprekken"));
        System.out.println(c.removeFilm("Fjellsprekken"));
        c.listAllFilms();
    }
}
