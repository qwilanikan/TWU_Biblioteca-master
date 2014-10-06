package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ListBooksCommandTest {


    @Test
    public void shouldListBooksWhenExecute(){


        Library library = mock(Library.class);
        ListBooksCommand listBooksCommand = new ListBooksCommand(library);

        listBooksCommand.execute();

        verify(library).listBooks();

    }
}