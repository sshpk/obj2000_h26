package no.usn.forelesning12;

public class Book implements Comparable<Book> {
    private String title;
    private Genre genre;
    private int pages;

    public Book(String title, Genre genre, int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException(
                    "Sider må være over 0, fikk " + pages);
        }
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public int compareTo(Book other) {
        return getTitle().compareTo(other.getTitle());
    }

    @Override
    public String toString() {
        return title + " (" + genre + ", " + pages + " s.)";
    }
}

