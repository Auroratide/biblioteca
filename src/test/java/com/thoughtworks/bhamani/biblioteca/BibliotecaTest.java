package com.thoughtworks.bhamani.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class BibliotecaTest {

    private PrintStream printStream;
    private Biblioteca biblioteca;
    private Book book1;
    private Book book2;
    private Book book3;

    private ArrayList<Book> makeEmptyLibrary() {
        return new ArrayList<Book>();
    }

    private ArrayList<Book> makePopulatedLibrary() {
        ArrayList<Book> library = makeEmptyLibrary();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        return library;
    }

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        biblioteca = new Biblioteca(printStream, makePopulatedLibrary());

        book1 = mock(Book.class);
        book2 = mock(Book.class);
        book3 = mock(Book.class);
    }

    @Test
    public void shouldSeeWelcomeMessageWhenStarted() {
        biblioteca.start();
        verify(printStream).println("Welcome!");
    }

    @Test
    public void shouldSeeListOfBooksInLibraryAfterWelcome() {
        biblioteca.start();

        verify(book1).print();
        verify(book2).print();
        verify(book3).print();
    }

    @Test
    public void shouldSeeBookDetailsWhenBookListIsPrinted() {
        String title = "Book 1";
        String author = "John Doe";
        int yearPublished = 2016;
        String details = title + " | " + author + " | " + yearPublished;
        biblioteca.start();
        verify(printStream).println(details);
    }


}
