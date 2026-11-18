package no.usn.forelesning13.dyreparken;

public class ZooApp {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Dog("Fido"));
        zoo.addAnimal(new Cat("Mia"));
        zoo.addAnimal(new Bird("Tweety"));
        zoo.addAnimal(new Dog("Buddy"));

        try {
            zoo.addAnimal(new Cat(""));    // tomt navn
        } catch (IllegalArgumentException e) {
            System.out.println("Feil: " + e.getMessage());
        }
        try {
            zoo.addAnimal(null);           // null
        } catch (IllegalArgumentException e) {
            System.out.println("Feil: " + e.getMessage());
        }

        zoo.makeAllSounds();
        zoo.generateReport();
    }
}
