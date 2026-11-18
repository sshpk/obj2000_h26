package no.usn.forelesning12.dyreparken;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Bjeff";
    }
}
