package no.usn.forelesning10.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Quiz {

	public static void main(String[] args) {
		//Q1
		//		String[] input = {"12", "tolv", "7"};
		//		int sum = 0;
		//		for (String s : input) {
		//		    try {
		//		        sum = sum + Integer.parseInt(s);
		//		        System.out.print("+");
		//		    } catch (NumberFormatException e) {
		//		        System.out.print("x");
		//		    }
		//		}
		//		System.out.println(" " + sum);

		//Q2
		//		ArrayList<Book> books = new ArrayList<>();
		//		try {
		//		    books.add(new Book("Stormen", 350));
		//		    books.add(new Book("Tom bok", 0));
		//		    books.add(new Book("Havet", 200));
		//		} catch (IllegalArgumentException e) {
		//		    System.out.println(e.getMessage());
		//		}
		//		System.out.println(books.size());

		//Q4
		//		ArrayList<String> titles = new ArrayList<>();
		//		titles.add("Stormen");
		//		titles.add("Havet");
		//		titles.add("Nordlys");
		//		titles.remove(0);
		//		System.out.println(titles.size() + " " + titles.get(0));

		//Q5
		//		Shelf<String> names = new Shelf<>();
		//		names.add("Kari");
		//		names.add("Ola");
		//		
		//		String name = names.get(0);
		//		int n = names.size();
		//		names.add(42);
		//		Shelf<Integer> numbers = new Shelf<Integer>();

		//Q6
		//		String[] input = {"KRIM", "Roman", "BARN"};
		//		int count = 0;
		//		for (String s : input) {
		//		    try {
		//		        Genre g = Genre.valueOf(s);
		//		        count++;
		//		    } catch (IllegalArgumentException e) {
		//		        System.out.print(s + " ");
		//		    }
		//		}
		//		System.out.println(count);

		//Q7
		//		ArrayList<Book> books = new ArrayList<>();
		//		books.add(new Book("Stormen", Genre.ROMAN, 350));
		//		books.add(new Book("Havet", Genre.FAKTA, 200));
		//		books.add(new Book("Trollskogen", Genre.BARN, 120));
		//		books.add(new Book("Mørkt vann", Genre.KRIM, 280));
		//		Collections.sort(books);
		//		System.out.println(books.get(0).getTitle());

		//Q8
		//		String fileName = "bibliotek.txt";
		//		try (Scanner in = new Scanner(new File(fileName))) {
		//			int count = in.nextInt();
		//			String line = in.nextLine();
		//			System.out.println("[" + line + "]");
		//		} catch (FileNotFoundException e) {
		//			System.out.println("Fant ikke filen: " + fileName);
		//		}

		//Q9
//		String fileName = "filmer.txt";
//		ArrayList<Film> films = new ArrayList<>();
//		try (Scanner in = new Scanner(new File(fileName))) {
//			int count = Integer.parseInt(in.nextLine().trim());
//			for (int i = 0; i < count; i++) {
//			    String line = in.nextLine();
//			    try {
//			        String[] parts = line.split(";");
//			        FilmGenre genre = FilmGenre.valueOf(parts[1]);
//			        int minutes = Integer.parseInt(parts[2]);
//			        films.add(new Film(parts[0], genre, minutes));
//			    } catch (NumberFormatException e) {
//			        System.out.println("Hoppet over: " + line);
//			    }
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("Fant ikke filen: " + fileName);
//		}
		
	}

}
