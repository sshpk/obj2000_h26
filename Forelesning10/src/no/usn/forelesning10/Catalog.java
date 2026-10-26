package no.usn.forelesning10;

import java.util.ArrayList;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class Catalog {

	public static void main(String[] args) {

		//System.out.println(new File("bibliotek.txt").getAbsolutePath());

		ArrayList<Book> books = new ArrayList<Book>();
		//books = readBooks("bibliotek.txt");
		books = readBooksSafe("bibliotek_feil.txt");

		for(Book b:books) {
			System.out.println(b);
		}

	}
	public static ArrayList<Book> readBooks(String fileName) {
		ArrayList<Book> books = new ArrayList<Book>();
		try(Scanner in = new Scanner(new File(fileName))){
			int count = Integer.parseInt(in.nextLine().trim());
			for(int i=0; i<count; i++) {
				String [] parts = in.nextLine().split(";");
				String title = parts[0];
				Genre genre = Genre.valueOf(parts[1]);
				int pages = Integer.parseInt(parts[2]);
				Book b = new Book(title, genre, pages);
				books.add(b);	
			}

		}catch(FileNotFoundException e) {
			System.out.println("Fant ikke filen");
		}
		return books;
	}

	public static ArrayList<Book> readBooksSafe(String fileName){
		ArrayList<Book> books = new ArrayList<Book>();
		try(Scanner in = new Scanner(new File(fileName))){
			int count = Integer.parseInt(in.nextLine().trim());
			for (int i = 0; i < count; i++) {
				String line = in.nextLine();
				try {
					String[] parts = line.split(";");
					Genre genre = Genre.valueOf(parts[1]);
					int pages = Integer.parseInt(parts[2]);
					books.add(new Book(parts[0], genre, pages));
				} catch (IllegalArgumentException e) {
					System.out.println("Hoppet over: " + line);
				}
			}
		}catch(FileNotFoundException e) {
			System.out.println("Fant ikke filen");
		}
		return books;
	}
}
