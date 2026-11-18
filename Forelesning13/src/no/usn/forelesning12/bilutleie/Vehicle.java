package no.usn.forelesning12.bilutleie;

public class Vehicle {
    private String registrationNumber;
    private String brand;
    private double dailyPrice;

    public Vehicle(String registrationNumber, String brand,
                   double dailyPrice) {
        if (dailyPrice <= 0) {
            throw new IllegalArgumentException("Prisen må være over 0.");
        }
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.dailyPrice = dailyPrice;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    @Override
    public String toString() {
        return brand + " (" + registrationNumber + "), " + dailyPrice + " kr per dag";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Vehicle)) {
            return false;
        }
        Vehicle other = (Vehicle) o;
        return registrationNumber.equals(other.registrationNumber);
    }
}
