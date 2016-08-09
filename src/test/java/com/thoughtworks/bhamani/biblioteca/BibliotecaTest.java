package com.thoughtworks.bhamani.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BibliotecaTest {

    @Test
    public void shouldSeeWelcomeMessageWhenStarted() {
        PrintStream printStream = mock(PrintStream.class);
        Biblioteca biblioteca = new Biblioteca(printStream);
        biblioteca.start();
        verify(printStream).println("Welcome!");
    }
}
