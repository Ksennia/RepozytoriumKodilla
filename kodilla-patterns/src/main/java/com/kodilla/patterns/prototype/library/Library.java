package com.kodilla.patterns.prototype.library;





import java.util.HashSet;
import java.util.Set;

public class Library extends PrototypeOfLibrary {
     private String name;
     private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonelibrary = (Library) super.clone();
        clonelibrary.books = new HashSet<>();
        for (Book book : books) {
           Book cloneBook = new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate());
            clonelibrary.getBooks().add(cloneBook);
        }
        return clonelibrary;
    }
}
