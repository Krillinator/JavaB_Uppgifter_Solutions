package com.kristoffer.demo.lektion_4.puzzle_1;

import java.util.List;

public class LibraryApp {

    private List<Book> bookshelfList;

    public void addBookToShelf(Book book) {
        getBookshelfList().add(book);
    }

    public void removeAllBooksFromShelf() {
        getBookshelfList().clear();
    }

    public void removeBookFromShelf(Book book) {
        getBookshelfList().remove(book);
    }

    public List<Book> getBookshelfList() {
        return bookshelfList;
    }

    public void setBookshelfList(List<Book> bookshelfList) {
        this.bookshelfList = bookshelfList;
    }
}
