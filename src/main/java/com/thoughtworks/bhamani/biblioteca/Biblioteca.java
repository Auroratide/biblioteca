package com.thoughtworks.bhamani.biblioteca;

import java.io.PrintStream;

public class Biblioteca {
    private PrintStream printStream;

    public Biblioteca(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void start() {
        System.out.println("Welcome!");
    }
}
