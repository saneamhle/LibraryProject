package org.example.model;

public class Periodical extends LibraryItem{
    public Periodical(String title) {
        super(title);
    }

    public String getType() {
        return "Periodical";
    }
}
