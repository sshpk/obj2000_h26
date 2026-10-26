package no.usn.forelesning10;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
//		String input = "tre";
//		try {
//			int pages = Integer.parseInt(input);
//			System.out.println(pages);
//		}catch(NumberFormatException e) {
//			//System.out.println("Ikke et tall: "+input);
//			System.out.println(e.getMessage());
//		}
		
//		try {
//			int pages = Integer.parseInt("tre");
//			Book b = new Book("Stormen", 0);
//	
//		}catch(RuntimeException e) {
//			System.out.println(e.getMessage());
//		}

//		Book[] books = new Book[100];
//		int count = 0;
//		
//		Book stormen = new Book("Stormen", 350);
//		books[count] = stormen;
//		count++;
//		
//		System.out.println(books[0]);
		
//		ArrayList<Book> books = new ArrayList<Book>();
//		Book stormen = new Book("Stormen", 350);
//		Book ringes_herre = new Book("Ringes herre", 1000);
//		Book farenheit451 = new Book("Farenheit 451", 500);
//		
//		books.add(stormen);
//		books.add(ringes_herre);
//		books.add(farenheit451);
//		//System.out.println(books.get(0));
//		
//		//books.remove(0);
//		
//		System.out.println(books.size()+ " bøker");
//		for(Book b:books) {
//			System.out.println(b.toString());
//		}
		
//		ArrayList books2 = new ArrayList();
//		
//		books2.add(stormen);
//		books2.add("Hei!");
//		
//		Book b = (Book)books2.get(1);
//		System.out.println(b.toString());
		
		
//		ArrayList<Integer> pages = new ArrayList<Integer>();
//		pages.add(350);
//		pages.add(120);
//		System.out.println(pages.size());
		
		ArrayList<Book> books = new ArrayList<Book>();
		
		Book stormen = new Book("Stormen",Genre.ROMAN, 350);
		Book havet = new Book("Havet",Genre.FAKTA, 200);
		Book morktVann = new Book("Mørkt vann",Genre.KRIM, 500);
		
		books.add(stormen);
		books.add(havet);
		books.add(morktVann);
	//	books.add("");
		
	//	System.out.println(books.get(2).toString());
		
		Collections.sort(books);
		
		for(Book b:books) {
			System.out.println(b);
		}
		
//		for(Genre g:Genre.values()) {
//			System.out.println(g);
//		}
//		
//		Genre g = Genre.valueOf("Krim");
//		System.out.println(g);
	}

}
