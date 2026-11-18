package no.usn.forelesning12.dyreparken;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Dyret kan ikke være null.");
        }
        animals.add(animal);
    }

    public void makeAllSounds() {
        for (Animal a : animals) {
            System.out.println(a.getName() + " sier: " + a.makeSound());
        }
    }

    public void generateReport() {
        int dogs = 0;
        int cats = 0;
        int birds = 0;
        for (Animal a : animals) {
            if (a instanceof Dog) {
                dogs++;
            } else if (a instanceof Cat) {
                cats++;
            } else if (a instanceof Bird) {
                birds++;
            }
        }
        System.out.println("Rapport over dyreparken:");
        System.out.println("Hunder: " + dogs);
        System.out.println("Katter: " + cats);
        System.out.println("Fugler: " + birds);
        System.out.println("Totalt: " + animals.size());
    }
}
