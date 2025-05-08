// LibraryDB.java
import java.util.ArrayList;
import java.util.List;

public class LibraryDB {
    private List<Book> books;

    // Constructor
    public LibraryDB() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    // View all books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Update book details by bookID
    public void updateBook(int bookID, String newTitle, String newAuthor) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                System.out.println("Book updated: " + book);
                return;
            }
        }
        System.out.println("Book not found with ID: " + bookID);
    }

    // Delete a book by bookID
    public void deleteBook(int bookID) {
        books.removeIf(book -> book.getBookID() == bookID);
        System.out.println("Book with ID " + bookID + " deleted.");
    }
}
