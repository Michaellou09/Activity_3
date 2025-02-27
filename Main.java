package book;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        String menu = """
                      Library Management System
                      1. Add Book
                      2. Update Book Copies
                      3. Display Books
                      4. Exit""";

        while (true) {
            String choice = JOptionPane.showInputDialog(menu);
            if (choice == null || choice.equals("4")) {
                break; // Exit the loop if the user chooses to exit
            }

            switch (choice) {
                case "1" -> {

                    String title = JOptionPane.showInputDialog("Enter Book Title:");
                    String author = JOptionPane.showInputDialog("Enter Author Name:");
                    String copiesStr = JOptionPane.showInputDialog("Enter Number of Copies:");
                    int numberOfCopies = Integer.parseInt(copiesStr);
                    library.addBook(new Book(title, author, numberOfCopies));
                    JOptionPane.showMessageDialog(null, "Book added successfully!");
                }

                case "2" -> {
                    String bookTitle = JOptionPane.showInputDialog("Enter Book Title to Update:");
                    String newCopiesStr = JOptionPane.showInputDialog("Enter New Number of Copies:");
                    int newNumberOfCopies = Integer.parseInt(newCopiesStr);
                    library.updateBookCopies(bookTitle, newNumberOfCopies);
                    JOptionPane.showMessageDialog(null, "Book copies updated successfully!");
                }

                case "3" -> {
                    String booksList = library.displayBooks();
                    JOptionPane.showMessageDialog(null, booksList);
                }

                default ->
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
    }
}
