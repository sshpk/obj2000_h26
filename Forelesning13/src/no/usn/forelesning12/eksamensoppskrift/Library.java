package no.usn.forelesning12.eksamensoppskrift;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("item er null.");
        }
        items.add(item);
    }

    public Item findItem(String title) {
        for (Item i : items) {
            if (i.getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }
        return null;                      // ETTER løkken
    }

    public boolean removeItem(String title) {
        Item i = findItem(title);         // finn først ...
        if (i == null) {
            return false;
        }
        items.remove(i);                  // ... fjern etterpå
        return true;
    }

    public int countBooks() {
        int count = 0;                    // før løkken
        for (Item i : items) {
            if (i instanceof Book) {
                count++;                  // inni løkken
            }
        }
        return count;                     // etter løkken
    }

    public double totalPrice() {
        double sum = 0;
        for (Item i : items) {
            sum += i.getPrice();
        }
        return sum;
    }

    public void printAll() {
        for (Item i : items) {
            System.out.println(i);        // kaller toString()
        }
    }

    public void readBooks(String fileName) {
        try (Scanner in = new Scanner(new File(fileName))) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                try {
                    String[] parts = line.split(";");
                    int year = Integer.parseInt(parts[1]);
                    int pages = Integer.parseInt(parts[2]);
                    addItem(new Book(parts[0], year, pages));
                } catch (IllegalArgumentException e) {
                    System.out.println("Hoppet over: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fant ikke filen: " + fileName);
        }
    }
}
