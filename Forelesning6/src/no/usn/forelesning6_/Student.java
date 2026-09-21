package no.usn.forelesning6_;

public class Student {
	private String name;
	private double score;
	
	private Book borrowedBook;
	
	public Student(String name, double score) {
		this.name = name;
		this.score = score;
		
		this.borrowedBook = null;
	}
	public String getName() {
		return name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public void borrowBook(Book book) {
		book.checkout();
		borrowedBook = book;
	}
	
	public void returnBook() {
		borrowedBook.returnBook();
		borrowedBook = null;
	}
	
	public Book getBorrowedBook() {
		return borrowedBook;
	}
}
