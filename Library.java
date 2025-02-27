package book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateBookCopies(String title, int newNumberOfCopies) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setNumberOfCopies(newNumberOfCopies);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public String displayBooks() {
        if (books.isEmpty()) {
            return "No books available in the library.";
        }
        StringBuilder bookList = new StringBuilder();
        for (Book book : books) {
            bookList.append(book).append("\n");
        }
        return bookList.toString();
    }

    public void modifyPrimitive(int number) {
        number += 10; // This will not affect the original number
    }

    public void modifyBook(Book book) {
        book.setNumberOfCopies(book.getNumberOfCopies() + 1); // This will affect the original book object
    }
}