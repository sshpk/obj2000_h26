package no.usn.forelesning12.eksamensoppskrift;

public class Book extends Item implements Loanable {
    private int pages;

    public Book(String title, int year, int pages) {
        super(title, year);               // alltid først
        this.pages = pages;
    }

    @Override
    public double getPrice() { return pages * 0.5; }

    @Override
    public int getLoanDays() { return 28; }

    @Override
    public String toString() {
        return super.toString() + ", " + pages + " sider";
    }
}
