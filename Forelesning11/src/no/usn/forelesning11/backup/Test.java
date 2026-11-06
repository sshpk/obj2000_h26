package no.usn.forelesning11.backup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {
//		MyArrayList<String> titles = new MyArrayList<String>();
//		titles.add("Stormen");
//		titles.add("Havet");
//		titles.add("Mørkt vann");
//		titles.add("Trollskogen");
//
//		titles.addFirst("Dypt");
//
//		for(int i=0; i<titles.size(); i++) {
//			System.out.println(titles.get(i));
//		}	
		
		MyLinkedList<String> titles = new MyLinkedList<String>();
		titles.add("Stormen");
		titles.add("Havet");
		titles.add("Mørkt vann");
		titles.add("Trollskogen");
		
		titles.addFirst("Dypt");
		
//		for(int i=0; i<titles.size(); i++) {
//			System.out.println(titles.get(i));
//		}	
		for(String s:titles) {
			System.out.println(s);
		}
		
		Queue<String> reservations = new LinkedList<>();
		reservations.offer("Kari");
		reservations.offer("Ola");
		reservations.offer("Per");

		System.out.println(reservations.peek());   // Kari – først i køen
		System.out.println(reservations.poll());   // Kari – og fjernes
		System.out.println(reservations);          // [Ola, Per]
		
		ArrayList<String> titles2 = new ArrayList<>();
		titles2.add("Stormen");
		titles2.add("Havet");
		titles2.add("Trollskogen");

		Iterator<String> it = titles2.iterator();
		while (it.hasNext()) {
		    String t = it.next();
		    System.out.println(t.toUpperCase());
		}


	}
}
