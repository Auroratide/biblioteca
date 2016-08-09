package com.thoughtworks.bhamani.biblioteca;

public class Book {

    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String detailsInRow() {
        return title + " | " + author + " | " + yearPublished;
    }
}
