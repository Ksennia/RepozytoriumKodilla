package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookInHandsOfUser {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    void testListOfBookOfUserRentZero() {
        //Given
        BookLibrary bookLibrary = mock(BookLibrary.class);
        LibraryUser libraryUser = new LibraryUser("Name", "LastName", "111111");
        List<Book> resultListOfBooks = new ArrayList<>();
        when(bookLibrary.listBooksInHandsOf(libraryUser))
                .thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBook = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(0, theListOfBook.size());


    }

    @Test
    void testListBookOfUserRentOne() {
        //Given
        BookLibrary bookLibrary = mock(BookLibrary.class);
        LibraryUser libraryUser = new LibraryUser("Name", "LastName", "111111");
        List<Book> resultListOfBooks = generateListOfNBooks(1);
        when(bookLibrary.listBooksInHandsOf(libraryUser))
                .thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBook = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(1, theListOfBook.size());

    }

    @Test
    void testListBookOfUserRentFive() {
        //Given
        // LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = mock(BookLibrary.class);
        LibraryUser libraryUser = new LibraryUser("Name", "LastName", "111111");
        List<Book> resultListOfBooks = generateListOfNBooks(5);
        when(bookLibrary.listBooksInHandsOf(libraryUser))
                .thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBook = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(5, theListOfBook.size());
    }
}
