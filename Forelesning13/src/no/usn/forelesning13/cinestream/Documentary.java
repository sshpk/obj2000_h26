package no.usn.forelesning13.cinestream;

public class Documentary extends FilmContent {
    private String subject;
    private int productionYear;

    public Documentary(String title, int duration, String genre, double rating,
                       String subject, int productionYear) {
        super(title, duration, genre, rating);
        this.subject = subject;
        this.productionYear = productionYear;
    }

    @Override
    public void play() {
        System.out.println("Spiller dokumentaren " + getTitle());
    }

    @Override
    public void displayDetails() {
        System.out.println(getTitle() + " (" + getDuration() + " min, " + getGenre()
                + ", vurdering " + getRating() + ")");
        System.out.println("  Emne: " + subject + ", produsert " + productionYear);
    }
}
