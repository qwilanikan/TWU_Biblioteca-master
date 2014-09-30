package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by alisonpolton-simon on 9/30/14.
 */
public class LibraryTestDrive {

    @Test
    public void shouldPrintEmptyListWhenLibraryIsEmpty() {
        //Arrange
        String books = new String();
        Library library = new Library(books);

        //Action
        String result = library.listBooks();

        //Assert
        assertEquals(result, "");

    }

    @Test
    public void shouldPrintOneBookWhenLibraryHasOneBook() {
        //Arrange
        String books = "Agile Samurai";
        Library library = new Library(books);

        //Action
        String result = library.listBooks();

        //Assert
        assertEquals(result, "Agile Samurai");

    }
    @Test
    public void shouldPrintTwoBooksWhenLibraryHasTwoBooks() {
        //Arrange
        String books = "Agile Samurai, Hunger Games";
        Library library = new Library(books);

        //Action
        String result = library.listBooks();

        //Assert
        assertEquals(result, "Agile Samurai, Hunger Games");

    }


}
