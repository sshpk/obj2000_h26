package no.usn.forelesning12.eksamensoppskrift;

public class LibraryApp {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addItem(new Book("Stormen", 2020, 350));
        lib.addItem(new Dvd("Havet", 2019, 90));
        try {
            lib.addItem(new Book("", 2021, 100)); // feiltilfelle
        } catch (IllegalArgumentException e) {
            System.out.println("Feil: " + e.getMessage());
        }
        lib.readBooks("boker.txt");
        lib.printAll();
        System.out.println("Bøker: " + lib.countBooks());
        System.out.println("Sum: " + lib.totalPrice());
        System.out.println("Fjernet: " + lib.removeItem("Havet"));
    }
}
