package com.thoughtworks.bhamani.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BibliotecaTest {

    private PrintStream printStream;
    private Biblioteca biblioteca;

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
        biblioteca.printLibraryList();
        verify(printStream).println("Book 3");
    }

    private ArrayList<String> makeEmptyLibrary() {
        return new ArrayList<String>();
    }

    private ArrayList<String> makePopulatedLibrary() {
        ArrayList<String> library = makeEmptyLibrary();
        library.add("Book 1");
        library.add("Book 2");
        library.add("Book 3");
        return library;
    }
}
