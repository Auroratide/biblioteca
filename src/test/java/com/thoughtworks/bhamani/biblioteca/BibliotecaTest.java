package com.thoughtworks.bhamani.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BibliotecaTest {

    private PrintStream printStream;
    private Biblioteca biblioteca;

    private ArrayList<Book> makeEmptyLibrary() {
        return new ArrayList<Book>();
    }

    private ArrayList<Book> makePopulatedLibrary() {
        ArrayList<Book> library = makeEmptyLibrary();
        library.add(new Book("Book 1", "John Doe", 2016));
        library.add(new Book("Book 2", "John Deer", 2015));
        library.add(new Book("Book 3", "Mr. Mime", 2013));
        return library;
    }

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        biblioteca = new Biblioteca(printStream, makePopulatedLibrary());

    }

    @Test
    public void shouldSeeWelcomeMessageWhenStarted() {
        biblioteca.start();
        verify(printStream).println("Welcome!");
    }

    @Test
    public void shouldSeeListOfBooksInLibraryAfterWelcome() {
        biblioteca.start();
        verify(printStream).println("Book 1");
        verify(printStream).println("Book 2");
        verify(printStream).println("Book 3");
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
