package no.usn.forelesning12.bugjakt1;

import java.util.ArrayList;

public class Fleet {
    private static ArrayList<Car> rentalcars = new ArrayList<>();

    public static boolean removeCar(String reg) {
        boolean found = false;
        for (Car c : rentalcars) {
            if (c.getRegistrationNumber().equals(reg)) {
                rentalcars.remove(c);
                found = true;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        rentalcars.add(new Car("AB12345", "Toyota", 650.0, 4));
        rentalcars.add(new Car("CD67890", "Volvo", 800.0, 5));
        rentalcars.add(new Car("EF24680", "Kia", 550.0, 5));
        System.out.println(removeCar("AB12345"));
    }
}
