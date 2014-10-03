package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by alisonpolton-simon on 9/30/14.
 */
public class LibraryTestDrive {
    PrintStream printStream;
    Library library;
    List<Book> books;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        books = new ArrayList<Book>();
        book1 = mock(Book.class);
        book2 = mock(Book.class);
    }

    @Test
    public void shouldListOneBookWhenLibraryContainsOneBook() {
        when(book1.getFormattedDetails()).thenReturn("aaa");
        books.add(book1);
        library = new Library(printStream, books);

        library.listBooks();

        verify(printStream).println("aaa");
    }

    @Test
    public void shouldListTwoBooksWhenLibraryContainsTwoBooks() {
        books.add(book1);
        when(book1.getFormattedDetails()).thenReturn("aaa");
        books.add(book2);
        when(book2.getFormattedDetails()).thenReturn("bbb");

        library = new Library(printStream, books);

        library.listBooks();

        verify(printStream).println("aaa");
        verify(printStream).println("bbb");
    }

}
