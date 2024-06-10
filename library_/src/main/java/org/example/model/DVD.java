package org.example.model;

public class DVD extends LibraryItem{
    public DVD(String title) {
        super(title);
    }

    public String getType() {
        return "DVD";
    }
}
