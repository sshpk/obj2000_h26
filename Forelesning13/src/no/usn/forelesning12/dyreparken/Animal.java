package no.usn.forelesning12.dyreparken;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Dyret må ha et navn.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();
}
