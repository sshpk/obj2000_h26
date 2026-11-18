package no.usn.forelesning13.dyreparken;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Bjeff";
    }
}
