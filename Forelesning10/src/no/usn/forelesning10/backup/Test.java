package no.usn.forelesning10.backup;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
//		String input = "tre";
//		int  pages = Integer.parseInt(input);
//		System.out.println("Sider: "+pages);
		
//		String input = "tre";
//		try {
//			int pages = Integer.parseInt(input);
//			System.out.println("Sider: "+pages);
//
//		}catch(NumberFormatException e) {
//			System.out.println("Ikke et tall: "+input);
//		}
		
//		try {
//		    Book b = new Book("Tom bok", 0);
//		} catch (IllegalArgumentException e) {
//		    System.out.println(e.getMessage());   // Sider må være over 0, fikk 0
//		}
		
//		Book stormen = new Book("Stormen", 100);
//		Book[] books = new Book[100];
//		int count = 0;
//
//		books[count] = stormen;
//		count++;
//
//		System.out.println(books[0]);
//		System.out.println(count);
		
//		ArrayList<Book> books = new ArrayList<>();
//
//		books.add(stormen);
//
//		System.out.println(books.get(0));
//		System.out.println(books.size());
//		books.remove(0);   // listen krymper
//
//		for(Book b:books) {
//			System.out.println(b);
//		}
		
//		ArrayList<Book> list = new ArrayList<>();
//		list.add(stormen);
//	//	list.add("hei");     // lov!
//
//		Book b = (Book) list.get(0);
//		// ClassCastException
//		// når programmet kjører

//		Shelf<Book> books = new Shelf<>();
//		books.add(stormen);
//		
//		Book first = books.get(0);
//		System.out.println(first);
		
//		Book stormen = new Book("Stormen", Genre.ROMAN, 350);
//		Book morktVann = new Book("Mørkt vann", Genre.KRIM, 280);
		
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("Stormen", Genre.ROMAN, 350));
		books.add(new Book("Havet", Genre.FAKTA, 200));
		books.add(new Book("Mørkt vann", Genre.KRIM, 280));
		Collections.sort(books);

		for (Book b : books) {
		    System.out.println(b);
		}
		// Havet (FAKTA, 200 s.)
		// Mørkt vann (KRIM, 280 s.)
		// Stormen (ROMAN, 350 s.)

	}

}
