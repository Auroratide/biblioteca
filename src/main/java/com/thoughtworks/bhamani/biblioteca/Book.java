package com.thoughtworks.bhamani.biblioteca;

import java.io.PrintStream;

public class Book {

    private String title;
    private String author;
    private int yearPublished;
    private PrintStream printStream;

    public Book(String title, String author, int yearPublished, PrintStream printStream) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.printStream = printStream;
    }

    public String detailsInRow() {
        return title + " | " + author + " | " + yearPublished;
    }

    public void print() {
        printStream.println(detailsInRow());
    }
}
