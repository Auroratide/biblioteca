package com.thoughtworks.bhamani.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Biblioteca {
    private PrintStream printStream;
    private ArrayList<String> library;

    public Biblioteca(PrintStream printStream, ArrayList<String> initialLibrary) {
        this.printStream = printStream;
        this.library = initialLibrary;
    }

    public void start() {
        printStream.println("Welcome!");
        printLibraryList();
    }

    private void printLibraryList() {
        for(String book : library)
            printStream.println(book);
    }
}
