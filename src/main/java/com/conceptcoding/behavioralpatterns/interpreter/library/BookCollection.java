package main.java.com.conceptcoding.behavioralpatterns.interpreter.library;

public interface BookCollection {
    LibraryIterator createIterator();
    ReverseLibraryIterator createReverseIterator();
}
