import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create LibraryDB object
        LibraryDB libraryDB = new LibraryDB();
        
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Adding some books manually to the library
        Book book1 = new Book(101, "Java Basics", "John Doe");
        Book book2 = new Book(102, "Advanced Java Programming", "Jane Smith");
        Book book3 = new Book(103, "Data Structures and Algorithms", "Michael Brown");
        Book book4 = new Book(104, "Introduction to Databases", "Alice White");

        // Add these books to the library
        libraryDB.addBook(book1);
        libraryDB.addBook(book2);
        libraryDB.addBook(book3);
        libraryDB.addBook(book4);

        // Menu to interact with the system
        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            // Make sure to handle input type properly
            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Please enter a valid choice (1-5).");
                scanner.nextLine(); // Consume invalid input
                continue;
            }

            // Handle different menu choices
            if (choice == 1) {
                // Add Book
                System.out.print("Enter Book ID: ");
                int bookID = scanner.nextInt();
                scanner.nextLine();  // Consume newline character
                System.out.print("Enter Book Title: ");
                String title = scanner.nextLine();
                System.out.print("Enter Book Author: ");
                String author = scanner.nextLine();
                
                Book book = new Book(bookID, title, author);
                libraryDB.addBook(book);
                
            } else if (choice == 2) {
                // View Books
                libraryDB.viewBooks();
                
            } else if (choice == 3) {
                // Update Book
                System.out.print("Enter Book ID to update: ");
                int bookID = scanner.nextInt();
                scanner.nextLine();  // Consume newline character
                System.out.print("Enter new Book Title: ");
                String newTitle = scanner.nextLine();
                System.out.print("Enter new Book Author: ");
                String newAuthor = scanner.nextLine();
                
                libraryDB.updateBook(bookID, newTitle, newAuthor);
                
            } else if (choice == 4) {
                // Delete Book
                System.out.print("Enter Book ID to delete: ");
                int bookID = scanner.nextInt();
                libraryDB.deleteBook(bookID);
                
            } else if (choice == 5) {
                // Exit
                System.out.println("Exiting the system.");
                break;
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }
        
        scanner.close();
    }
}
