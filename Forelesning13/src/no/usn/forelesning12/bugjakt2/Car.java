package no.usn.forelesning12.bugjakt2;

public class Car extends Vehicle implements Rentable {
    private int numberOfDoors;

    public Car(String reg, String brand, double price, int doors) {
        super(reg, brand, price); // this constructor call was missing, that caused a compilation error
    	numberOfDoors = doors;
    }

    public double calculateRentalPrice(int days) {
        return getDailyPrice() * days;
    }
}
