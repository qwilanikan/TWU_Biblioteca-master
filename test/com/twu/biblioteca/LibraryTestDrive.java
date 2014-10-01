package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by alisonpolton-simon on 9/30/14.
 */
public class LibraryTestDrive {
    PrintStream printStream;
    Library library;
    List<String> books;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        books = new ArrayList<String>();
    }

    @Test
    public void shouldListOneBookWhenLibraryContainsOneBook() {
        books.add("Agile Samurai");
        library = new Library(printStream, books);

        library.listBooks();

        verify(printStream).println("Agile Samurai");
    }

    @Test
    public void shouldListTwoBooksWhenLibraryContainsTwoBooks() {
        books.add("Agile Samurai");
        books.add("Clean Code");
        library = new Library(printStream, books);

        library.listBooks();

        verify(printStream).println("Agile Samurai");
        verify(printStream).println("Clean Code");
    }

}
