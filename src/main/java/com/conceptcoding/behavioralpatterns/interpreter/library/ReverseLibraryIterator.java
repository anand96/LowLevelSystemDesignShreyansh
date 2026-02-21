package main.java.com.conceptcoding.behavioralpatterns.interpreter.library;

import java.util.List;

public class ReverseLibraryIterator implements Iterator<Book>{

    private final List<Book> books;

    private int position;

    public ReverseLibraryIterator(List<Book> books) {
        this.books = books;
        this.position = position;
    }


    @Override
    public boolean hasNext() {
        return position >= 0 && books.get(position) != null;
    }

    @Override
    public Book next() {
        if(!hasNext()){
            return null;
        }
        return books.get(position--);
    }
}
