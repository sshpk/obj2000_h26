package no.usn.forelesning13.bilutleie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {          // op3 b
        Scanner in = new Scanner(System.in);
        System.out.print("Hvor mange tall? ");
        int n = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Tall " + (i + 1) + ": ");
            numbers.add(in.nextInt());
        }
        Collections.sort(numbers);
        System.out.println("Sortert: " + numbers);
    }
}
