package no.usn.forelesning13.dyreparken;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Mjau";
    }
}
