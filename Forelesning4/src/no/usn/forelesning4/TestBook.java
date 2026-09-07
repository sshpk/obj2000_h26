package no.usn.forelesning4;

public class TestBook {
	public static void main(String[] args) {
		Book b1 = new Book("Kaffehuset", "Ola Nordmann");
		Book b2 = new Book("Havet", "Kari Hansen");
		 
		b1.checkOut();
		 
		if (b1.isAvailable()) {
		    System.out.println(b1.getTitle() + " er ledig");
		} else {
		    System.out.println(b1.getTitle() + " er utlånt");
		}

	}
}
