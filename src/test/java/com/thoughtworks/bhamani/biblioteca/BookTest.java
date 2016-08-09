package com.thoughtworks.bhamani.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest {

    @Test
    public void shouldPrintDetailsWhenPrinting() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        Book book = new Book("title", "author", 1991, printStream);

        book.print();

        verify(printStream).println("title | author | 1991");

    }
}