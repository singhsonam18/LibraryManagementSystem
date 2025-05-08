// Book.java
public class Book {
  private int bookID;
  private String title;
  private String author;

  // Constructor
  public Book(int bookID, String title, String author) {
      this.bookID = bookID;
      this.title = title;
      this.author = author;
  }

  // Getters and Setters
  public int getBookID() {
      return bookID;
  }

  public void setBookID(int bookID) {
      this.bookID = bookID;
  }

  public String getTitle() {
      return title;
  }

  public void setTitle(String title) {
      this.title = title;
  }

  public String getAuthor() {
      return author;
  }

  public void setAuthor(String author) {
      this.author = author;
  }

  // ToString method for displaying Book info
  @Override
  public String toString() {
      return "BookID: " + bookID + ", Title: " + title + ", Author: " + author;
  }
}
