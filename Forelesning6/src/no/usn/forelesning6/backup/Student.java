package no.usn.forelesning6.backup;

public class Student {
	private String name;
	private double score;
	private Book borrowedBook;
	
	public Student(String name, double score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public double getScore() {
		return score;
	}
    public void borrowBook(Book book) {
        book.checkOut();
        borrowedBook = book;
    }
    public void returnBorrowedBook() {
        borrowedBook.returnBook();
        borrowedBook = null;
    }
    public Book getBorrowedBook() {
        return borrowedBook;
    }
}
