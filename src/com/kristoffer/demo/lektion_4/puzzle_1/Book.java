package com.kristoffer.demo.lektion_4.puzzle_1;

import java.util.Random;

public class Book {

    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

        isbn = String.valueOf(new Random().nextInt(1_000_000, 9_000_000) + 1 );
        System.out.println(isbn);

        // System.out.println(isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
