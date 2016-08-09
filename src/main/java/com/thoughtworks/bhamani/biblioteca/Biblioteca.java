package com.thoughtworks.bhamani.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Biblioteca {
    private PrintStream printStream;
    private ArrayList<Book> library;

    public Biblioteca(PrintStream printStream, ArrayList<Book> initialLibrary) {
        this.printStream = printStream;
        this.library = initialLibrary;
    }

    public void start() {
        printStream.println("Welcome!");
        for(Book book : library){
            book.print();
        }
    }

}
