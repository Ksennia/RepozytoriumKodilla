package com.kodilla.kodillapatterns2.adapter.library;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedian() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("author", "title", 2005, "signature0"));
        books.add(new Book("author", "title", 2000, "signature0"));
        books.add(new Book("author", "title", 2003, "signature0"));
        books.add(new Book("author", "title", 1989, "signature0"));
        books.add(new Book("author", "title", 2001, "signature0"));
        books.add(new Book("author", "title", 2011, "signature0"));
        books.add(new Book("author", "title", 2005, "signature0"));
        books.add(new Book("author", "title", 2009, "signature0"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int medianYears = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(medianYears, 2005);
    }
}
