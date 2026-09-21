package no.usn.forelesning6.backup;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Kari", 93.0);
		Book b = new Book("Kaffehuset", "Ola Nordmenn");
		
		s1.borrowBook(b);
		System.out.println(s1.getBorrowedBook().getTitle());

	}

}
