package no.usn.forelesning12.dyreparken;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Kvitre";
    }
}
