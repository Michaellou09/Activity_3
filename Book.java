package book;

public class Book {
    private final String title;
    private final String author;
    private int numberOfCopies;

    public Book(String title, String author, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.numberOfCopies = numberOfCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Copies: " + numberOfCopies;
    }
}