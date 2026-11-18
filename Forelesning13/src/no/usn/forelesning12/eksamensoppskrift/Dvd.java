package no.usn.forelesning12.eksamensoppskrift;

public class Dvd extends Item {
    private int minutes;

    public Dvd(String title, int year, int minutes) {
        super(title, year);
        this.minutes = minutes;
    }

    @Override
    public double getPrice() { return 99; }
}
