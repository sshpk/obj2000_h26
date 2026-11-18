package no.usn.forelesning12.bilutleie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CarReader {
    public static ArrayList<Car> readCars(String fileName) {
        ArrayList<Car> cars = new ArrayList<>();
        try (Scanner in = new Scanner(new File(fileName))) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                try {
                    String[] parts = line.split(";");
                    double price = Double.parseDouble(parts[2]);
                    int doors = Integer.parseInt(parts[3]);
                    cars.add(new Car(parts[0], parts[1], price, doors));
                } catch (IllegalArgumentException e) {
                    System.out.println("Hoppet over: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fant ikke filen: " + fileName);
        }
        return cars;
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = readCars("biler.txt");
        for (Car c : cars) {
            System.out.println(c);
        }
        readCars("finnesikke.txt");
    }
}
