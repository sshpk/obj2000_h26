package no.usn.forelesning13.eksamensoppskrift;

public abstract class Item {
    private String title;
    private int year;

    public Item(String title, int year) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Tittel mangler.");
        }
        this.title = title;
        this.year = year;
    }

    public String getTitle() { return title; }
    public int getYear() { return year; }

    public abstract double getPrice();

    @Override
    public String toString() {
        return title + " (" + year + ")";
    }
}
