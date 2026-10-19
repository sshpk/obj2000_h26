package no.usn.forelesning9.backup;

public interface Borrowable {
    void checkOut();
    void returnItem();
    boolean isAvailable();
}
