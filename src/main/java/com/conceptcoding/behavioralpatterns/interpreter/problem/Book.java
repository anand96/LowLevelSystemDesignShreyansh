package main.java.com.conceptcoding.behavioralpatterns.interpreter.problem;

import java.util.List;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static List<Book> getBooks() {
        List<Book> books = List.of(
                new Book("To Kill a Mockingbird", "Harper Lee", "978-0-74-7356-5"),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", "778-0-24-7156-5"),
                new Book("The Catcher in the Rye", "J.D. Salinger", "333-0-28-7446-8"),
                new Book("The Hobbit", "J.R.R. Tolkien", "783-0-14-1951-8"),
                new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "183-0-12-1491-8"),
                new Book("Pride and Prejudice", "Jane Austen", "289-0-12-1678-8")
        );
        return books;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
