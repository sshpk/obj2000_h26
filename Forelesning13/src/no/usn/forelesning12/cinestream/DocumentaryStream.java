package no.usn.forelesning12.cinestream;

public class DocumentaryStream extends Documentary implements Streamable {

    public DocumentaryStream(String title, int duration, String genre, double rating,
                             String subject, int productionYear) {
        super(title, duration, genre, rating, subject, productionYear);
    }

    @Override
    public void streamContent() {
        System.out.println("Streaming documentary...");
    }

    @Override
    public void displayStreamingInfo() {
        System.out.println("Documentary stream info...");
    }
}
