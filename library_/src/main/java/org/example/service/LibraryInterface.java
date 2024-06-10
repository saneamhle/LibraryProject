package org.example.service;

import org.example.model.LibraryItem;

public interface LibraryInterface {

    void addItem(LibraryItem item);

    void removeItem(LibraryItem ItemName);
    void borrowItem(LibraryItem ItemName);
    void returnItem(LibraryItem ItemName);
    LibraryItem getListOfItems();
}
