package no.usn.forelesning10.backup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Catalog {

    // Nivå 1 fra timen: leser bibliotek.txt og lager én Book per linje.
    public static ArrayList<Book> readBooks(String fileName) {
        ArrayList<Book> books = new ArrayList<>();
        try (Scanner in = new Scanner(new File(fileName))) {
            int count = Integer.parseInt(in.nextLine().trim());
            for (int i = 0; i < count; i++) {
                String[] parts = in.nextLine().split(";");
                String title = parts[0];
                Genre genre = Genre.valueOf(parts[1]);
                int pages = Integer.parseInt(parts[2]);
                books.add(new Book(title, genre, pages));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fant ikke filen: " + fileName);
        }
        return books;
    }

    // Forbedret versjon: én dårlig linje stopper ikke alt.
    public static ArrayList<Book> readBooksSafe(String fileName) {
        ArrayList<Book> books = new ArrayList<>();
        try (Scanner in = new Scanner(new File(fileName))) {
            int count = Integer.parseInt(in.nextLine().trim());
            for (int i = 0; i < count; i++) {
                String line = in.nextLine();
                try {
                    String[] parts = line.split(";");
                    Genre genre = Genre.valueOf(parts[1]);
                    int pages = Integer.parseInt(parts[2]);
                    books.add(new Book(parts[0], genre, pages));
                } catch (IllegalArgumentException e) {
                    System.out.println("Hoppet over: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fant ikke filen: " + fileName);
        }
        return books;
    }

    public static void main(String[] args) {
    	System.out.println(new File("data.txt").getAbsolutePath());

    	
    	ArrayList<Book> books = readBooks("bibliotek.txt");
        System.out.println("Antall bøker: " + books.size());
        Collections.sort(books);
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println();
        ArrayList<Book> fromBadFile = readBooksSafe("bibliotek_feil.txt");
        System.out.println("Antall bøker: " + fromBadFile.size());
    }
}
