package no.usn.forelesning4;

public class Book {
   private String title;
   private String author;
   private boolean available;
   public Book(String title, String newAuthor) {
        this.title = title;
        author = newAuthor;
        available = true;
    }
   public void checkOut() {
        if (available) {
            available = false;
        }
    }
   public void returnBook() {
        available = true;
    }
   
   public String getTitle() {
	   return title;
   }
   
   public String getAuthor() {
	   return author;
   }
   public boolean isAvailable() {
	   return available;
   }
}