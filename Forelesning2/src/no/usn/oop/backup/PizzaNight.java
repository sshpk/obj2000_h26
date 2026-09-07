package no.usn.oop.backup;

import java.util.Scanner;

public class PizzaNight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hvor mange personer? ");
        int friends = input.nextInt();

        System.out.print("Hvor mange pizzastykker per person? ");
        int slicesPerPerson = input.nextInt();

        System.out.print("Hvor mange drikker per person? ");
        int drinksPerPerson = input.nextInt();

        int totalSlices = friends * slicesPerPerson;
        int totalDrinks = friends * drinksPerPerson;

        int slicesPerPizza = 8;

        double pizzaNeeded = (double) totalSlices / slicesPerPizza;

        int pizzas = 2;
        int leftoverSlices = (pizzas * slicesPerPizza) % totalSlices;

        pizzas++;
        totalDrinks += 2;

        System.out.println();
        System.out.println("----- Pizza-kveld -----");
        System.out.println("Totalt antall pizzastykker: " + totalSlices);
        System.out.println("Totalt antall drikker: " + totalDrinks);
        System.out.println("Pizzaer nødvendig: " + pizzaNeeded);
        System.out.println("Antall pizzaer: " + pizzas);
        System.out.println("Rest: " + leftoverSlices);
    }
}