package no.usn.forelesning13.dyreparken;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Kvitre";
    }
}
