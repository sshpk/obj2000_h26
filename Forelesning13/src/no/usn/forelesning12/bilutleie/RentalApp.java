package no.usn.forelesning12.bilutleie;

import java.util.ArrayList;

public class RentalApp {
    private static ArrayList<Car> rentalcars = new ArrayList<>();   // op2 a

    public static void addcar(Car car) {                              // op2 a
        rentalcars.add(car);
    }

    public static void displayCars() {                                // op2 b
        for (Car c : rentalcars) {
            System.out.println(c.getBrand() + ": " + c.getDailyPrice() + " kr per dag");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("AB12345", "Toyota", 650.0, 4);            // op1 e
        System.out.println(car);
        System.out.println("Leie i 3 dager: " + car.calculateRentalPrice(3));   // op1 c
        Customer kari = new Customer("K1", "Kari Nordmann", "99887766");        // op1 d
        System.out.println(kari);
        Car sameReg = new Car("AB12345", "Toyota", 700.0, 5);
        System.out.println("Samme bil? " + car.equals(sameReg));    // op1 a

        addcar(car);                                                  // op2 a
        addcar(new Car("CD67890", "Volvo", 800.0, 5));
        displayCars();                                                // op2 b
    }
}
