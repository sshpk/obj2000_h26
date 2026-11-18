package no.usn.forelesning13.bilutleie;

public class Customer {
    private String customerId;
    private String name;
    private String phoneNumber;

    public Customer(String customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + " (kunde " + customerId + ", tlf. " + phoneNumber + ")";
    }
}
