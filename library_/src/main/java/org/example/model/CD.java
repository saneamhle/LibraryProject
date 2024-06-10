package org.example.model;

public class CD extends LibraryItem{
    public CD(String title) {
        super(title);
    }

    public String getType() {
        return "CD";
    }
}
