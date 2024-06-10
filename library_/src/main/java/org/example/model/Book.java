package org.example.model;

public class Book extends LibraryItem{
    public Book(String title) {
        super(title);
    }

    public String getType() {
        return "Book";
    }
}
