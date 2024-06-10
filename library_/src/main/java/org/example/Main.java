package org.example;

import org.example.model.CD;
import org.example.model.DVD;
import org.example.model.LibraryItem;
import org.example.model.Periodical;
import org.example.service.Library;
import org.example.service.LibraryInterface;

public class Main {
    public static void main(String[] args) {
        LibraryInterface library = new Library();

        LibraryItem cd1 = new CD("How to play Chess?");
        LibraryItem dvd1 = new DVD("LOL");
        LibraryItem periodical1 = new Periodical("Times of India");
        LibraryItem book1 = new CD("Anne of the Green");
        LibraryItem book2 = new CD("Harry Potter");

        library.addItem(cd1);
        library.addItem(dvd1);
        library.addItem(periodical1);
        library.addItem(book1);

        // Demonstrate borrowing items
        library.borrowItem(cd1);
        library.borrowItem(book1);
        library.borrowItem(cd1);
        library.borrowItem(periodical1); // Should print that periodicals cannot be borrowed

        // Demonstrate returning an item
        library.returnItem(cd1);

        // Demonstrate removing an item
        library.removeItem(book2);

        library.getListOfItems();
    }
}
