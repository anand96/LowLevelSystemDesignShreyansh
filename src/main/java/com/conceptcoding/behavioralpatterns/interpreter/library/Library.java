package main.java.com.conceptcoding.behavioralpatterns.interpreter.library;

import java.util.List;

public class Library implements BookCollection{

    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }


    @Override
    public LibraryIterator createIterator() {
        return new LibraryIterator(books);
    }

    @Override
    public ReverseLibraryIterator createReverseIterator() {
        return new ReverseLibraryIterator(books);
    }
}
