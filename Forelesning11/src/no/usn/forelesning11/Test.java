package no.usn.forelesning11;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
//		MyList<String> titles = new MyArrayList<String>();
//		
//		titles.add("Stormen");
//		titles.add("Havet");
//		titles.add("Mørkt vann");
//		titles.add("Trollskogen");
//		titles.add("Nordlys");
//		
//		titles.addFirst("Dypet");
//		
//		for(int i=0; i<titles.size(); i++) {
//			System.out.println(titles.get(i));
//		}

		
		
//		ArrayList<String> titles2 = new ArrayList<String>();
//		titles2.add("Stormen");
//		titles2.add("Havet");
//		titles2.add("Trollskogen");
//		
//		Iterator<String> it = titles2.iterator();
//		while(it.hasNext()) {
//			String s = it.next();
//			System.out.println(s.toUpperCase());
//		}
		
		
		MyLinkedList<String> titles = new MyLinkedList<String>();
		titles.add("Havet");
		titles.add("Stormen");
		titles.addFirst("Trollskogen");
		
//		for(int i=0; i<titles.size(); i++) {
//			System.out.println(titles.get(i));
//		}
		
		for(String s:titles) {
			System.out.println(s);
		}
		
		Iterator<String> it = titles.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s.toUpperCase());
		}
	}

}
