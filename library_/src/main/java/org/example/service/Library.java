package org.example.service;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryInterface{
    private List<CD> cds;
    private List<DVD> dvds;
    private List<Book> books;
    private List<Periodical> periodicals;

    public Library() {
        cds = new ArrayList<>();
        dvds = new ArrayList<>();
        books = new ArrayList<>();
        periodicals = new ArrayList<>();
    }

    @Override
    public void addItem(LibraryItem item) {
        //items.add(item);
        if (item instanceof CD) {
            cds.add((CD) item);
        } else if (item instanceof DVD) {
            dvds.add((DVD) item);
        } else if (item instanceof Book) {
            books.add((Book) item);
        } else if (item instanceof Periodical) {
            periodicals.add((Periodical) item);
        }
        System.out.println(item.getTitle()+" is added to the Library!");
    }

    @Override
    public void removeItem(LibraryItem item) {
        /*
        if(item!=null){
            items.remove(item);
            System.out.println(item.getTitle()+" is removed from Library!");
        } else{
            System.out.println(item.getTitle()+ " not found in Library!");
        }*/
        boolean removed = false;
        if (item instanceof CD) {
            removed = cds.remove(item);
        } else if (item instanceof DVD) {
            removed = dvds.remove(item);
        } else if (item instanceof Book) {
            removed = books.remove(item);
        } else if (item instanceof Periodical) {
            removed = periodicals.remove(item);
        }
        if(removed) {
            System.out.println(item.getTitle() + " is removed from Library!");
        } else{
            System.out.println("Item not found: " + item.getTitle());
        }
    }

    @Override
    public void borrowItem(LibraryItem item) {
        /*if (item instanceof Periodical) {
            System.out.println("Periodicals cannot be borrowed.");
        } else if (!item.isBorrowed()) {
            item.setBorrowed(true);
            System.out.println("You have borrowed: " + item.getTitle());
        } else {
            System.out.println("Item is not available for borrowing.");
        }*/
        boolean found = false;
        if (item instanceof CD) {
            found = cds.contains(item);
        } else if (item instanceof DVD) {
            found = dvds.contains(item);
        } else if (item instanceof Book) {
            found = books.contains(item);
        } else if (item instanceof Periodical) {
            found = periodicals.contains(item);
        }

        if (!found) {
            System.out.println("Item not found: " + item.getTitle());
        } else if (item instanceof Periodical) {
            System.out.println("Periodicals cannot be borrowed.");
        } else if (!item.isBorrowed()) {
            item.setBorrowed(true);
            System.out.println("You have borrowed: " + item.getTitle());
        } else {
            System.out.println("Item is not available for borrowing: "+item.getTitle());
        }
    }

    @Override
    public void returnItem(LibraryItem item) {
        /*if (item.isBorrowed()) {
            item.setBorrowed(false);
            System.out.println("You have returned: " + item.getTitle());
        } else {
            System.out.println("This item was not borrowed.");
        }*/
        boolean found = false;
        if (item instanceof CD) {
            found = cds.contains(item);
        } else if (item instanceof DVD) {
            found = dvds.contains(item);
        } else if (item instanceof Book) {
            found = books.contains(item);
        } else if (item instanceof Periodical) {
            found = periodicals.contains(item);
        }

        if (!found) {
            System.out.println("Item not found: " + item.getTitle());
        } else if (item.isBorrowed()) {
            item.setBorrowed(false);
            System.out.println("You have returned: " + item.getTitle());
        } else {
            System.out.println("This item was not borrowed: "+item.getTitle());
        }
    }

    @Override
    public LibraryItem getListOfItems() {
        /*for(LibraryItem item : items){
            System.out.println("- " + item.getTitle() + " (" + item.getType() + ", Borrowed: " + item.isBorrowed() + ")");
        }
        return null;*/
        System.out.println("Library Items:");

        System.out.println("CDs:");
        for (CD cd : cds) {
            System.out.println("- " + cd.getTitle() + " (Borrowed: " + cd.isBorrowed() + ")");
        }

        System.out.println("DVDs:");
        for (DVD dvd : dvds) {
            System.out.println("- " + dvd.getTitle() + " (Borrowed: " + dvd.isBorrowed() + ")");
        }

        System.out.println("Books:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " (Borrowed: " + book.isBorrowed() + ")");
        }

        System.out.println("Periodicals:");
        for (Periodical periodical : periodicals) {
            System.out.println("- " + periodical.getTitle() + " (Borrowed: " + periodical.isBorrowed() + ")");
        }
        return null;

    }
}


