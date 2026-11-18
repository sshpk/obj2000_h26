package no.usn.forelesning13.bilutleie;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Car car = new Car("XY99999", "Skoda", 0, 5);
            System.out.println(car);
        } catch (IllegalArgumentException e) {
            System.out.println("Feil: " + e.getMessage());
        }
    }
}
