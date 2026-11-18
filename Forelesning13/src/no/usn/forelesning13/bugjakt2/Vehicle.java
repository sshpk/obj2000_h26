package no.usn.forelesning13.bugjakt2;

public class Vehicle {
    private String registrationNumber;
    private String brand;
    private double dailyPrice;

    public Vehicle(String registrationNumber, String brand, double dailyPrice) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.dailyPrice = dailyPrice;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }
}
