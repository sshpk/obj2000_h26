package no.usn.forelesning9.backup;

import java.util.Arrays;

public class LibraryTest {

	public static void main(String[] args) {
		LibraryItem kaffehuset = new Book("Kaffehuset", "Ola Nordmenn");
		LibraryItem interstellar = new Film("Interstellar", 168);

		System.out.println(kaffehuset.getLateFee(5));
		System.out.println(interstellar.getLateFee(5));
		
		LibraryItem stormen = new Book("Stormen", "Edvard Munch");
		LibraryItem nordlys = new Film("Nordlys", 80);
		
		LibraryItem [] items = {stormen, nordlys, kaffehuset};
		System.out.println(totalFee(items, 3));
		
		
		Laptop laptop = new Laptop("L-042");

		Borrowable[] all = { stormen, nordlys, laptop };
		stormen.checkOut();
		System.out.println(countAvailable(all));   // 2
		
		LibraryItem[] items2 = { stormen, kaffehuset };
		Arrays.sort(items2);
		for (LibraryItem item : items2) {
		    System.out.println(item);
		}


	}
	
	public static double totalFee(LibraryItem [] items, int daysLate) {
		double fee = 0.0;
		for(LibraryItem i: items) {
			fee+=i.getLateFee(daysLate);
		}
		return fee;
	}
	
	public static int countAvailable(
	        Borrowable[] items) {
	    int count = 0;
	    for (Borrowable b : items) {
	        if (b.isAvailable()) {
	            count++;
	        }
	    }
	    return count;
	}
}
