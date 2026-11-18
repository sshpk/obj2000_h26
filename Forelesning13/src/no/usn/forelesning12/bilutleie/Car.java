package no.usn.forelesning12.bilutleie;

public class Car extends Vehicle implements Rentable {
    private int numberOfDoors;

    public Car(String registrationNumber, String brand,
               double dailyPrice, int numberOfDoors) {
        super(registrationNumber, brand, dailyPrice);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public double calculateRentalPrice(int numberOfDays) {
        return getDailyPrice() * numberOfDays;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + numberOfDoors + " dører";
    }
}
