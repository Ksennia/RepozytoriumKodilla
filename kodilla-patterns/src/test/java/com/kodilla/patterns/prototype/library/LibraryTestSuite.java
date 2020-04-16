package com.kodilla.patterns.prototype.library;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(5).
                forEach(n -> library.getBooks().add(
                        new Book("Title " + n, "Author " + n, LocalDate.of(1999,03,01))));

        //create shallowClone for Library
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library clone 1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Create deep clone of Library
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("DadyClone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        Book book = new Book("New title", "Same author", LocalDate.of(2005, 04, 19));
        library.getBooks().add(book);
       // library.getBooks().remove(book);
        //Then
        Assert.assertEquals(6, library.getBooks().size());
        Assert.assertEquals(6, cloneLibrary.getBooks().size());
        Assert.assertEquals(5, deepCloneLibrary.getBooks().size());

        //Show
        System.out.println("Library " + library);
        System.out.println("Clone library " + cloneLibrary);
        System.out.println("Dady clone " + deepCloneLibrary);

    }
}
