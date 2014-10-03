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
        when(book1.getFormattedDetails()).thenReturn("aaa");
        book2 = mock(Book.class);
        when(book2.getFormattedDetails()).thenReturn("bbb");
    }

    @Test
    public void shouldListOneBookWhenLibraryContainsOneBook() {
        books.add(book1);
        library = new Library(printStream, books);

        library.listBooks();

        verify(printStream).println("aaa");
    }

    @Test
    public void shouldListTwoBooksWhenLibraryContainsTwoBooks() {
        books.add(book1);
        books.add(book2);
        library = new Library(printStream, books);

        library.listBooks();

        verify(printStream).println("aaa");
        verify(printStream).println("bbb");
    }

    @Test
    public void shouldPrintTwoBooksWithDetailsWhenLibraryContainsTwoBooksWithDetails() {


        Book book1 = mock(Book.class);
        when(book1.getFormattedDetails()).thenReturn(String.format("%-40s %-20s %-4s", "Agile Samurai", "someone", "1950"));
        Book book2 = mock(Book.class);
        when(book2.getFormattedDetails()).thenReturn(String.format("%-40s %-20s %-4s", "clean code", "somebody", "1999"));
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book1);
        bookList.add(book2);
        Library lib = new Library(printStream, bookList);

        lib.listBooks();

        verify(printStream).println(String.format("%-40s %-20s %-4s", "Agile Samurai", "someone", "1950") + "\n"
                + String.format("%-40s %-20s %-4s", "clean code", "somebody", "1999"));


    }

}
